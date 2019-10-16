package com.softeam.classes;

public class RechercheSequentielle {

	public static void main(String[] args) {
		float[] tab = { 1,2,3, 4,5,6,7,11 ,19, 20, 211, 212 };

		int i = 0; boolean found = false; int N = tab.length;
		int X = 17;

		while(i< N && found==false) {
			if(tab[i]== X) {
				found=true;
			}
			else {
				i = i+1;
			}						
		}
		if(found==true) System.out.println(X + " appartient au tableau");
		else System.out.println(X + " n'appartient pas au tableau");
	}

}
