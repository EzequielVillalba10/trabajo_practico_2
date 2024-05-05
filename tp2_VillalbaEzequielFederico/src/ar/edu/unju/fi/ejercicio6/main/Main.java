package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FelinoDomestico gato = new FelinoDomestico("Garfield", (byte)45, 12f);
		
		//Definicion de expresion lambda que define el convertidor de FelinoDOmestico a FelinoSalvaje
		
		Converter<FelinoDomestico, FelinoSalvaje> converter = x -> new FelinoSalvaje(x.getNombre(),x.getEdad(),x.getPeso());
		
	}

}
