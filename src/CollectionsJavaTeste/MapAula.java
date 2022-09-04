package CollectionsJavaTeste;
/* métodos mais utilizados:*/

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*Interface Map
 * 
 * Elementos únicos (key) para cada valor(value)
 * Valores podem se repetir
 * */
/*
 * Dados os modelos dos carros e seus respctivos consumos na estrada, faça:
 * modelo = gol - consumo = 14,5 km/l
 * modelo = uno - consumo = 15,6 km/l
 * modelo = mobi - consumo = 16,1 km/l
 * modelo = hb20 - consumo = 14,5 km/l
 * modelo = kswid - consumo = 15,6 km/l 
 * */
public class MapAula {
	public static void main(String[] args) {
//		Map carrosPopulares2020 = new HashMap(); // antes do java 5
//		Map<String, Double> carrosPopulares - new HashMap<>(); //Generics (jdk 5)
//		HashMap<String, Double> carrosPopulares = new HashMap<>();
//		Map<String, Double> carrosPopulares2020 = Map.of("....");
	
	    System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
	    Map<String, Double> carrosPopulares = new HashMap<>() {{
	    	put("gol", 14.4);// add nao existe, aqui no MAP é o put
	    	put("uno", 15.6);
	    	put("mobi", 16.1);
	    	put("hb20", 14.5);
	    	put("kwid", 15.6);
	    }};
	    System.out.println(carrosPopulares.toString());
	    
	    System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
	    carrosPopulares.put("gol", 16.1);
	    System.out.println(carrosPopulares);
	    
	    System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
	    System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("uno"));
	    
	    System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
	
//	    System.out.println("Exiba o terceiro modelo adicionado: ");//não tem método pra isso
	
	    System.out.println("Exiba os modelos: ");
	    Set<String> modelos = carrosPopulares.keySet();	//colocamos numa váriavel só para conferir que era SET, mas nao tinha necessidade
	    System.out.println(modelos);
	    
	    
	    System.out.println("Exiba os consumos dos carros: ");
	    Collection<Double> consumos = carrosPopulares.values();
	    System.out.println(consumos);
	    
	    System.out.println("Exiba o modelo MAIS econômico e seu consumo: ");
	    Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
	    Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();//ele retorna um set e os elementos desse entry é do tipo set
	    String modeloMaisEficiente = "";
	    for(Map.Entry<String, Double> entry : entries) {
	    	if(entry.getValue().equals(consumoMaisEficiente)) {
	    	modeloMaisEficiente = entry.getKey();
	    	System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
	    	}
	    }
	    System.out.println("Exiba o modelo MENOS econômico e seu consumo: ");
	    Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
	    String modeloMenosEficiente = "";
	    for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
	    	if(entry.getValue().equals(consumoMenosEficiente)){
	    	modeloMenosEficiente = entry.getKey();
	    	}
	    }
		System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
	    
	    carrosPopulares.values().iterator();//conseguimos chamar pois o retorno de carrosPopulares é um collections
	    Iterator<Double> iterator = carrosPopulares.values().iterator();
	    Double soma = 0d;
	    while(iterator.hasNext()) {
	    	soma += iterator.next();	
	    }
	    System.out.println("Exiba a soma dos consumos: " + soma);
	    
	    System.out.println("Exiba a média dos consumos deste dicionário: " + soma/carrosPopulares.size());

	    System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: ");
	    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
	    while(iterator1.hasNext()) {
	    	if(iterator1.next().equals(15.6)) {
	    		iterator1.remove();
	    	}
	    }
	    System.out.println(carrosPopulares);
	    
	    System.out.println("Exiba todos os carros na ordem em que foram informados: ");
	    Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
	    	put("gol", 14.4);// add nao existe, aqui no MAP é o put
	    	put("uno", 15.6);
	    	put("mobi", 16.1);
	    	put("hb20", 14.5);
	    	put("kwid", 15.6);
	    }};
	    System.out.println(carrosPopulares1);

	    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
	    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
	    System.out.println(carrosPopulares2.toString());
	    
	    System.out.println("Apague o dicionário de carros: ");
	    carrosPopulares.clear();
	    
	    System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
	
/*Estudar mais sobre o entry*/
	}
}

