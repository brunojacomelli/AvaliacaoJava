package poo.serratec.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import poo.serratec.classes.Artista;
import poo.serratec.classes.Banda;
import poo.serratec.classes.Cantor;
import poo.serratec.classes.DJ;
import poo.serratec.classes.Evento;
import poo.serratec.classes.Genero;
import poo.serratec.classes.Palco;

public class Festival {

	public static void main(String[] args) {

		List<Palco> shows = new ArrayList<>();
		
		Palco palco1 = new Palco("Palco Principal", 50000);		
		Palco palco2 = new Palco("Palco Secundário", 12000);
		
		Artista rhcp = new Banda("Red Hot Chilli Pepper", Genero.ROCK, 200000);		
		Artista eden = new Cantor("EDEN", Genero.ELETRO, 20000);		
		Artista alok = new DJ("Alok", Genero.ELETRO, 100000);
		
		Evento evento1 = new Evento(LocalDate.of(2024, 04, 25), LocalTime.of(22, 00), alok);
		Evento evento2 = new Evento(LocalDate.of(2024, 04, 25), LocalTime.of(22, 00), eden);
		Evento evento3 = new Evento(LocalDate.of(2024, 04, 26), LocalTime.of(00, 00), rhcp);		
		
		palco1.adicionaEvento(evento1);
		palco2.adicionaEvento(evento2);
		palco1.adicionaEvento(evento3);
					
		shows.add(palco1);
		shows.add(palco2);
				
		for (Palco show : shows) {
			System.out.println(show);
		}
		
	}

}
