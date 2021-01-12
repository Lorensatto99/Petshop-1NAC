package br.com.petshop.beans;

import javax.swing.JOptionPane;

public class Util {
	public static String caixaDeDialogo(String pergunta){
		String painel = JOptionPane.showInputDialog(pergunta);
		return painel;
	}

	public static int caixaDeOpcoes(String titulo,String pergunta,String opcao1,String opcao2,String opcao3) {
		String [] palavras= {opcao1,opcao2,opcao3};
		int resposta = JOptionPane.showOptionDialog(null, pergunta, titulo, 0, JOptionPane.QUESTION_MESSAGE, null, palavras, "Cancelar");
		return resposta;

	}
	
	public static void caixaInfo(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
	}

}
