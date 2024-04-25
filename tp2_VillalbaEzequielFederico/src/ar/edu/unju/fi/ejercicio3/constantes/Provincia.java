package ar.edu.unju.fi.ejercicio3.constantes;

public enum Provincia {
	JUJUY, SALTA, TUCUMAN, CATAMARCA, LA_RIOJA, SANTIAGO_DEL_ESTERO;
	
	private int cantidadPoblacion;
	private int superficie;
	
	
	private Provincia(int cantidadPoblacion, int superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}


	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}


	public void setCantidadPoblacion(int cantidadPoblacion) {
		this.cantidadPoblacion = cantidadPoblacion;
	}


	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public double calcularDensidadDePoblacionDeProvincia(){
		return cantidadPoblacion / superficie;
	}
	
	
	
}
