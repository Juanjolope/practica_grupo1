package videojuego;

public class JuegoDigital extends Videojuego implements Entregable{
	
	private double tamañoEnGB;
	private boolean entregadoDigital;

	//constructor
    public JuegoDigital(String título, String género, String plataforma, double precio,
                        double tamañoEnGB) {
        super(título, género, plataforma, precio);
        this.tamañoEnGB = tamañoEnGB;
        this.entregadoDigital = false;
    }

    //getters & setters
	public double getTamañoEnGB() {
		return tamañoEnGB;
	}

	public void setTamañoEnGB(double tamañoEnGB) {
		this.tamañoEnGB = tamañoEnGB;
	}
	
	
	public boolean isEntregado() {
		return entregadoDigital;
	}

	public void setEntregado(boolean entregado) {
		this.entregadoDigital = entregado;
	}

	@Override
    public boolean equals(Object obj) {
        Videojuego otro = (Videojuego) obj;
        boolean result = false;

        if (this.tamañoEnGB== this.tamañoEnGB && super.equals(otro)){
            result = true;
        }
        return result;

    }

	@Override
	public void entregar() {
		
		if(this.isEntregado()){
            System.out.println("El Videojuego digital " + super.getTitulo() + " ya ha sido entregado");
        }else{
            this.setEntregado(true);
            System.out.println("Se ha entregado el Videojuego digital " + super.getTitulo());
        }
    }
		
	}
	
	

