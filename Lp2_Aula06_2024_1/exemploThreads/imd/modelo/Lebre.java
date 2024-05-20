package imd.modelo;

public class Lebre {
	
	private String nome;
	private Integer distancia;
	
	public Lebre() {
		nome = "";
		distancia = 0;
	}
	
	public Integer getDistancia() {
		return distancia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void pular() {
		// controles
		boolean condicao = true;
		Integer dist= 0;
		
		while (condicao == true) {
			dist = (int) (Math.random() * 10);
			
			if (dist >=1 && dist <=3) {
				this.distancia += dist;
				condicao = false;
			}
		}
	}
}
