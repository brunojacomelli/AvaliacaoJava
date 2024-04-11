package poo.serratec.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nome;
	private int capacidade;
	private List<Evento> horarios = new ArrayList<>();
	
	
	public Palco(String nome, int capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public List<Evento> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Evento> horarios) {
		this.horarios = horarios;
	}

	public String getNome() {
		return nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	@Override
	public String toString() {
		return String.format("""
				Palco: %s
				Capacidade Máxima: %s
				%s
				""", nome, capacidade, horarios);
	}
	
	public void adicionaEvento(Evento eventos) {
		this.horarios.add(eventos);
		
	}
	
}
