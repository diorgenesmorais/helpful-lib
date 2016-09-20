package com.dmsystem.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Documentar a quantidade de casas decimais.
 * 
 * @author Diorgenes Morais
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Scale {

	String value() default "2";
}
