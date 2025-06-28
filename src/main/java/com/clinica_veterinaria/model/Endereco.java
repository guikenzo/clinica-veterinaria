package com.clinica_veterinaria.model;

public class Endereco {
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;

	public Endereco() {} // Importante: Jackson/Spring usa esse construtor vazio

	public Endereco(Builder builder) {
		this.cep = builder.cep;
		this.logradouro = builder.logradouro;
		this.bairro = builder.bairro;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
		this.pais = builder.pais;
	}

	// ⬇️ Torne a classe Builder pública e estática
	public static class Builder {
		private String cep;
		private String logradouro = "";
		private String bairro;
		private String cidade;
		private String estado;
		private String pais;

		public Builder cep(String cep) {
			this.cep = cep;
			return this;
		}

		public Builder logradouro(String logradouro) {
			this.logradouro = logradouro;
			return this;
		}

		public Builder bairro(String bairro) {
			this.bairro = bairro;
			return this;
		}

		public Builder cidade(String cidade) {
			this.cidade = cidade;
			return this;
		}

		public Builder estado(String estado) {
			this.estado = estado;
			return this;
		}

		public Builder pais(String pais) {
			this.pais = pais;
			return this;
		}

		public Endereco build() {
			return new Endereco(this);
		}
	}

	// Getters (necessários para serialização)
	public String getCep() { return cep; }
	public String getLogradouro() { return logradouro; }
	public String getBairro() { return bairro; }
	public String getCidade() { return cidade; }
	public String getEstado() { return estado; }
	public String getPais() { return pais; }

	// (opcional) Setters, se você quiser atualizar depois
}

