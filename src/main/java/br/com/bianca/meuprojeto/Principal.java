package br.com.bianca.meuprojeto;

import javax.swing.JOptionPane;

import lombok.ToString;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
		pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));
		pessoa.setCpf(JOptionPane.showInputDialog("Informe seu cpf: "));
		
		JOptionPane.showMessageDialog(null, pessoa.toString());
	}

}
