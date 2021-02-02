package br.com.petshop.beans;
public class Petshop {

	public Petshop() {
		super();
	}

	public Animal Cadastrar() {
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

	public Animal Examinar(Animal animal) {
		if(animal.isExaminar()== false) {
			animal.setExaminar(true);
			animal.servico(animal,"Examinar", 70);
			Util.caixaInfo("Serviço Registrado!");;
		}else {
			Util.caixaErro("O Animal ja foi Examinado!");
		}
		return animal;
	}

	public Animal Banho(Animal animal) {
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
			Util.caixaInfo("Serviço Registrado!");
		}else{
			Util.caixaErro("O animal ja tomou banho!");
		}
		return animal;
	}

	public Animal Vacinar(Animal animal) {
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
			Util.caixaInfo("Serviço Registrado!");
		}else{
			Util.caixaErro("O animal ja tomou Vacina!");
		}
		
		return animal;
	}
	
	//este método vai retornar todos os itens dentro da lista Nota fiscal juntamente com o valor total a ser pago!
		public void Total(Animal animal){
			String [] lista;
			
		}	
	
	public void Rotina(Animal animal) {
		int opcao = 0;
		while (opcao != 3) {
			opcao = Util.caixaDeOpcoes2("Petshop", "Escolha o Serviço que deseja realizar", "Examinar", "Banho", "Vacinar", "Finalizar o serviço");
			System.out.println(opcao);
			if(opcao == 0) {
				animal = this.Examinar(animal);
			}else if(opcao == 1) {
				animal = this.Banho(animal);
			}else if (opcao == 2) {
				animal = this.Vacinar(animal);
			}else if (opcao == 3) {
				this.Total(animal);
			}
		}
	}
	
	
}
