package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FelinoSalvaje gato = new FelinoSalvaje("Tanner", (byte)20, 186f);
		
		//Definicion de expresion lambda que define el convertidor de FelinoDOmestico a FelinoSalvaje
		
		Converter<FelinoSalvaje, FelinoDomestico> converter = x -> new FelinoDomestico(x.getNombre(),x.getEdad(),x.getPeso());
		
		
		// APARTIR DE ACA SE REALIZA LA CONVERSION
		if (Converter.isNotNull(gato)) {
		FelinoDomestico felino1 = converter.convert(gato); // aca lo convirtio
		converter.mostrarObjeto(felino1);
		}
		else
		{
			System.out.println("El objeto a convertir no existe.");
		}
		
		
		//Mostramos los datos del objeto felino salvaje felino1
		
		
	}

}
