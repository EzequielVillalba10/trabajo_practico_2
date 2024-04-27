package ar.edu.unju.fi.ejercicio4.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
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
			
			case 2:mostrarJugadores();break;
			
			case 3:modificarJugador();break;
				
			case 4:eliminarJugador();break;
			
			case 5: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=5);
		
		
		
		
		
	}
	/**
	 * se agregan objetos el arrayList de choferes
	 */
	
	public static void altaJugador() {
		if (jugadores==null)
		{
			jugadores= new ArrayList<>();
		}
		
		////////////////////////////////////////////////////////////////////
		//VARIABLES....................
		int opcion;
		Posicion posicion = null;
		boolean condicion;
		double estatura;
		double peso;
		LocalDate fechaNac= LocalDate.now();
		/////////////////////////////////////////////////////////////////
		//empiezo a pedir que ingrese los datos para la CLase jugador al usuario
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.next();
		
		System.out.println("Ingrese apellido: ");
		String apellido = sc.next();
		
		System.out.println("----------Ingrese fecha de Nacimiento---------");
		
		do {
			try {
		System.out.println("Ingrese año: ");
		int año = sc.nextInt();
		System.out.println("Ingrese mes: ");
		int mes = sc.nextInt();
		System.out.println("Ingrese dia: ");
		int dia = sc.nextInt();
		 condicion = true;
		fechaNac = LocalDate.of(año, mes, dia);
		}catch(InputMismatchException e) {
			 condicion = false;
			 sc.nextLine();
		}
		
		}while(condicion==false);
		System.out.println("Ingrese nacionalidad: ");
		String nacionalidad = sc.next();
		
		do {
		try {	
		
		System.out.println("Ingrese estatura: ");
		estatura = sc.nextDouble();
		}catch(InputMismatchException e) {
			estatura=0;
			System.out.println("ERROR, SE ESPERA QUE INGRESE UN DATO NUMERICO");
			sc.nextLine();
		}
		}while(estatura==0);
		
		do {
			try {	
			
		
		System.out.println("Ingrese peso: ");
		peso = sc.nextDouble();
		}catch(InputMismatchException e) {
			peso = 0;
			System.out.println("ERROR, SE ESPERA QUE INGRESE UN DATO NUMERICO");
			sc.nextLine();
		}
		}while(peso==0);
		System.out.println("Ingrese posicion: ");
		do {
			
			try {
			System.out.println("1)DELANTERO");
			System.out.println("2)MEDIO");
			System.out.println("3)DEFENSA");
			System.out.println("4)ARQUERO");
			opcion = sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("error, debe ingresar un dato numerico!!!");
				opcion=10;
				sc.nextLine();
			}
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
		jugadores.add(jugador);
	}
	
	/**
	 * muestra todos los objetos de la arraylist
	 */
	public static void mostrarJugadores() {
		
		if (jugadores == null)
		{
			System.out.println("LA LISTA ESTA VACIA!!!!");
			
		}
		else
		{
			jugadores.forEach(j->System.out.println(j));
			
		}
		
	}
	
	public static void modificarJugador()
	{
		//VARIABLES 
		int opcion;
		Posicion posicion=null;
		///////////
		if (jugadores == null)
		{
			System.out.println("LA LISTA ESTA VACIA");
		}
		else
		{
			System.out.println("===========MODIFICAR JUGADOR===========");
			System.out.println("Ingrese apellido del Jugador: ");
			String apellido = sc.next();
			System.out.println("Ingrese nombre del jugador: ");
			String nombre = sc.next();
			
			Iterator<Jugador> iterator = jugadores.iterator();
			while(iterator.hasNext())
			{
				Jugador jugador = iterator.next();
				if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre))
				{
					
					do {
						try {
						System.out.println("INGRESE LA POSICION QUE DESEA PARA EL JUGADOR: ");
						System.out.println("1) DELANTERO");
						System.out.println("2) MEDIO");
						System.out.println("3) DEFENSA");
						System.out.println("4) ARQUERO");
						opcion=sc.nextInt();
						}catch(InputMismatchException e) {
							System.out.println("error se pide que ingrese un dato numerico, vuelva a intentarlo");
							opcion=0;
							sc.nextLine();
						}
						
						
						switch (opcion) {
						
						case 1: posicion = Posicion.DELANTERO;
						
						case 2: posicion = Posicion.MEDIO;break;
						
						case 3: posicion = Posicion.DEFENSA;break;
						
						case 4: posicion = Posicion.ARQUERO;break;
						
						
						default: System.out.println("ERROR, OPCION INCORRECTA!!");
						}
					}while(opcion<1 || opcion>4);
					
					jugador.setPosicion(posicion);
				}
			}
		}
		
		
		
	}
	
	/**
	 * Elimina un jugador dentro del arraylist
	 */
	
	public static void eliminarJugador() {
		
		if (jugadores == null)
		{
			System.out.println("LA LISTA ESTA VACIA");
		}
		else
		{
			System.out.println("===========MODIFICAR JUGADOR===========");
			System.out.println("Ingrese apellido del Jugador: ");
			String apellido = sc.next();
			System.out.println("Ingrese nombre del jugador: ");
			String nombre = sc.next();
			
			Iterator<Jugador> iterator = jugadores.iterator();
			while(iterator.hasNext())
			{
				Jugador jugador = iterator.next();
				if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre))
				{
					
					
					iterator.remove();	
					System.out.println("Se elimino el jugador con exito....");
					
				
			}
		
	}
}
}
}