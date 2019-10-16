package com.softeam.classes;
import java.util.Scanner;

public class ValeurAbsolue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		Float nombre = scanner.nextFloat();
		if(nombre < 0) {
			System.out.println("la valeur absolue de " + nombre + " est : " + Math.abs(nombre));
		}
		else if(nombre > 0){
			System.out.println("la valeur absolue de " + nombre + " est : " + nombre);
		}

		scanner.close();
	}

}
