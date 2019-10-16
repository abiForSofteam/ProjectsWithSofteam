package com.softeam.classes;

public class Dichotomie {
	/* Recherche sur tableau :
	 * La recherche par dichotomie est preferable
	 * à la recherche séquentielle, mais pour la recherche par dichotomie,
	 * le tableau doit être trié
	 * 
	 */

	public static void main(String[] args) {
		
		float[] tab = { 1,2,3, 4,5,6,7,11 ,19, 20, 211, 212 };

		int inf = 0; int sup = tab.length; boolean found = false; int middle;
		int myValue = 22;
		while(inf<=sup && found==false) {
			middle = (inf+sup)/2;
			if(myValue==tab[middle]) {
				found=true;
			}
			else if(myValue>tab[middle]) {
				inf = middle+1;
			}
			else{
				sup = middle-1;
			}
						
		}
		if(found==true) System.out.println(myValue + " appartient au tableau");
		else System.out.println(myValue + " n'appartient pas au tableau");
	}

}
