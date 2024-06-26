package ar.edu.unju.fi.ejercicio5.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;
import ar.edu.unju.fi.ejercicio5.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio5.model.PagoTarjeta;
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
		
int opcion=0, opcion2=0;
		
		
		do {
			try {
			System.out.println("==================================");
			System.out.println("1 - Mostrar Productos");
			System.out.println("2 - Realizar compra");
			System.out.println("3 - Salir");
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
			case 1:mostrarProductos();break;
			
			case 2:
				int idcodigo;
				Pago pago ;
				LocalDate fechaPago = LocalDate.now(); 
				ArrayList<Producto> acumulacionDeCompras = new ArrayList<>();
				do {
					try {
			System.out.println("Ingrese codigo de producto (0 para no continuar): " );
			idcodigo = sc.nextInt();
					}catch(InputMismatchException e) {
						idcodigo=16;
						sc.nextLine();
					}
			
			Producto productoEncontrado = buscarProducto(idcodigo); // devuelve el objeto atraves de un metodo de busqueda 
				if (productoEncontrado!=null)
				{
					if (productoEncontrado.isEstado()==false)
					{
					System.out.println("El producto no esta disponible");
					
					}
					else
					{
					acumulacionDeCompras.add(productoEncontrado);
					System.out.println("Producto agregado...");
					}
				}
				else
				{
					System.out.println("El producto no puedo encontrado...");
				}
				}while(idcodigo!=0);
				
				
				double acumulado = calcularTotal(acumulacionDeCompras);
			
				
				
				System.out.println("=======TIPO DE PAGO=========");
			do {
				try {

				System.out.println("1 - Pago efectivo");
				System.out.println("2 - Pago tarjeta");
				System.out.println("3 - Salir");
				System.out.println("Ingrese una opcion: ");
				opcion2 = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("ERROR, TIENE QUE INGRESAR UN TIPO DE DATO NUMERICO!!!");
				sc.nextLine();// Borra el baffer del scanner
				opcion2=0;
			}
				System.out.println("================================");
				switch(opcion2)
				{
				case 1:   
				pago = new PagoEfectivo(acumulado, fechaPago);
				pago.realizarPago(acumulado);
				pago.imprimirRecibo();
				break;
				case 2: 
					System.out.println("Ingrese numero de tarjeta: ");
					String numeroTarjeta = sc.next();
					pago = new PagoTarjeta(numeroTarjeta, fechaPago, acumulado);
					pago.realizarPago(acumulado);
					pago.imprimirRecibo();
					
				break;
				}
			}while(opcion2!=3 && opcion2!=2 && opcion2!= 3);
			
			break;
			
			case 3:System.out.println("Saliendo del programa");break;
			
			
			default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=3);
		
	}
	
	
	
	public static void precargarProductos() {
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
	
	/**
	 * Metodo para mostrar los objetos dentro de la arraylist productos!
	 */
	public static void mostrarProductos()
	{
		Consumer<Producto> printConsumerProd = p -> System.out.println(p);
		productos.forEach(printConsumerProd);
	}
	
	/**
	 * Metodo para buscar un producto dentro de una arraylist atraves de un codigo
	 * @param codigo
	 * @return
	 */
	public static Producto buscarProducto(int codigo) {
		for(Producto producto: productos)
		{
			if (producto.getCondigo()==codigo)
			{
				return producto;
			}
			
		}
		return null;
	}
	
	/**
	 * Metodo que devuelve el total de la suma de todos los valores de la arraylist de acumulaciondeCompras
	 * @param acumulacionDeCompras
	 * @return
	 */
	public static double calcularTotal(ArrayList <Producto> acumulacionDeCompras){
		double total = 0;
		for (Producto producto : acumulacionDeCompras)
		{
			total+=producto.getPrecioUnitario();
		}
		return total;
	}
	
	

}