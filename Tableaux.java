package com.softeam.classes;

import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Déclaration d'un tableau
		// float [] notes = new float [30];

//		float [] notes = {1,5,17,10,11,4,8,16,18};
//		
//		System.out.println("Première methode pour parcourir le tableau : ");
//		for(float n : notes) {
//			System.out.println(n);
//		}
//		
//		// ou encore
//		System.out.println("Deuxième methode pour parcourir le tableau : ");
//		for(int i=0; i < notes.length; i++) {
//			System.out.println(notes[i]);
//		}
//		float [] tabl = new float [5];
//		saisieTab(tabl,scanner);		
//		afficheTab(tabl);
		// supA10();

		float[][] mat = new float[3][4];
		saisieMat(3, 4, mat, scanner);
		afficheMat(3, 4, mat, scanner);

	}

	public static void supA10() {
		float[] notes = { 1, 5, 17, 10, 11, 4, 8, 16, 18 };
		// System.out.println("Première methode pour parcourir le tableau : ");
		int cpt = 0;
		for (float n : notes) {
			if (n > 10)
				cpt++;
		}
		System.out.println("Nombre d'éléments supp à 10 : ");
		System.out.println(cpt);
	}

	public static void saisieTab(float[] tabl, Scanner sc) {
		for (int i = 0; i < tabl.length; i++) {
			System.out.println("saisir element " + (i + 1));
			tabl[i] = sc.nextInt();
		}
	}

	public static void afficheTab(float[] tab) {
		int i;
		int cpt = 0;
		for (i = 0; i < tab.length; i++) {
			if (tab[i] > 10)
				cpt++;
			System.out.println("tab[" + i + "]=" + tab[i]);
		}
		System.out.println("nombre d'elements sup à 10 :" + cpt);
	}

	public static void saisieMat(int n, int m, float[][] tabl, Scanner sc) {
		for (int i = 0; i < n - 1; i++) {
			System.out.println("saisir de la ligne " + (i + 1));
			for (int j = 0; j < m - 1; j++) {
				System.out.println("Entrez l'élément de la ligne " + (i + 1) + " et de la colonne " + (j + 1));
				tabl[i][j] = sc.nextInt();
			}
		}
		System.out.println("Fin de saisie");
	}
	
	
	public static void afficheMat(int n, int m, float[][] tabl, Scanner sc) {
		System.out.println("AFFICHAGE DE LA MATRICE  :");
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				System.out.println("tab[" + i + "][" +j +"]=" + tabl[i][j]);
			}
		}		
	}
	
	

}
