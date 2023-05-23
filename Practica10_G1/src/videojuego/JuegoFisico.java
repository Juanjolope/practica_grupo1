package videojuego;

import enumerados.Disponibilidad;
import enumerados.Estado;

public class JuegoFisico extends Videojuego{
	private Disponibilidad dis;
	private Estado est;
	
	public JuegoFisico(String titulo, String genero, String plataforma, double precio, Disponibilidad dis, Estado est) {
		super(titulo, genero, plataforma, precio);
		this.dis = dis;
		this.est = est;
	}

	public Disponibilidad getDis() {
		return dis;
	}

	public void setDis(Disponibilidad dis) {
		this.dis = dis;
	}

	public Estado getEst() {
		return est;
	}

	public void setEst(Estado est) {
		this.est = est;
	}

	@Override
	public String toString() {
		return "JuegoFisico [titulo=" + super.getTitulo() + ", genero=" + super.getGenero() + ", plataforma=" + super.getPlataforma() + ", precio="	+ super.getPrecio() + ", dis=" + this.dis + ", est=" + this.est + "]";
	}
	

	
}
