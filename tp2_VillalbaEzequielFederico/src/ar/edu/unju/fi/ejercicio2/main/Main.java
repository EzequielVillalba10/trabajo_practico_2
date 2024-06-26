package ar.edu.unju.fi.ejercicio2.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;
import ar.edu.unju.fi.model.Producto.origenFabricacion;

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
			case 1:crearEfemeride();break;
			
			case 2:mostrarEfemride();break;
			
			case 3:eliminarEfemeride();break;
				
			case 4:modificarEfemeride();break;
			
			case 5: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=5);
		
		
	}
	
	/**
	 * Creacion de objeto
	 */
	public static void crearEfemeride(){
		if (efemerides == null)
		{
			efemerides = new ArrayList<>();
		}
		
		////////////////////////////////////////////////////////////////////
		//VARIABLES....................
		int codigo, opcion, mes;
		
		Mes variable = null;
		
		//////////////////////////////////////////////////////////////////
		do
		{
			try {
				System.out.println("Ingrese codigo: ");
				codigo = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("ERROR, TIENE QUE INGRESAR UN TIPO DE DATO NUMERICO!!!");
				codigo = 99999;
				sc.nextLine();// Borra el baffer del scanner
			}
		}while(codigo==99999);
		
		
		//////////////////////////////////////////////////////////////////////
		
		System.out.println("Ingrese valor numerico para indicar el mes: ");
		do {
			try {
			System.out.println("======================");
			System.out.println("1) ENERO");
			System.out.println("2) FEBRERO");
			System.out.println("3) MARZO");
			System.out.println("4) ABRIL");
			System.out.println("5) MAYO");
			System.out.println("6) JUNIO");
			System.out.println("7) JULIO");
			System.out.println("8) AGOSTO");
			System.out.println("9) SEPTIEMBRE");
			System.out.println("10) OCTUBRE");
			System.out.println("11) NOVIEMRE");
			System.out.println("12) DICIEMBRE");
			opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("ERROR, TIENE QUE INGRESAR UN DATO DE TIPO NUMERICO");
				opcion=15;
				sc.nextLine();
			}
			switch(opcion)
			{
			case 1:variable=Mes.ENERO;
			break;
			
			case 2:variable=Mes.FEBRERO;
			break;
			
			case 3:variable=Mes.MARZO;
			break;
			
			case 4:variable=Mes.ABRIL;
			break;
			
			case 5:variable=Mes.MAYO;
			break;
			
			case 6:variable=Mes.JUNIO;
			break;
			
			case 7:variable=Mes.JULIO;
			break;
			
			case 8:variable=Mes.AGOSTO;
			break;
			
			case 9:variable=Mes.SEPTIEMBRE;
			break;
			
			case 10:variable=Mes.OCTUBRE;
			break;
			
			case 11:variable=Mes.NOVIEMBRE;
			break;
			
			case 12:variable=Mes.DICIEMBRE;
			break;
			
			default: System.out.println("ERROR, OPCION INCORRECTA!!!");
			}
			
		}while(opcion<1 || opcion >12);
		//////////////////////////////////////////////////////////////////
		int dia;
		do
		{
			try {
		System.out.println("Ingrese dia: ");
		 dia = sc.nextInt();
		
		}catch(InputMismatchException e) {
			System.out.println("ERROR, debe ingresar un dato numerico!");
			dia=0;
			sc.nextLine();
		}
		if (dia <= 0 || dia >31)
		{
			System.out.println("Debe ingresar un valor para el dia entre el rango comprendido [1-31]");
		}
		}while(dia<=0 || dia > 31 );	
	
		
		System.out.println("Ingrese detalle: ");
		String detalle = sc.next();
		
		Efemeride efemeride = new Efemeride(codigo, variable, dia, detalle);
		efemerides.add(efemeride);
		
	}
	
	/**
	 * Mostrar los objetos que hay en el arraylist
	 * 
	 */
	
	public static void mostrarEfemride()
	{
		if (efemerides == null)
		{
			System.out.println("LA LISTA ESTA VACIA!!!!");
		}
		else
		{
			efemerides.forEach(e->System.out.println(e));
		}
	}

	
	/**
	 * Eliminar un objeto de el Arraylist
	 */
	public static void eliminarEfemeride() {
		int codigo;
		if (efemerides == null)
		{
			System.out.println("LA LISTA ESTA VACIA");
		}
		else
		{
			System.out.println("==========ELIMINAR EFEMERIDE==================");
			do {
				try {
			System.out.println("Ingrese codigo de Efemeride: ");
			codigo = sc.nextInt();
				}catch(InputMismatchException e)
				{
					System.out.println("ERROR, DEBE INGRESAR UN DATO NUMERICO");
					codigo = 0;
				}
		}while(codigo==0);
		
		Iterator<Efemeride> iterator=efemerides.iterator();
		while (iterator.hasNext())
		{
			Efemeride efemeride = iterator.next();
			if (efemeride.getCodigo()==codigo)
			{
				iterator.remove();
				System.out.println("SE ELIMINO EL EFEMERIDE CON EL CODIGO: "+codigo);
			}
		}
			
		}
	}
	
	
	/**
	 * Creacion de procedimiento para modificar atributos del objeto Efemeride
	 * dentro de el Arraylist
	 * 
	 */
	public static void modificarEfemeride()
	{
		int codigo,opcion,opcion1,dia;
		Mes variable = null;
		if (efemerides == null)
		{
			System.out.println("LA LISTA ESTA VACIA");
		}
		else
		{
			System.out.println("==========ELIMINAR EFEMERIDE==================");
			do {
				try {
			System.out.println("Ingrese codigo de Efemeride: ");
			codigo = sc.nextInt();
				}catch(InputMismatchException e)
				{
					System.out.println("ERROR, DEBE INGRESAR UN DATO NUMERICO");
					codigo = 0;
				}
		}while(codigo==0);
		
		Iterator<Efemeride> iterator=efemerides.iterator();
		while (iterator.hasNext())
		{
			Efemeride efemeride = iterator.next();
			if (efemeride.getCodigo()==codigo)
			{
				
				do {
					try {
					System.out.println("INGRESE EL NUMERO PARA MODIFICAR: ");
					System.out.println("1) MES");
					System.out.println("2) DIA");
					System.out.println("3) DETALLE");
					System.out.println("4) SALIR");
					opcion=sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("error se pide que ingrese un dato numerico, vuelva a intentarlo");
						opcion=0;
						sc.nextLine();
					}
					
					switch(opcion)
					{
					case 1: 
						
						System.out.println("Ingrese valor numerico para indicar el mes: ");
						do {
							try {
							System.out.println("======================");
							System.out.println("1) ENERO");
							System.out.println("2) FEBRERO");
							System.out.println("3) MARZO");
							System.out.println("4) ABRIL");
							System.out.println("5) MAYO");
							System.out.println("6) JUNIO");
							System.out.println("7) JULIO");
							System.out.println("8) AGOSTO");
							System.out.println("9) SEPTIEMBRE");
							System.out.println("10) OCTUBRE");
							System.out.println("11) NOVIEMRE");
							System.out.println("12) DICIEMBRE");
							opcion1 = sc.nextInt();
							}catch(InputMismatchException e) {
								System.out.println("ERROR, TIENE QUE INGRESAR UN DATO DE TIPO NUMERICO");
								opcion1=15;
								sc.nextLine();
							}
							switch(opcion1)
							{
							case 1:variable=Mes.ENERO;
							break;
							
							case 2:variable=Mes.FEBRERO;
							break;
							
							case 3:variable=Mes.MARZO;
							break;
							
							case 4:variable=Mes.ABRIL;
							break;
							
							case 5:variable=Mes.MAYO;
							break;
							
							case 6:variable=Mes.JUNIO;
							break;
							
							case 7:variable=Mes.JULIO;
							break;
							
							case 8:variable=Mes.AGOSTO;
							break;
							
							case 9:variable=Mes.SEPTIEMBRE;
							break;
							
							case 10:variable=Mes.OCTUBRE;
							break;
							
							case 11:variable=Mes.NOVIEMBRE;
							break;
							
							case 12:variable=Mes.DICIEMBRE;
							break;
							
							default: System.out.println("ERROR, OPCION INCORRECTA!!!");
							}
							
						}while(opcion<1 || opcion >12);
						
						efemeride.setMes(variable);
						
					break;
					
					case 2:
						do
						{
						try {
						System.out.println("Ingrese dia: ");
						dia= sc.nextInt();
						}catch(InputMismatchException e)
						{
							System.out.println("ERROR, SE DEBE INGREASAR UN DATO NUMERICO");
							dia= 32;
						}
						
						}while(dia <1 || dia >31);
						efemeride.setDia(dia);
					break;
					
					case 3:
						System.out.println("Ingrese nuevo detalle: ");
						String detalle = sc.next();
						efemeride.setDetalle(detalle);
					break;
					
					case 4:System.out.println("SALIENDO...");
					
					break;
					
					default: System.out.println("OPCION INCORRECTA!!!");
					}
				}while(opcion!=4);
				
			}
		}
			
		}
	}
}
