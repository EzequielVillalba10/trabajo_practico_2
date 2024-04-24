package ar.edu.unju.fi.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.model.Producto;
import ar.edu.unju.fi.model.Producto.categoria;
import ar.edu.unju.fi.model.Producto.origenFabricacion;



public class Main {

	private static Scanner sc;
	private static List<Producto> productos; // lista creacion
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int opcion=0;
		productos = new ArrayList<>();
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
			case 1:crearProducto(); break;
			
			case 2:break;
			
			case 3:break;
				
			case 4: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=4);
	}
	
	public static void crearProducto()
	{
		int opcion=0;
		origenFabricacion origen = origenFabricacion.ARGENTINA;
		categoria cate = categoria.ELECTROHOGAR;
		
		System.out.println("Ingrese codigo de Producto: ");
		int codigo = sc.nextInt();
		
		
		System.out.println("Ingrese descripcion: ");
		String descripcion = sc.next();
		
		
		System.out.println("Ingrese el origen de fabricacion: ");
		
		
		do {
			try {
			System.out.println("======================");
			System.out.println("1) ARGENTINA");
			System.out.println("2) CHINA");
			System.out.println("3) BRASIL");
			System.out.println("4) URUGUAY");
			opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("ERROR, TIENE QUE INGRESAR UN DATO DE TIPO NUMERICO");
				opcion=10;
				sc.nextLine();
			}
			switch(opcion)
			{
			case 1: origen = origenFabricacion.ARGENTINA;
			break;
			
			case 2: origen = origenFabricacion.CHINA;
			break;
			
			case 3: origen = origenFabricacion.BRASIL;
			break;
			
			case 4: origen = origenFabricacion.URUGUAY;
			break;
			
			default: System.out.println("ERROR, OPCION INCORRECTA!!!");
			}
			
		}while(opcion<1 || opcion >4);
		
		System.out.println("Ingrese el tipo de categoria: ");
		do {
			try {
			System.out.println("======================");
			System.out.println("1) TELEFONIA");
			System.out.println("2) INFORMATICA");
			System.out.println("3) ELECTRO HOGAR");
			System.out.println("4) HERRAMIENTAS");
			opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("ERROR, TIENE QUE INGRESAR UN DATO DE TIPO NUMERICO");
				opcion=10;
				sc.nextLine();
			}
			switch(opcion)
			{
			case 1: cate = categoria.TELEFONIA;
			break;
			
			case 2: cate = categoria.INFORMATICA;
			break;
			
			case 3: cate = categoria.ELECTROHOGAR;
			break;
			
			case 4: cate = categoria.HERRAMIENTAS;
			break;
			
			default: System.out.println("ERROR, OPCION INCORRECTA!!!");
			}
			
		}while(opcion<1 || opcion >4);
		
		Producto producto = new Producto(codigo, descripcion, origen, cate);
		productos.add(producto);
	}

}
