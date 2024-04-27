package ar.edu.unju.fi.ejercicio4.main;

import java.time.LocalDate;
import java.util.Date;

import ar.edu.unju.fi.ejercicio4.model.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese año: ");
		int año = sc.nextInt();
		System.out.println("Ingrese mes: ");
		int mes = sc.nextInt();
		System.out.println("Ingrese dia: ");
		int dia = sc.nextInt();
		
		LocalDate fechaNac = LocalDate.of(año, mes, dia);
		Jugador jugador = new Jugador();
		jugador.setFechaDeNacimiento(fechaNac);
		System.out.println(jugador.calcularEdad());
		
		
	}

}
