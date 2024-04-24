package ar.edu.unju.fi.main;

import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.model.Producto;



public class Main {

	private static Scanner sc;
	private static List<Producto> productos; // lista creacion
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("==================================");
			System.out.println("1 - Crear Producto");
			System.out.println("2 - Mostrar Productos ");
			System.out.println("3 - Modificar producto (descripcion, precio,origen o categoria)");
			System.out.println("4 - Salir");
			System.out.println("==================================");
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
			sc.nextLine(); // Borra el baffer del scanner
			
			switch (opcion)
			{
			case 1: break;
			
			case 2:break;
			
			case 3:break;
				
			case 4: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=4);
	}

}
