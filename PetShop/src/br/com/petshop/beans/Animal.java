package br.com.petshop.beans;

import java.io.Serializable;
import java.util.List;

public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private int tipo;
	private int porte;
	private float valor;
	private boolean examinar;
	private boolean banho;
	private boolean vacina;
	private List<String> NotaFiscal;

	public Animal(String nome, int tipo, int porte){
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.porte = porte;
		this.valor = 0;
		this.banho = false;
		this.vacina = false;
		this.examinar = examinar;

	}

	public Animal(){
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getPorte() {
		return porte;
	}
	public void setPorte(int porte) {
		this.porte = porte;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean isExaminar() {
		return examinar;
	}

	public void setExaminar(boolean examinar) {
		this.examinar = examinar;
	}

	public boolean isBanho() {
		return banho;
	}

	public void setBanho(boolean banho) {
		this.banho = banho;
	}

	public boolean isVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public List<String> getNotaFiscal() {
		return NotaFiscal;
	}

	public void setNotaFiscal(List<String> notaFiscal) {
		NotaFiscal = notaFiscal;
	}

	/*Serviço vai adicionar a lista NotaFiscal o nome do serviço que foi executado mais em formato de string o valor do serviço
	o valor do serviço vai ser acrescentado ao montate de pagamento do animal.
	 */
	public void servico(String nomeServico,float valor){

		String frase = "Nome do Serviço: "+nomeServico+" valor do Serviço: "+ valor;
		this.NotaFiscal.add(frase);
		this.valor += valor;

	}

}
