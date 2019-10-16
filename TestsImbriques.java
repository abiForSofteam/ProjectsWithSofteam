package com.softeam.classes;

import java.util.Scanner;

public class TestsImbriques {

	public static void main(String[] args) {
		testNombre();

	}

	public static void testNombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int nombre = scanner.nextInt();

		if (nombre < 0)
			System.out.println("le nombre est négatif");
		else {
			if (nombre == 0)
				System.out.println("le nombre est nul");
			else
				System.out.println("le nombre est positif");
		}

		scanner.close();
	}

}
