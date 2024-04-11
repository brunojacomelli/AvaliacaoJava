package poo.serratec.classes;

public enum Genero {
	ROCK("Rock"),
	MPB("MPB"),
	SAMBA("Samba"),
	SERTANEJO("Sertanejo"),
	ELETRO("Eletro"),
	FUNK("Funk"),
	FORRO("Forró");
	
	private String generoMusical;

	private Genero(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}
	
}
