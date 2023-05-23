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
	
	 public void busquedaJuegoPlataforma(String genero, String plataforma) {
	        List<Videojuego> juegosEncontrados = new ArrayList<>();

	        for (Videojuego juego : inventario) {
	            if (juego.getGenero().equalsIgnoreCase(genero) && juego.getPlataforma().equalsIgnoreCase(plataforma)) {
	                juegosEncontrados.add(juego);
	            }
	        }

	        if (juegosEncontrados.isEmpty()) {
	            System.out.println("No se encontraron juegos con el género '" + genero + "' y plataforma '" + plataforma + "'.");
	        } else {
	            System.out.println("Juegos encontrados con el género '" + genero + "' y plataforma '" + plataforma + "':");
	            for (Videojuego juego : juegosEncontrados) {
	                System.out.println("Título: " + juego.getTitulo() + ", Género: " + juego.getGenero() + ", Plataforma: "
	                        + juego.getPlataforma() + ", Precio: $" + juego.getPrecio());
	            }
	        }
	    }
	 
	 public void mostrarJuegoMasCaro() {
	        Videojuego juegoMasCaro = null;
	        double precioMasAlto = Double.MIN_VALUE;

	        for (Videojuego juego : inventario) {
	            if (juego.getPrecio() > precioMasAlto) {
	                precioMasAlto = juego.getPrecio();
	                juegoMasCaro = juego;
	            }
	        }

	        if (juegoMasCaro != null) {
	            System.out.println("Juego más caro: " + juegoMasCaro.getTitulo() + ", Precio: $" + juegoMasCaro.getPrecio());
	        } else {
	            System.out.println("No se encontró ningún juego en el inventario.");
	        }
	    }
	 public void mostrarJuegoMasBarato() {
	        Videojuego juegoMasBarato = null;
	        double precioMasBajo = Double.MAX_VALUE;

	        for (Videojuego juego : inventario) {
	            if (juego.getPrecio() < precioMasBajo) {
	                precioMasBajo = juego.getPrecio();
	                juegoMasBarato = juego;
	            }
	        }

	        if (juegoMasBarato != null) {
	            System.out.println("Juego más barato: " + juegoMasBarato.getTitulo() + ", Precio: $" + juegoMasBarato.getPrecio());
	        } else {
	            System.out.println("No se encontró ningún juego en el inventario.");
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
