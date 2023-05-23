package videojuego;

public class AAPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TiendaVideojuegos GAME = new TiendaVideojuegos("GAy");

Videojuego juego1 = new Videojuego("LOL", "accyon", "pc", 2);
Videojuego juego2 = new Videojuego("ark", "farmeo", "pc", 6);
Videojuego juego3 = new Videojuego("furry", "sexo", "ps4",4);
Videojuego juego4 = new Videojuego("manu y sus cosas", "sangre", "pc", 1);


GAME.agregarVideojuego(juego1);
GAME.agregarVideojuego(juego2);
GAME.agregarVideojuego(juego3);
GAME.agregarVideojuego(juego4);
	
	GAME.mostrarListainventario();
	System.out.println("---------");
	GAME.mostrarJuegosDisponiblesOrdenados();
	System.out.println("---------");
	GAME.busquedaJuegoPlataforma("sexo", "ps4");
	System.out.println("---------");
	GAME.mostrarJuegoMasCaro();
	System.out.println("---------");
	GAME.mostrarJuegoMasBarato();
	
	
	}

}
