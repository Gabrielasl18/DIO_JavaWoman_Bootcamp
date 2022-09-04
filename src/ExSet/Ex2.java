package ExSet;

import java.util.Comparator;
import java.util.Objects;

public class Ex2 {

}
class LinguagemFavorita{
	private String nome;
	private Integer anoDeCriacao;
	private String ide;
	
	
	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public void setAnoDeCriacao(Integer anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	@Override
	public String toString() {
		return "LinguagemFavorita [nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + ", getNome()="
				+ getNome() + ", getAnoDeCriacao()=" + getAnoDeCriacao() + ", getIde()=" + getIde() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(anoDeCriacao, ide, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoDeCriacao, other.anoDeCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}
}
class ComparatorIDE implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int IDE = l1.getIde().compareTo(l2.getIde());
		if(IDE != 0) {
			return IDE;
		} 
		return l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
	}
}
class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
		if(anoDeCriacao != 0) {
			return anoDeCriacao;
		}
		return l1.getNome().compareTo(l2.getNome());
	}
}
class ComparatorAnoDeCriacaoNomeIde implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
		int nome = l1.getNome().compareTo(l2.getNome());
		if(anoDeCriacao != 0) {
			return anoDeCriacao;
		}else if(nome != 0) {
			return nome;
		}
		return l1.getIde().compareTo(l2.getIde());
	}
	
}
