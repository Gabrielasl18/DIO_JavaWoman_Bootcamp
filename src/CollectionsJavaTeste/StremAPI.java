package CollectionsJavaTeste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StremAPI {
	public static void main(String[] args) {
	List<Gato> meusGatos = new ArrayList<>() {{
		add(new Gato("Jon",19,"preto"));
		add(new Gato("Juju",4,"branca"));
		add(new Gato("Simba",6,"tigrado"));
		}};
		/*CLASSE ANÔNIMA - classe que não recebeu um nome e é
		 * tanto declarado e instanciado em uma única instrução.(Considere o uso dessa classe semrpe que precisar criar uma classe
		 * que será instanciada apenas uma vez)*/
		meusGatos.sort(new Comparator<Gato>(){
			public int compare(Gato g1, Gato g2) {
				return Integer.compare(g1.getIdade(), g2.getIdade());
			}
		});
		/*FUNÇÃO LAMBDA - uma função sem declaração, isto é, não é necessária colocar um nome, um tipo de retorno e o modificador
		 * de acesso.A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em java tem a sintaxe
		 * definida como (argumento) -> (corpo)
		 * Lambda é "simplificar uma classe anônima"
		*/
		meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));

		/*REFERENCE METHOD - novo recurso java 8, permite fazer referência a um método ou construtor de uma classe(de forma funcional)
	  	 * e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível.Para utilizá-lo
	  	 * basta informar uma classe ou referência seguida do símbolo "::" e o nome do método sem os parênteses no final.*/
		meusGatos.sort(Comparator.comparing(Gato::getNome));
	}	
		/* STREAMS API - traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional.
		 * Combinada com as expressões lambda, ela proporciona uma forma diferente de lidar com conjuntos de elementos,
		 * oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de 
		 * manutenção e paralelização sem efeitos indesejados em tempo de execução.
		 *
		 * SOURCE -> PIPELINE -> TERMINAL
		 *(estrutura de uma streams
		 *)
		 */

}
class Gatos  { //interface Comparable obriga a criar o CompareTo
	private String nome;
	private Integer idade;
	private String cor;
	public Gatos(String nome, Integer idade, String cor) {
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
}
