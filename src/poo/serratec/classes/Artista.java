package poo.serratec.classes;

public class Artista {
	private String nome;
	private Genero genero;
	private double cache;
	
	
	public Artista(String nome, Genero genero, double cache) {
		this.nome = nome;
		this.genero = genero;
		this.cache = cache;
	}

	public double getCache() {
		return cache;
	}

	public void setCache(double cache) {
		this.cache = cache;
	}

	public String getNome() {
		return nome;
	}

	public Genero getGereno() {
		return genero;
	}		

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return String.format("""
				Nome: %s
				Gênero: %s
				Cache: %s
				""", nome, genero.getGeneroMusical(), cache);
	}	

}
