package poo.serratec.classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
	private LocalDate dia;
	private LocalTime horario;
	private Artista artista;
	
	public Evento(LocalDate dia, LocalTime horario, Artista artista) {
		this.dia = dia;
		this.horario = horario;
		this.artista = artista;
	}

	public LocalDate getDia() {
		return dia;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public Artista getArtista() {
		return artista;
	}

	@Override
	public String toString() {
		return String.format("""
				Dia: %s
				Horário: %s
				Artista: %s
				""", dia, horario, artista);
	}
	
}
