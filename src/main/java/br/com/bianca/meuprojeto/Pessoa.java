package br.com.bianca.meuprojeto;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa Física \n"  + "Nome: " + nome + "\n" + "Idade: " + idade + "\n " + "CPF: " + cpf ;
	}

	
	

	
	}

	


