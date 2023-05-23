package videojuego;

public class Videojuego implements Comparable<Videojuego> {

	private String titulo;
	private String genero;
	private String plataforma;
	private double precio;
	
	public Videojuego(String titulo, String genero, String plataforma, double precio) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Videojuego o) {
	
		return this.titulo.compareTo(o.titulo);
	
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + this.titulo + ", genero=" + this.genero + ", plataforma=" + this.plataforma + ", precio="
				+ this.precio + "]";
	}
	
	
	
	
}
