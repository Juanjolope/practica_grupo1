package videojuego;

public class Videojuego implements Comparable<Videojuego> {
//atributos
	private String titulo;
	private String genero;
	private String plataforma;
	private double precio;
//constructores	
	public Videojuego(String titulo, String genero, String plataforma, double precio) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.precio = precio;
	}
//getter y setter
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
	//metodos

	@Override
	public int compareTo(Videojuego o) {
	
		return this.titulo.compareTo(o.titulo);
	
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + this.titulo + ", genero=" + this.genero + ", plataforma=" + this.plataforma + ", precio="
				+ this.precio + "]";
	}
	
	@Override
    public boolean equals(Object obj) {
        Videojuego otro = (Videojuego) obj;
        boolean result = false;

        if (this.genero.equals(otro.genero) && this.titulo.equals(otro.titulo)&& this.plataforma.equals(otro.plataforma) && this.precio == otro.precio){
            result = true;
        } 
        return result;

    }
	
	
}
