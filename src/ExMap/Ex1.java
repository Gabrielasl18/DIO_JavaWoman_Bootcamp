package ExMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex1 {
	public static void main(String[] args) {
		Map<String, Double> Dicionario = new HashMap<>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			put("PE",9.616621);
			put("AL",3.351543);
			put("CE",9.187103);
			put("RN",3.534265);
		}};
		System.out.println(Dicionario.toString());
		
		System.out.println("\n");
		System.out.println("--\tSubstituindo a população do estado do RN por 3.534.165\t--");
		Dicionario.put("RN",3.534165);
		for(Map.Entry<String, Double> dic : Dicionario.entrySet()) {
		System.out.println(dic);
		}
		
		System.out.println("\n");
		System.out.println("Verificando se o Estado PB está inserido no dicionário: " + Dicionario.containsKey("PB"));
		if(Dicionario.containsKey("PB") == false) {
			Dicionario.put("PB", 4.039277);
		}
		for(Map.Entry<String, Double> dic : Dicionario.entrySet()) {
			System.out.println(dic);
		}
		
		System.out.println("\n");
		System.out.println("--\tExibindo a população de PE\t--");
		System.out.println(Dicionario.get("PE"));

	}
}
class Estados{
	private String estado;
	private Double populacao;
	public Estados(String estado, Double populacao) {
		super();
		this.estado = estado;
		this.populacao = populacao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Double populacao) {
		this.populacao = populacao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(estado, populacao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estados other = (Estados) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(populacao, other.populacao);
	}
	
}