package com.dmsystem.utils;

import static com.dmsystem.utils.Regions.*;

/**
 * {@code UFBrasil} representa as Unidades da Federação do Brasil.
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public enum UFBrasil {

	AC("Acre", "Rio Branco", NORTE), 
	AL("Alagoas", "Maceió", NORDESTE), 
	AP("Amapá", "Macapá", NORTE), 
	AM("Amazonas", "Manaus", NORTE), 
	BA("Bahia", "Salvador", NORDESTE), 
	CE("Ceará", "Fortaleza", NORDESTE), 
	DF("Distrito Federal", "Brasilia", CENTRO_OESTE), 
	ES("Espiríto Santo","Vitória", SUDESTE), 
	GO("Goiás", "Goiânia", CENTRO_OESTE), 
	MA("Maranhão", "São Luis", NORDESTE), 
	MT("Mato Grosso", "Cuiabá", CENTRO_OESTE), 
	MS("Mata Grosso do Sul", "Campo Grande", CENTRO_OESTE), 
	MG("Minas Gerais", "Belo Horizonte", SUDESTE), 
	PA("Pará", "Belém", NORTE), 
	PB("Paraíba", "João Pessoa", NORDESTE), 
	PR("Paraná", "Curitiba", SUL), 
	PE("Pernambuco", "Recife", NORDESTE), 
	PI("Piaui", "Teresina", NORDESTE), 
	RJ("Rio de Janeiro","Rio de Janeiro", SUDESTE), 
	RN("Rio Grande do Norte", "Natal", NORDESTE), 
	RS("Rio Grande do Sul", "Porto Alegre", SUL), 
	RO("Rondônia", "Porto Velho", NORTE), 
	RR("Roraima", "Boa Vista", NORTE), 
	SC("Santa Catarina", "Florianópolis", SUL), 
	SP("São Paulo","São Paulo", SUDESTE), 
	SE("Sergipe", "Aracaju", NORDESTE), 
	TO("Tocantins", "Palmas", NORTE);

	private String estado;
	private String capital;
	private Regions regiao;

	UFBrasil(String state, String capital, Regions region) {
		this.estado = state;
		this.capital = capital;
		this.regiao = region;
	}

	/**
	 * Estado brasileiro.
	 * 
	 * @return O Estado.
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Capital do Estado
	 * 
	 * @return A Capital do Estado brasileiro.
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * Região brasileira.
	 * 
	 * @return A Região da qual faz parte o Estado brasileiro.
	 */
	public Regions getRegiao() {
		return regiao;
	}
}
