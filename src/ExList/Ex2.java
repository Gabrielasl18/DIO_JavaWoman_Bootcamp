package ExList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			List<String> pergunta = new ArrayList<String>();
			pergunta.add("Telefonou para a vítima? 1-Sim/2-Não");
			pergunta.add("Esteve no local do crime? 1-Sim/2-Não");
			pergunta.add("Mora perto da vítima? 1-Sim/2-Não");
			pergunta.add("Devia para a vítima? 1-Sim/2-Não");
			pergunta.add("Já trabalhou com a vítima? 1-Sim/2-Não");
			
			int c=0;
			int resposta;
			for(int i=0;i<5;i++) {
				System.out.println(pergunta.get(i));
				resposta = ler.nextInt();
				if(resposta == 1) {
					 c++;
				}
			}
			switch(c) {
				case 2:
					System.out.println(" >> SUSPEITA. << ");break;
				case 3:
				case 4:
					System.out.println(" >> CÚMPLICE. << ");break;
				case 5:
					System.out.println(" >> ASSASSINA. << ");break;
				default:
					System.out.println(" >> INOCENTE. << ");break;
			}
		}
	}
}
