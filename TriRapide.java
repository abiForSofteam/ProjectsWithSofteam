package com.softeam.classes;

public class TriRapide {

	public static void main(String[] args) {
		int[] tab = { 10, 23, 38, 4, 45, 6, 7, 11, 19, 20 };
//		monTriRapid(tab,0,tab.length-1);
//		Partition(tab,2,0,9);
	}

	
//	Procédure TriRapide(tableau T : réel par adresse, p,r: entier par valeur)
//	variable q: entier Si p <r  alors Partition(T,p,r,q) TriRapide(T,p,q-1) TriRapide(T,q+1,r) 
//	FinSi Fin Procédure
	
	
	public static void monTriRapid(int [] tab, int p, int r) {
		int q ;
		r = tab.length -1;
		if(p<r) {
			Partition(tab,p,r,q);
			monTriRapid(tab,p,q-1);
			monTriRapid(tab,q+1,r); 
		}
		
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
		

	public static void Partition(int [] tab, int p, int r, int q) {
		int i, j;
		int pivot;
		r = tab.length;
		pivot = tab[p];
		i = p + 1;
		j = r;
		while (i < j) {
			while (i <= r && tab[i] <= pivot)
				i++;
			while (j >= p && tab[j] > pivot)
				j--;
			if (i < j) {
				// Echange
				int tempo;
				//tempo = i;
				tab[i] = tab[i+1];
				tab[j] = tab[j-1];
				
				i = i + 1;
				j = j - 1;
			}
		}
		// Echange
		
		tab[j] = tab[p];
		tab[p] = tab[q];		
		q = j;
	}
}
