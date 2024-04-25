package ar.edu.unju.fi.ejercicio3.constantes;



public enum Provincia {
	
	JUJUY(770000, 53219), SALTA(1335000, 155488), TUCUMAN(1687300, 102602), CATAMARCA(415438, 102602), LA_RIOJA(393531, 89680), SANTIAGO_DEL_ESTERO(896461,136351);
	
	private int cantidadPoblacion;
	private int superficie;
	
	private Provincia(int cantidadPoblacion, int superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}

	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}

	public int getSuperficie() {
		return superficie;
	}

	// metodo double calcularDensidad poblacional......
	
	public double calcularDensidadPoblacional()
	{
		return cantidadPoblacion / superficie;
	}

	
	
	
}
