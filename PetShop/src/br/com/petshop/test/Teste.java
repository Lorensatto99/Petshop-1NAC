package br.com.petshop.test;

import br.com.petshop.beans.Animal;
import br.com.petshop.beans.Petshop;

public class Teste {
	public static void main(String[] args) {
		Petshop petshop = new Petshop();
		
		Animal animal = petshop.Cadastrar();
		petshop.Rotina(animal);
//		String [] teste= {"rola1","rola2","rola3"};
//		Util.caixaInfo(teste);
//		
//		
		
//		List<String> testes = new ArrayList<String>();
//		String lista1 = "";
//		testes.add("teste1\n");
//		testes.add("teste2");
//		
//		for (int i =0;i< testes.size();i++) {
//			lista1 += testes.get(i);
//		}
//		System.out.println(lista1);
		
		
	}
}
