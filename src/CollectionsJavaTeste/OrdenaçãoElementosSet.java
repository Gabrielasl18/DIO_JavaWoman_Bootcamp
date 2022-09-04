package CollectionsJavaTeste;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class OrdenaçãoElementosSet {
	public static void main(String[] args) {

		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("The Walking Dead","zumbi",60));
			add(new Serie("Scream","Terror",45));
			add(new Serie("Pretty Little Liars","Drama Adolescente",60));	
		}};
		System.out.println("--\tOrdem aleatória\t --");
		for(Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		System.out.println("\n");
		System.out.println("--\tOrdem Inserção\t --");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("The Walking Dead","zumbi",60));
			add(new Serie("Scream","Terror",45));
			add(new Serie("Pretty Little Liars","Drama Adolescente",60));	
		}};
		for(Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		System.out.println("\n");
		System.out.println("--\tOrdem natural(Tempo Episódio)\t--");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for(Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());	
		}
		System.out.println(minhasSeries2);

		System.out.println("\n");
		System.out.println("--\t Ordem Nome/Gênero/TempoEpisódo\t--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries); //addAll recebe uma collection
		for(Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());	
		}
		/*Ordenar por gênero*/
		System.out.println("\n");
		System.out.println("--\t Ordem Gênero\t--");
		Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoGenero());
		minhasSeries4.addAll(minhasSeries);
		for(Serie serie : minhasSeries4) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
	}
}
class Serie implements Comparable <Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + ", getNome()="
				+ getNome() + ", getGenero()=" + getGenero() + ", getTempoEpisodio()=" + getTempoEpisodio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	@Override
	public boolean equals(Object obj) {//quando estamos o Hash é bom implementar
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	@Override
	public int compareTo(Serie serie) {//precisa de um critério de desempate 
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
		int genero = this.getGenero().compareTo(serie.getGenero());
		if(tempoEpisodio !=0) {//critério de desempare, ordena por tempo de ep e depois por genero
			return tempoEpisodio;
		}
		return genero;
	}
}
class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome =  s1.getNome().compareTo(s2.getNome());
		if(nome != 0) {
			return nome;
		}
		int genero =  s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) {
			return genero;
		}
		return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
	}
	
}
class ComparatoGenero implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int genero = s1.getGenero().compareTo(s2.getGenero());
		return genero;
	}
	
}