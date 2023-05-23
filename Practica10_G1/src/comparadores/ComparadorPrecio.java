package comparadores;

import java.util.Comparator;

import videojuego.TiendaVideojuegos;
import videojuego.Videojuego;

public class ComparadorPrecio implements Comparator<Videojuego> {

	@Override
	public int compare(Videojuego o1, Videojuego o2) {
	
		return (int) (o1.getPrecio() - o2.getPrecio());
	}



}
