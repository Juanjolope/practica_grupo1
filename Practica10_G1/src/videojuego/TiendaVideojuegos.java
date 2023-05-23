package videojuego;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TiendaVideojuegos {
 //atributos
	String nombre;
	private Set<Videojuego> inventario;
	
	//constructor
	
	public TiendaVideojuegos(String nombre) {
		this.nombre=nombre;
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
	
	public void mostrarListainventario() {
		for (Videojuego juego : inventario) {
            System.out.println("Título: " + juego.getTitulo() + ", Género: " + juego.getGenero()
                    + ", Plataforma: " + juego.getPlataforma() + ", Precio: $" + juego.getPrecio());
        }
	}
	
	public void mostrarJuegosDisponiblesOrdenados() {
		 List<Videojuego> juegosOrdenados = new ArrayList<>(inventario);
	        Collections.sort(juegosOrdenados, (juego1, juego2) -> juego1.getTitulo().compareToIgnoreCase(juego2.getTitulo()));

	        for (Videojuego juego : juegosOrdenados) {
	            System.out.println("Título: " + juego.getTitulo() + ", Género: " + juego.getGenero() + ", Plataforma: "
	                    + juego.getPlataforma() + ", Precio: $" + juego.getPrecio());
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
