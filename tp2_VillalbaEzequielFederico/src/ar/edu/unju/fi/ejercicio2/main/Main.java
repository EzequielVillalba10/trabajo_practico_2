package ar.edu.unju.fi.ejercicio2.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

public class Main {

	public static Scanner sc;
	
	public static List<Efemeride> efemerides;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		int opcion=0;
		
		
		do {
			try {
			System.out.println("==================================");
			System.out.println("1 - Crear Efemeride");
			System.out.println("2 - Mostrar efemerides ");
			System.out.println("3 - Eliminar emerides");
			System.out.println("4 - Modificar efemeride");
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
			case 1:crearEfemeride;break;
			
			case 2:break;
			
			case 3:break;
				
			case 4: break;
			
			case 5: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=5);
		
		
	}
	
	/**
	 * Creacion de objeto
	 */
	public static void crearEfemeride{
		
	}

}
