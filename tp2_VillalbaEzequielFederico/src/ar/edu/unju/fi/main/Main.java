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
		
		
		do {
			try {
			System.out.println("==================================");
			System.out.println("1 - Crear Producto");
			System.out.println("2 - Mostrar Productos ");
			System.out.println("3 - Modificar producto (descripcion, precio,origen o categoria)");
			System.out.println("4 - Salir");
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
			case 1:crearProducto(); break;
			
			case 2:mostrarProductos();break;
			
			case 3:modificarProductos();break;
				
			case 4: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=4);
		
	}
	
	public static void crearProducto()
	{
		if (productos == null)
		{
			productos = new ArrayList<>();
		}
		else
		{
		
		int codigo;
		double precio;
		int opcion=0;
		origenFabricacion origen = null;
		categoria cate = null;
		
		//////////////////////////////////////////////////////////////////
		do
		{
		try {
		System.out.println("Ingrese codigo de Producto: ");
		 codigo = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("ERROR, TIENE QUE INGRESAR UN TIPO DE DATO NUMERICO!!!");
			 codigo = 99999;
			sc.nextLine();// Borra el baffer del scanner
		}
		}while(codigo==99999);
		
		System.out.println("Ingrese descripcion: ");
		String descripcion = sc.next();
		sc.nextLine();
		//////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////
		do {
		try {	
		
		System.out.println("Ingrese precio unitario: ");
		precio = sc.nextDouble();
		
		}catch(InputMismatchException e) {
			System.out.println("ERRORRRRR, SE PIDE QUE INGRESE UN DATO NUMERICO");
			precio=9999912;
			sc.nextLine();
		}
		}while(precio==9999912);
		
		
		
		
		///////////////////////////////////////////////////////////////////
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
		
		Producto producto = new Producto(codigo, descripcion, precio, origen, cate);
		productos.add(producto);
	
		}
		}
		
		

	
	/**
	 * Muestra todos los objetos de la arraylist productos
	 */
	
	public static void mostrarProductos()
	{
		if (productos == null) {
			System.out.println("LA LISTA ESTA VACIA");
		}
		else
		{
		System.out.println("-----------LISTA PRODUCTOS--------------");
		productos.forEach(p->System.out.println(p));
	}
	}
	
	/**
	 * Modifica un atributo del producto
	 */
	public static void modificarProductos()
	{
		int opcion=0;
		
		origenFabricacion origen = null ;
		categoria cate = null;
		if (productos != null)
		{
		System.out.println("-----------MODIFICACION DE PRODUCTO----------------");
		System.out.println("Ingrese codigo de producto: ");
		int codigo = sc.nextInt();
		for(Producto producto: productos)
		{
			if(producto.getCondigo()==(codigo))
			{
				do {
					System.out.println("1)Modificar precio unitario");
					System.out.println("2)Modificar Descripcion");
					System.out.println("3)Modificar Origen de Fabricacion");
					System.out.println("4)Modificar Categoria");
					System.out.println("5)SALIR");
					opcion = sc.nextInt();
					
					switch(opcion)
					{
					case 1: System.out.println("INGRESE NUEVO PRECIO UNITARIO: ");
					double precio = sc.nextDouble();
					producto.setPrecioUnitario(precio);
					break;
					case 2: System.out.println("INGRESE NUEVA DESCRIPCION: ");
					String descripcion = sc.next();
					producto.setDescripcion(descripcion);
					sc.nextLine();
					break;
					case 3: System.out.println("MODIFICAR ORIGEN DE FABRICACION");
					
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
					
					producto.setOrigenFabricacion(origen);
					break;
					case 4: System.out.println("MODIFICAR CATEGORIA");
					
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
					producto.setCategoria(cate);
						
					break;
					default: System.out.println("OPCION INCORRECTA!!!");
					}
					
					
				}while(opcion!=5);
				
				
			}
		}
		
	}
		else
		{
			System.out.println("LA LISTA ESTA VACIA");
		}
	}
}
