package ar.edu.unju.fi.ejercicio5.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago {
	
	private double montoPagado;
	
	private LocalDate fechaPago;
	
	
	public PagoEfectivo(double montoPagado, LocalDate fechaPago) {
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}

	@Override
	public void realizarPago(double monto) {
		this.montoPagado = monto - (monto * 0.10);

	}

	@Override
	public void imprimirRecibo() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
		String fechaenString = fechaPago.format(formatter);
		System.out.println("Fecha de pago: "+fechaenString);
		System.out.println("Monto pagado: $"+montoPagado);

	}

}
