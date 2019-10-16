package com.softeam.classes;

import java.util.Scanner;

public class NombreDivisibleParTrois {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int nombre = scanner.nextInt();
		
		if(nombre %3 == 0) System.out.println("le nombre est divible par 3");			
		else System.out.println("le nombre n'est par divible par 3");			
		
		scanner.close();
	}

}
