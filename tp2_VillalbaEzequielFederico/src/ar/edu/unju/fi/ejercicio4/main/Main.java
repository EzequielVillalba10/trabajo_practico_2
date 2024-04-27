package ar.edu.unju.fi.ejercicio4.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;
import ar.edu.unju.fi.ejercicio4.model.*;

import java.util.Scanner;

public class Main {
	public static List<Jugador> jugadores;
	
	public static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		int opcion=0;
		
		
		do {
			try {
			System.out.println("==================================");
			System.out.println("1 - Alta Jugador");
			System.out.println("2 - Mostrar todos los jugadores ");
			System.out.println("3 - Modificar la posicion de un jugador");
			System.out.println("4 - Eliminar un jugador");
			System.out.println("5 - SALIR");
			System.out.println("==================================");
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("ERROR, TIENE QUE INGRESAR UN TIPO DE DATO NUMERICO!!!");
			sc.nextLine();// Borra el baffer del scanner
			opcion=0;
		}
			
			
			switch (opcion)
			{
			case 1:altaJugador();break;
			
			case 2:break;
			
			case 3:break;
				
			case 4:break;
			
			case 5: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=5);
		
		
		
		
		/*
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
		*/
		
	}
	
	public static void altaJugador() {
		if (jugadores==null)
		{
			jugadores= new ArrayList<>();
		}
		
		////////////////////////////////////////////////////////////////////
		//VARIABLES....................
		int opcion;
		Posicion posicion = null;
		/////////////////////////////////////////////////////////////////
		//empiezo a pedir que ingrese los datos para la CLase jugador al usuario
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.next();
		
		System.out.println("Ingrese apellido: ");
		String apellido = sc.next();
		
		System.out.println("----------Ingrese fecha de Nacimiento---------");
		System.out.println("Ingrese año: ");
		int año = sc.nextInt();
		System.out.println("Ingrese mes: ");
		int mes = sc.nextInt();
		System.out.println("Ingrese dia: ");
		int dia = sc.nextInt();
		
		LocalDate fechaNac = LocalDate.of(año, mes, dia);
		
		System.out.println("Ingrese nacionalidad: ");
		String nacionalidad = sc.next();
		
		
		System.out.println("Ingrese estatura: ");
		double estatura = sc.nextDouble();
		
		System.out.println("Ingrese peso: ");
		double peso = sc.nextDouble();
		
		
		System.out.println("Ingrese posicion: ");
		do {
			System.out.println("1)DELANTERO");
			System.out.println("2)MEDIO");
			System.out.println("3)DEFENSA");
			System.out.println("4)ARQUERO");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: posicion = Posicion.DELANTERO;
			break;
			
			case 2: posicion = Posicion.MEDIO;
			break;
			
			case 3: posicion = Posicion.DEFENSA;
			break;
			
			case 4: posicion = Posicion.ARQUERO;
			break;
			
			default: System.out.println("OPCION INCORRECTA!!!");
			}
			
			
		}while(opcion <1 || opcion >4);		
		
		Jugador jugador = new Jugador(nombre, apellido, fechaNac, nacionalidad, peso, estatura, posicion);
	}

}
