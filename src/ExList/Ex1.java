/*
PROGRAMA PEGA A TEMPERATURA SEMESTRAL, FAZ A MÉDIA E EXIBE QUAIS MESES ESTAO ACIMA DA MÉDIA SEMESTRAL 
*/

package ExList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1{
	public static void main(String[] args){
		Double soma = 0d,mediaSemestral = 0d;
		int count=0;
		List<Double> tempSemestral = new ArrayList<Double>();
		tempSemestral.add(37.5);
		tempSemestral.add(38.1);
		tempSemestral.add(19.3);
		tempSemestral.add(23.0);
		tempSemestral.add(40.7);
		tempSemestral.add(30.8);
		Iterator<Double> iterator = tempSemestral.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
			count++;
		}
		System.out.print("Todas as temperaturas: " + tempSemestral);
		mediaSemestral = soma/tempSemestral.size();
		System.out.println("\nmedia semanal: " + mediaSemestral);
		System.out.println("quantidade de temperaturas cadastradss: " + count);
		System.out.println("temperaturas acima da media semestral: ");
		for(int i=0;i<count;i++) {
			if(tempSemestral.get(i) > mediaSemestral){
				System.out.println(tempSemestral.get(i) + "\t");
			}
		}
		System.out.println("Meses das temperaturas acima da média semestral: " + "\t");
		count=0;
		for(Double temp : tempSemestral) {
			if(temp > mediaSemestral) {
				switch(count) {
				case(0): 
					System.out.println("01 - Janeiro " + temp + "\t");
					break;
				case(1): 
					System.out.println("02 - Fevereiro " + temp + "\t");
					break;
				case(2): 
					System.out.println("03 - Março " + temp + "\t");
					break;
				case(3): 
					System.out.println("04 - Abril " + temp + "\t");
					break;
				case(4): 
					System.out.println("05 - Maio " + temp + "\t");
					break;
				case(5): 
					System.out.println("06 - Junho " + temp + "\t");
					break;
				default:
					System.out.println("Não houve temperatura acima da média");
				}
			}
		count++;
		}
	}
}






