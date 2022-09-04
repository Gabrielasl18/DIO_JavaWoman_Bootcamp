package ExSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex1 {
	public static void main(String[] args) {
		Set<String> arcoIris = new HashSet<>();
		arcoIris.add("Vermelho");
		arcoIris.add("Laranja");
		arcoIris.add("Amarelo");
		arcoIris.add("Verde");
		arcoIris.add("Azul");
		arcoIris.add("Anil");
		arcoIris.add("Violeta");
		
		/*As cores uma abaixo debaixo da outra*/
		System.out.println("cores do arco-íris");
		for(String cor : arcoIris) {
			System.out.println(cor);
		}
		
		/*A quantidade de cores que o arco-íris tem*/
		System.out.println("quantidade de cores de um arco-íris: " + arcoIris.size());
		
		/*Exibindo em ordem alfabética*/
		Set<String> arcoIris2 = new TreeSet<>(arcoIris);
		System.out.println(arcoIris2);
		
		/*Exibindo as cores na ordem reversa*/
		System.out.println("\n");
		System.out.println("--\tExibir as cores na ordem inversa da qual foi informada\t--");
		Set<String> arcoIris3 = new LinkedHashSet<>(Arrays.asList("Vermelho","Laranja","Amarelo","Verde","Azul","Anil","Violeta"));
		List<String> arcoIris1 = new ArrayList<>(arcoIris3);
		Collections.reverse(arcoIris1);
		System.out.println(arcoIris);
		/*Exiba cores que começam com V*/
		System.out.println("\n");
		System.out.println("--\tExiba todas as cores que começam com v\t--");
		 for(String cor : arcoIris1) {
			 if(cor.startsWith("V")) {
				 System.out.println(cor);
			 }
		 }			
		 /*Removendo cores que NÃO começam com V*/
		System.out.println("Remova todas as cores que não começam com a letra “v”: ");
	       Iterator<String> iterator = arcoIris.iterator();
	       while (iterator.hasNext()) {
	          if (!iterator.next().startsWith("V")) {
	        	  iterator.remove();
	       		}
	       }
	        System.out.println(arcoIris);
	        
		/*Limpar conjunto*/
		System.out.println("--\tLimpar Conjunto\t--");
		arcoIris.clear();
		/*Conferir se o conjunto está vazio*/
		System.out.println("--\tConferir se o conjunto está vazio-- " + arcoIris.isEmpty());
		
	
	}
}


