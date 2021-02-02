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
	
	public static void caixaErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void caixaInfo(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Aviso!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int caixaDeOpcoes2(String titulo,String pergunta,String opcao1,String opcao2,String opcao3,String opcao4) {
		String [] palavras= {opcao1,opcao2,opcao3,opcao4};
		int resposta = JOptionPane.showOptionDialog(null, pergunta, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, palavras, "Cancelar");
		return resposta;
	}
		
}


