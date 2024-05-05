package ar.edu.unju.fi.ejercicio7.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import ar.edu.unju.fi.ejercicio5.model.Producto;
import ar.edu.unju.fi.ejercicio5.model.Producto.categoria;
import ar.edu.unju.fi.ejercicio5.model.Producto.origenFabricacion;

public class Main {

	
	private static Scanner sc;
	private static List<Producto> productos;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		productos = new ArrayList<>();
		precargarProductos();
		
		int opcion;
		do
		{
			try {
			System.out.println("1) Mostrar productos disponibles");
			System.out.println("2) Mostrar productos faltantes");
			System.out.println("3) Incrementar los precios de los productos en un 20%");
			System.out.println("4) Mostrar los productos que corresponden a la categoria Electrohogar y esten disponibles a la venta");
			System.out.println("5) Ordenar los productos por precio de forma descendiente");
			System.out.println("6) Mostrar los productos con los nombres en mayusculas");
			System.out.println("7) Salir");
			opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("ERROR, TIENE QUE INGRESAR UN TIPO DE DATO NUMERICO!!!");
				sc.nextLine();// Borra el baffer del scanner
				opcion=0;
			}
			
			switch(opcion)
			{
			case 1:mostrarProductos();break;
			
			case 2:break;
			
			case 3: break;
			
			case 4: break;
			
			case 5: break;
			
			case 6: break;
			
			case 7: System.out.println("SALIENDO DEL PROGRAMA....");break;
			default: System.out.println("Opcion invalida!!!");
			}
			
		}while(opcion!=7);
		
	}

	
	public static void precargarProductos()
	{
		if(productos.isEmpty()) {
			productos.add(new Producto(1, "Heladera Philips", 1000000, origenFabricacion.ARGENTINA, categoria.ELECTROHOGAR, false));
			productos.add(new Producto(2, "Licuadora P 102", 70000, origenFabricacion.ARGENTINA, categoria.ELECTROHOGAR, false));
			productos.add(new Producto(3, "Play Station 4", 600000, origenFabricacion.CHINA, categoria.INFORMATICA, true));
			productos.add(new Producto(4, "Celular Motorola Motog60s", 160000, origenFabricacion.CHINA, categoria.TELEFONIA, true));
			productos.add(new Producto(5, "Heladera con frezzer Drean", 115999, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR, false));
			productos.add(new Producto(6, "Tostadora HP Negra 27", 60999, origenFabricacion.BRASIL, categoria.ELECTROHOGAR, true));
			productos.add(new Producto(7, "Plancha azul glim", 40000, origenFabricacion.BRASIL , categoria.ELECTROHOGAR, true));
			productos.add(new Producto(8, "Impresora HP 14 negra", 400000, origenFabricacion.ARGENTINA, categoria.INFORMATICA, false));
			productos.add(new Producto(9, "Celular Samsung S23+", 950000, origenFabricacion.ARGENTINA, categoria.TELEFONIA, true));
			productos.add(new Producto(10, "Taladro Philco 130W", 31540, origenFabricacion.BRASIL, categoria.HERRAMIENTAS, true));
			productos.add(new Producto(11, "Maquina soldadora lsc", 130000, origenFabricacion.URUGUAY, categoria.HERRAMIENTAS, false));
			productos.add(new Producto(12, "Netbook HP mini 210", 430000, origenFabricacion.ARGENTINA, categoria.INFORMATICA, false));
			productos.add(new Producto(13, "Heladera Philips", 1000000, origenFabricacion.CHINA, categoria.ELECTROHOGAR, true));
			productos.add(new Producto(14, "Celular Xoami Redmi note 11 pro", 430000, origenFabricacion.CHINA, categoria.TELEFONIA, true));
			productos.add(new Producto(15, "Caminadora Electrica Duel", 850000, origenFabricacion.CHINA, categoria.ELECTROHOGAR, false));
			
	}
	}
	
	public static void mostrarProductos()
	{
		
		Consumer<Producto> printConsumerProd = p -> 
		{
			
			if (p.isEstado()) {
				System.out.println(p);
			}
		};
		productos.forEach(printConsumerProd);
		
	}
}
