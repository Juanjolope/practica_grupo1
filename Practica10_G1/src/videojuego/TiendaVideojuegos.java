package videojuego;

import java.util.Set;
import java.util.TreeSet;

public class TiendaVideojuegos {
 
	private Set<Videojuego> inventario;
	
	//constructor
	public TiendaVideojuegos() {
		
		this.inventario = new TreeSet<>();
	}
	
	//getter y setter
	public Set<Videojuego> getInventario() {
		return inventario;
	}

	public void setInventario(Set<Videojuego> inventario) {
		this.inventario = inventario;
	}
	
	//metodos
	 public void agregarVideojuego(Videojuego videojuego) {
		 inventario.add(videojuego); 
	 };
	 
	 public void mostrarJuegosDisponiblesOrdenados() {
	        for (Videojuego juego : inventario) {
	            System.out.println("Título: " + juego.getTitulo() + ", Género: " + juego.getGenero()
	                    + ", Plataforma: " + juego.getPlataforma() + ", Precio: $" + juego.getPrecio());
	        }
	    }
	 
	 @Override
	    public boolean equals(Object obj) {
		 TiendaVideojuegos otro = (TiendaVideojuegos) obj;
	        boolean result = false;

	        if (this.inventario.equals(otro.getInventario()) && super.equals(otro)){
	            result = true;
	        }
	        return result;

	    }
}
