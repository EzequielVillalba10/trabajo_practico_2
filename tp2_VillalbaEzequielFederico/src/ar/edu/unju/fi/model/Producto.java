package ar.edu.unju.fi.model;

public class Producto {
	private int condigo;
	private String descripcion;
	private origenFabricacion origenFabricacion;
	private categoria categoria;
	
	public enum origenFabricacion {
		ARGENTINA,CHINA,BRASIL,URUGUAY
	}
	public enum categoria {
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	}
	public Producto(int condigo, String descripcion, ar.edu.unju.fi.model.Producto.origenFabricacion origenFabricacion,
			ar.edu.unju.fi.model.Producto.categoria categoria) {
		this.condigo = condigo;
		this.descripcion = descripcion;
		this.origenFabricacion = origenFabricacion;
		this.categoria = categoria;
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
	@Override
	public String toString() {
		return "Producto [condigo=" + condigo + ", descripcion=" + descripcion + ", origenFabricacion="
				+ origenFabricacion + ", categoria=" + categoria + "]";
	}
	
	

	
	
	
	
	
	
}
