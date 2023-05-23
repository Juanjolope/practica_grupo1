package videojuego;

public class JuegoDigital extends Videojuego{
	private double tamañoEnGB;

    public JuegoDigital(String título, String género, String plataforma, double precio,
                        double tamañoEnGB) {
        super(título, género, plataforma, precio);
        this.tamañoEnGB = tamañoEnGB;
    }

	public double getTamañoEnGB() {
		return tamañoEnGB;
	}

	public void setTamañoEnGB(double tamañoEnGB) {
		this.tamañoEnGB = tamañoEnGB;
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
}
