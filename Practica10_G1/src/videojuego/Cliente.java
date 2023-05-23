package videojuego;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private List <Videojuego> comprados;
	
	public Cliente(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.comprados = new LinkedList<>();
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Videojuego> getComprados() {
		return comprados;
	}

	public void setComprados(List<Videojuego> comprados) {
		this.comprados = comprados;
	}


}
