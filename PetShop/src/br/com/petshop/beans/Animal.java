package br.com.petshop.beans;

import java.io.Serializable;
import java.util.ArrayList;
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
	private boolean cadastro;

	public Animal(String nome, int tipo, int porte){
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.porte = porte;
		this.valor = 0;
		this.banho = false;
		this.vacina = false;
		this.examinar = false;
		this.cadastro = false;

	}

	public Animal(){
		super();
		this.banho = false;
		this.vacina = false;
		this.examinar = false;
		this.valor = 0;
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

	public boolean isCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/*
	Serviço vai adicionar a lista NotaFiscal o nome do serviço que foi executado mais em formato de string o valor do serviço
	o valor do serviço vai ser acrescentado ao montate de pagamento do animal.
	*/
	
	public Animal servico(Animal animal,String nomeServico,float valor){

		String frase = "Nome do Serviço: "+nomeServico+" valor do Serviço: "+ valor+"R$";
		
		if(animal.getNotaFiscal() == null){
			List<String> servicos = new ArrayList<String>();
			servicos.add(frase);
			animal.setNotaFiscal(servicos);
		}else{
			List<String> tempServ = animal.getNotaFiscal();
			tempServ.add(frase);
			animal.setNotaFiscal(tempServ);
		}		
		this.valor += valor;
		
		return animal;

	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", tipo=" + tipo + ", porte=" + porte + ", valor=" + valor + ", examinar="
				+ examinar + ", banho=" + banho + ", vacina=" + vacina + ", NotaFiscal=" + NotaFiscal + ", cadastro="
				+ cadastro + "]";
	}

	

}
