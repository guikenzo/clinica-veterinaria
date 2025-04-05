package application;

import java.util.Scanner;

public class Endereco {
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;

	private Endereco(Builder builder) {
		this.cep = builder.cep;
		this.logradouro = builder.logradouro;
		this.bairro = builder.bairro;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
		this.pais = builder.pais;
	}

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

	public static Endereco criarEndereco(Scanner scanner) {
		Builder builder = new Builder().cep(prompt(scanner, "CEP")).bairro(prompt(scanner, "Bairro"))
				.cidade(prompt(scanner, "Cidade")).estado(prompt(scanner, "Estado")).pais(prompt(scanner, "País")).logradouro(prompt(scanner, "Logradouro"));
		
		return builder.build();
	}

	private static String prompt(Scanner scanner, String campo) {
		System.out.print(campo + ": ");
		return scanner.nextLine();
	}
}
