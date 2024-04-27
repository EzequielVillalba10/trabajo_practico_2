package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


import ar.edu.unju.fi.ejercicio4.constantes.Posicion;


public class Jugador {

		private String nombre;
		private String apellido;
		private LocalDate fechaDeNacimiento;
		private String nacionalidad;
		private double peso;
		private double altura;
		private Posicion posicion;
		
	
		
		public Jugador(String nombre, String apellido, LocalDate fechaDeNacimiento, String nacionalidad, double peso,
				double altura, Posicion posicion) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.nacionalidad = nacionalidad;
			this.peso = peso;
			this.altura = altura;
			this.posicion = posicion;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public LocalDate getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}

		public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		public Posicion getPosicion() {
			return posicion;
		}

		public void setPosicion(Posicion posicion) {
			this.posicion = posicion;
		}

		public int calcularEdad() {
			
			LocalDate hoy = LocalDate.now();
			Period diferencia = Period.between(fechaDeNacimiento, hoy);
			return diferencia.getYears();	
		}
		
		
		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento
					+ ", nacionalidad=" + nacionalidad + ", peso=" + peso + ", altura=" + altura + ", posicion="
					+ posicion + "]";
		}
		
		
		
}
