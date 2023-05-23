package videojuego;

import enumerados.Disponibilidad;
import enumerados.Estado;

public class JuegoFisico extends Videojuego implements Entregable{
	
	private Disponibilidad dis;
	private Estado est;
	private boolean entregarFisico;
	
	//constructor
	public JuegoFisico(String titulo, String genero, String plataforma, double precio, Disponibilidad dis, Estado est) {
		super(titulo, genero, plataforma, precio);
		this.dis = dis;
		this.est = est;
		this.entregarFisico = false;
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
	

	public boolean isEntregarFisico() {
		return entregarFisico;
	}

	public void setEntregarFisico(boolean entregarFisico) {
		this.entregarFisico = entregarFisico;
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

	@Override
	public void entregar() {
		
		if(this.isEntregarFisico()){
            System.out.println("El Videojuego fisico " + super.getTitulo() + " ya ha sido entregado");
        }else{
            this.setEntregarFisico(true);
            System.out.println("Se ha entregado el Videojuego fisico " + super.getTitulo());
        }
    }
		
	}
	
	
