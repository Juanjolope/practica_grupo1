package videojuego;

public class JuegoDigital extends Videojuego{
	private double tamañoEnGB;

	//constructor
    public JuegoDigital(String título, String género, String plataforma, double precio,
                        double tamañoEnGB) {
        super(título, género, plataforma, precio);
        this.tamañoEnGB = tamañoEnGB;
    }

    //getters & setters
	public double getTamañoEnGB() {
		return tamañoEnGB;
	}

	public void setTamañoEnGB(double tamañoEnGB) {
		this.tamañoEnGB = tamañoEnGB;
	}
	
	@Override
    public boolean equals(Object obj) {
		JuegoDigital otro = (JuegoDigital) obj;
        boolean result = false;

        if (this.tamañoEnGB== otro.getTamañoEnGB() && super.equals(otro)){
            result = true;
        }
        return result;

    }
}
