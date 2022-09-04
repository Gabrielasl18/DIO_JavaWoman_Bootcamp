package CollectionsJavaTeste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
	public static void main(String[] args) {
		List<Gato> meusGatos = new ArrayList<>() {{
		add(new Gato("Jon",19,"preto"));
		add(new Gato("Juju",4,"branca"));
		add(new Gato("Simba",6,"tigrado"));
		}};
	System.out.println("--\tOrdem de Inserção\t---");
	System.out.println(meusGatos);
	
	System.out.println("--\tOrdem aleatória\t---");
	Collections.shuffle(meusGatos);
	System.out.println(meusGatos);
	
	System.out.println("--\tOrdem Natural (Nome)\t---");
	Collections.sort(meusGatos);
	System.out.println(meusGatos);
	
	System.out.println("--\tOrdem Idade\t---");
	Collections.sort(meusGatos, new ComparatorIdade());
//	meusGatos.sort(new ComparatorIdade());
	System.out.println(meusGatos);
	
	System.out.println("--\tOrdem Cor\t---");
//	Collections.sort(meusGatos, new ComparatorCor());
	meusGatos.sort(new ComparatorCor());
	System.out.println(meusGatos);

	System.out.println("--\tOrdem Nome/Cor/Idade\t---");
	meusGatos.sort(new ComparatorNomeCorIdade());
	System.out.println(meusGatos);
	
	}
}
class Gato implements Comparable<Gato> { //interface Comparable obriga a criar o CompareTo
	private String nome;
	private Integer idade;
	private String cor;
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getCor()=" + getCor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}

class ComparatorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}
class ComparatorCor implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}	
}
class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) {//se o retorno for 1 ou -1 vai ser organizado por nome
			return nome;
		}
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) {//se o retorno for 1 ou -1 vai ser organizado por cor
			return cor;
		}
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}	
}

