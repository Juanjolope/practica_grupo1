package videojuego;

import enumerados.Disponibilidad;
import enumerados.Estado;

public class JuegoFisico extends Videojuego{
	private Disponibilidad dis;
	private Estado est;
	
	//constructor
	public JuegoFisico(String titulo, String genero, String plataforma, double precio, Disponibilidad dis, Estado est) {
		super(titulo, genero, plataforma, precio);
		this.dis = dis;
		this.est = est;
	}
	
	//getter y setter
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
	
	@Override
    public boolean equals(Object obj) {
		JuegoFisico otro = (JuegoFisico) obj;
        boolean result = false;

        if (this.dis.equals(otro.getDis()) && this.est.equals(otro.getEst()) && super.equals(otro)){
            result = true;
        }
        return result;

    }
	
}
