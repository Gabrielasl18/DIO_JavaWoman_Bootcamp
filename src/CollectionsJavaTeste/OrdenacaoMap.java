package CollectionsJavaTeste;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {
	public static void main(String[] args) {
		
		System.out.println("--\tOrdem aleatória\t--");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put("Green, John", new Livro("A culpa é das estrelas",245));
			put("Dugigg, Charles", new Livro("O poder do Hábito",488));
			put("Harari, Yuval Noah", new Livro("21 Lições para o século 21",432));
		}};
		for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}

		System.out.println("\n");
		System.out.println("--\tOrdem de Inserção\t--");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
			put("Green, John", new Livro("A culpa é das estrelas",245));
			put("Dugigg, Charles", new Livro("O poder do Hábito",488));
			put("Harari, Yuval Noah", new Livro("21 Lições para o século 21",432));
		}};
		for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n");
		System.out.println("--\tOrdem alfabética autores\t--");
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1); 
		for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n");
		System.out.println("--\tOrdem alfabética nome dos livros\t--");
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNomeLivros());
		meusLivros3.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros3) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		System.out.println("\n");
		System.out.println("--\tOrdem por números de páginas\t--");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPaginas());
		meusLivros4.addAll(meusLivros3);
		for(Map.Entry<String, Livro> livro : meusLivros4) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
	}
}
class Livro{
	private String nome;
	private Integer paginas;
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + ", getNome()=" + getNome() + ", getPaginas()="
				+ getPaginas() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
}
class ComparatorNomeLivros implements Comparator<Map.Entry<String, Livro>>{
	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareTo(l2.getValue().getNome());
	}	
}
class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livro>>{
	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
	}
	
}