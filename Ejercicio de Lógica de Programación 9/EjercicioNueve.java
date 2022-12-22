package diccionarioEjercicioNueve;

import java.util.HashMap;
import java.util.Scanner;

	public class EjercicioNueve {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner( System.in);
			HashMap<String, String> traductor = new HashMap<String, String>();
			
			traductor.put("gato", "cat");
			traductor.put("perro", "dog");
			traductor.put("pajaro", "bird");
			traductor.put("caballo", "horse");
			traductor.put("vaca", "cow");
			traductor.put("cerdo", "pig");
			traductor.put("azul", "blue");
			traductor.put("naranja", "orange");
			traductor.put("blanco", "white");
			traductor.put("negro", "black");
			traductor.put("rojo", "red");
			traductor.put("gris", "grey");
			traductor.put("cafe", "brown");
			traductor.put("morado", "purple");
			traductor.put("amarillo", "yellow");
			traductor.put("verde", "green");
			traductor.put("dorado", "gold");
			traductor.put("plata", "silver");
			traductor.put("bronce", "bronze");
			traductor.put("rosa", "pink");
			
	        System.out.println("Introduzca la palabra en español que quieras traducir: ");
	        String in = sc.nextLine();
	        if(traductor.containsKey(in)) {
	        	System.out.println("La traducción en ingés es: "+traductor.get(in));
	        }else System.out.println("La palabra no se encuentra en el diccionario");
		}
	}