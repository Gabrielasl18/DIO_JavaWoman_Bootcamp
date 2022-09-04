package CollectionsJavaTeste;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAula {
	public static void main(String[] args) {
		/*			Formas de inicializar a interface SET
		 
		  Set notas = new HashSet(); //antes do java 5
		  HashSet<Double> notas = new HashSet<>();
		  
		  Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk7)
		  Ser<Double> notas = Set.of(7d,8.5,9.7,5.8,9.2,8.0,10.0);
		  notas.add(1d);
		  notas.remove(5d);
		  System.out.pritnln(notas);
		*/
		//HashSet não temos como pesquisar, nem temos o metodo GET, nem adicionar nada a lista, nem temos um set para substituir nota;
		System.out.println("Crie um conjunto e adiciona as notas:");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.7,5.8,9.2,8.0,10.0));// não vai ficar na ordem, pois é HashSet.
		System.out.println(notas);
		
		//Posso conferir se existe um determinado elemento na lista
		System.out.println("Confira se a nota 8.5 está no conjunto: " + notas.contains(8.5));
		
		System.out.println("Exibir a menor nota: " + Collections.min(notas));
		
		System.out.println("Exibir a maior nota: " + Collections.max(notas));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
;		}
		System.out.println("Exiba a soma dos valores: " + soma);
		System.out.println("Exiba a média dos valores: " + soma/notas.size());

		System.out.println("Remova a nota da posição 0");
		notas.remove(8.5);
		System.out.println(notas);
		
		//System.out.println("Remova a nota da posição 0"); impossível, pois nao tenho acesso a posição 
	
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("Exiba todas as notasna ordem em que foram informados: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.7);
		notas2.add(5.8);
		notas2.add(9.2);
		notas2.add(8d);
		notas2.add(10d);
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas em ordem Crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);//só da pq tem o comparable
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());	
		System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());
		System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty());	
	}
}
