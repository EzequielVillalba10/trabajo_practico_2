package ar.edu.unju.fi.ejercicio5.model;



public class Producto {
	private int condigo;
	private String descripcion;
	private double precioUnitario;
	private origenFabricacion origenFabricacion;
	private categoria categoria;
	private boolean estado ;
	
	public enum origenFabricacion {
		ARGENTINA,CHINA,BRASIL,URUGUAY
	}
	public enum categoria {
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	}

	
	
	


	public Producto(int condigo, String descripcion, double precioUnitario,
			ar.edu.unju.fi.ejercicio5.model.Producto.origenFabricacion origenFabricacion,
			ar.edu.unju.fi.ejercicio5.model.Producto.categoria categoria, boolean estado) {
		this.condigo = condigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origenFabricacion = origenFabricacion;
		this.categoria = categoria;
		this.estado = estado;
	}




	public int getCondigo() {
		return condigo;
	}




	public void setCondigo(int condigo) {
		this.condigo = condigo;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public double getPrecioUnitario() {
		return precioUnitario;
	}




	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}




	public origenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}




	public void setOrigenFabricacion(origenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}




	public categoria getCategoria() {
		return categoria;
	}




	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}

	
	
	
	

	public boolean isEstado() {
		return estado;
	}




	public void setEstado(boolean estado) {
		this.estado = estado;
	}




	@Override
	public String toString() {
		return "Producto [condigo=" + condigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", origenFabricacion=" + origenFabricacion + ", categoria=" + categoria + ", estado=" + estado + "]";
	}




	
	
	
	

	
	
	
	
	
	
}
