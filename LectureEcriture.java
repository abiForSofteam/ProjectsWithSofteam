package com.softeam.classes;
import java.util.Scanner;

public class LectureEcriture {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez Votre nom :");
		String nom = clavier.nextLine();
		
		System.out.println("Entrez Votre prenom :");
		//Pour lire toute la ligne
		String prenom = clavier.nextLine();
		// Pour lire le premier mot
		//String prenom = clavier.next();
		
		//String nomComplet = nom + prenom;
		System.out.println(nom + ' ' + prenom);
		
		clavier.close();
	}
	
	

}