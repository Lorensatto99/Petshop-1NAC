package br.com.petshop.beans;

public class Petshop {

	public Petshop() {
		super();
	}

	public Animal cadastrar() {
		Animal animal = new Animal();

		animal.setNome(Util.caixaDeDialogo("Qual o nome do seu animal"));
		animal.setTipo(Util.caixaDeOpcoes("Petshop", "Qual o tipo do animal?", "Gato", "Cachorro", "Outros"));
		if(animal.getTipo() == 0){
			animal.setPorte(0);
		}else {
			animal.setPorte(Util.caixaDeOpcoes("Petshop", "Qual o porte do animal ?", "Pequeno", "Médio", "Grande"));
		}
		animal.setCadastro(true);
		return animal;
	}

	public void examinar(Animal animal) {
		animal.setExaminar(true);
		animal.servico(animal,"Examinar", 70);
	}

	public void banho(Animal animal) {
		if(animal.isBanho() == false) {
			if(animal.getPorte() == 0) {
				animal.setBanho(true);
				animal.servico(animal,"Banho:Pequeno Porte", 40);
			}else if (animal.getPorte() == 1) {
				animal.setBanho(true);
				animal.servico(animal,"Banho:Médio Porte", 50);
			}else if (animal.getPorte() == 2) {
				animal.setBanho(true);
				animal.servico(animal,"Banho:Grande Porte", 60);
			}	
			Util.caixaInfo("Banho no animal foi dado!");
		}else{
			Util.caixaErro("O animal ja tomou banho!");
		}
	}

	public void Vacinar(Animal animal) {
		if(animal.isVacina() == false) {
			if(animal.getTipo() == 0 ) {
				animal.setVacina(true);
				animal.servico(animal,"Vacina:Gato", 100);
			}else if (animal.getPorte() == 1) {
				animal.setVacina(true);
				animal.servico(animal,"Vacina:Cachorro", 100);
			}else if (animal.getPorte() == 2) {
				animal.setVacina(true);
				animal.servico(animal,"Vacina:Outros animais", 150);
			}	
		}else{
			Util.caixaErro("O animal ja tomou Vacina!");
		}
	}
	
	public void Total(Animal animal){
		
	}	
}
