package ExSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex2Teste {
	public static void main(String[] args) {
		Set<LinguagemFavorita> melhor = new HashSet<>();
		melhor.add(new LinguagemFavorita("Java",1991,"eclipse"));
		melhor.add(new LinguagemFavorita("C++",1983,"vscode"));
		melhor.add(new LinguagemFavorita("JavaScript",1990,"vscode"));

		
		System.out.println("--\tOrdem Inserção\t --");
		Set<LinguagemFavorita> melhor1 = new LinkedHashSet<>(Arrays.asList(
			new LinguagemFavorita("Java",1991,"eclipse"),
			new LinguagemFavorita("C++",1983,"vscode"),
			new LinguagemFavorita("JavaScript",1990,"vscode")
			)
	);
		for(LinguagemFavorita fav : melhor1) {
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		}
		System.out.println("\n");
		System.out.println("--\tOrdem Natural\t --");
		Set<LinguagemFavorita> melhor2 = new TreeSet<>();
		for(LinguagemFavorita fav : melhor2) {
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		}
		System.out.println(melhor2);
		System.out.println("\n");
		System.out.println("--\tOrdem IDE\t --");
		Set<LinguagemFavorita> melhor3 = new TreeSet<>(new ComparatorIDE());
		melhor3.addAll(melhor);
		for(LinguagemFavorita fav : melhor3) {
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		}
		System.out.println("\n");
		System.out.println("--\tOrdem Ano de Criação e nome\t --");
		Set<LinguagemFavorita> melhor4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
		melhor4.addAll(melhor);
		for(LinguagemFavorita fav : melhor4	) {
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		}
		System.out.println("\n");
		System.out.println("--\tOrdem Nome/Ano de Criação/IDE\t --");
		Set<LinguagemFavorita> melhor5 = new TreeSet<>(new ComparatorAnoDeCriacaoNomeIde());
		melhor5.addAll(melhor);
		for(LinguagemFavorita fav : melhor5) {
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		}
		
		
	}
}
