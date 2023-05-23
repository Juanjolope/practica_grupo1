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


}
