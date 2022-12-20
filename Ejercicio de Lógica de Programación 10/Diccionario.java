package diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Diccionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		HashMap<String, String> traductor = new HashMap<String, String>();
		Random generator = new Random();
		
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
		
		Set<String> keySet = traductor.keySet();
        List<String> keyList = new ArrayList<>(keySet);
        int correctAnswers = 0;
        for(int i =0;i<5;i++) {
        	int randIdx = new Random().nextInt(keyList.size());
        	String randomWordES = keyList.get(randIdx);
        	String randomWordEN = traductor.get(randomWordES);
        	System.out.println("Introduzca la traduccion en inglés para la palabra: " +randomWordES);
        	String answer = sc.nextLine();
        	if(answer.equals(randomWordEN)) correctAnswers++;
        }
        System.out.println("Correct answers: " +correctAnswers);
	}
}
