package com.softeam.classes;

import java.util.Scanner;

public class TestsImbriques2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		gestionPhotoCopies(scanner);
//		verifCaractereMaj(scanner);
//		calculPrix(21);
//		somme();
//		sommev2();
		//System.out.println("resultat de la puissance: " + calculPuissance(scanner));
		//Pyramide();
		
		System.out.println("fact : " + fact(3));
		System.out.println("fib : " + fib(3));
	}

	public static void gestionPhotoCopies(Scanner scanner) {
		System.out.println("Entrez un nombre de copies à faire:");
		int nombre = scanner.nextInt();

		if (nombre < 10)
			System.out.println("Le prix à payer est " + nombre * 0.5);
		else {
			if (nombre < 20)
				System.out.println("Le prix à payer est " + nombre * 0.4);
			else
				System.out.println("Le prix à payer est " + nombre * 0.3);
		}
		scanner.close();
	}

	public static void verifCaractereMaj(Scanner scanner) {
		System.out.println("Entrez un caractere");
		char c = scanner.next().charAt(0);

		while (c < 'A' || c > 'Z') {
			System.out.println("Recommencez car le caractère entrée n'est pas en majuscule");
			c = scanner.next().charAt(0);
		}
		System.out.println("Le caractère entré est en majuscule");
		scanner.close();
	}

	public static void somme() {
		int i = 0;
		int somme = 0;
		while (somme < 100) {
			i++;
			somme = somme + i;
		}
		System.out.println(i + "  " + somme);
	}

	public static void sommev2() {
		int i = 1;
		int somme = 0;
		while (somme < 100) {
			somme = somme + i;
			i++;
		}
		System.out.println(i - 1 + "  " + somme);
	}

	public static void calculPrix(int nb) {
		double prix;
		if (nb < 10)
			prix = nb * 0.5;
		else {
			if (nb < 20)
				prix = nb * 0.4;
			else
				prix = nb * 0.3;
		}
	}

	public static float calculPuissance(Scanner scanner) {
		float x, res = 1;
		int n;
		System.out.println("Entrez x: ");
		x = scanner.nextFloat();
		System.out.println("Entrez la valeur de la puissance: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			res = res * x;
		}
		return res;
	}

	public static void Pyramide() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez la taille de la pyramide: ");
		int n = scanner.nextInt();
		for(int i=1; i<n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("X");
			}				
			System.out.println();
		}
		
	}
	
	
	
	// LA RECURSIVITE
	
	// Factoriel
	public static int fact(int n) {
		if(n==0) return 1;
		else return n*fact(n-1);
	}
	
	// Fibonacci
	public static int fib(int n) {
		if(n==0 ||n==1) return 1;
		else return fib(n-1)+fib(n-2);
	}
}
