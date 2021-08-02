package etapa.tecnica.gft.olimpico;

public class Atleta {
	
	private String nome;
	private String pais;
	private Double distancia;

	public Atleta(String nome, String pais, Double distancia) {
		this.nome = nome;
		this.pais = pais;
		this.distancia = distancia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}	

}
