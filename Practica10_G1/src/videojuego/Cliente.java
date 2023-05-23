package videojuego;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private List <Videojuego> comprados;
	
	//constructor
	public Cliente( String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.comprados = new LinkedList<>();	
	}

	//getters & setters
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

	@Override
	public String toString() {
		return "Cliente [ nombre=" + this.nombre + ", direccion=" + this.direccion + ", comprados=" + this.comprados + "]";
	}
	
	@Override
    public boolean equals(Object obj) {
		Cliente otro = (Cliente) obj;
        boolean result = false;

        if (this.nombre.equals(otro.getNombre()) && super.equals(otro)&& this.direccion.equals(otro.getDireccion())){
            result = true;
        }
        return result;

    }

}
