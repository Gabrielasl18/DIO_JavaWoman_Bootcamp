//formas de inicializar uma lista e usar collections.
package CollectionsJavaTeste;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//mostrando elemntos da interface List.

public class ListAula {
	  public static void main(String[] args){
	       // List<Double> notas = new ArrayList<>(); // não é recomendável 
	       // List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));// outra forma de inicializar
	      
	       // List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6);
	       // notas.add(10d);// não posso adicionar e nem remover, então vai dar ERRO
	       // System.out.println(notas);
		   
		   // System.out.println("criando uma lista e adicionando as sete notas");
		   // List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);
		   // System.out.println("notas: " + notas);
	       // notas.add(1d);
	       // notas.remove(5d);
	       // também nao posso remover e nem adicionar, parecida com a de cima.
		  
		  List<Double> notas = new ArrayList<Double>();
		  notas.add(7.0);
		  notas.add(10.0);
		  notas.add(10.0);
		  notas.add(9.0);
		  notas.add(7.9);
		  notas.add(7.5);
		  notas.add(8.0);
		  System.out.println(notas.toString());
		  
		  System.out.println("Adicione a nota 8.0 na posição 4: ");
		  notas.add(4,8.0);
		  System.out.println(notas.toString());
		  
		  System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
		  
		  System.out.println("Exiba todas as notas na ordem em que foram informados");
		  for(Double nota: notas) System.out.println(nota);
		  
		  System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		  System.out.println(notas.toString());
		
		  System.out.println("Exiba a menor nota: " + Collections.min(notas));
	  
		  System.out.println("Exiba a maior nota: " + Collections.max(notas));
		  
		  Iterator<Double> iterator = notas.iterator();
		  Double soma = 0d;
		  while(iterator.hasNext()) {
		  	Double next = iterator.next();
		  	soma += next;
	  	  }
		  System.out.println("Exiba a soma dos valores: " + soma);
		  System.out.println("Exiba a média das notas: " + (soma/notas.size()));//size vai retornar um inteiro e o inteiro vai ser a quantidade de elementos da lista
		  
		  System.out.println("Remova a nota 10: ");
		  notas.remove(1);//vai no índice
		  System.out.println(notas);
	  
		  System.out.println("Remova as notas menores que 9 e exiba a lista");
		  Iterator<Double> iterator1 = notas.iterator();
		  while(iterator1.hasNext()) {
			  Double next = iterator1.next();
			if(next < 9) iterator1.remove(); 
		  }
		  System.out.println(notas);
		  
		  System.out.println("Apague toda a lista");
		  notas.clear();
		  System.out.println(notas);
		  
		  System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
	  }
}