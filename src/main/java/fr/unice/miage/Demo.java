package fr.unice.miage;
import fr.unice.miage.*;

public class Demo {

	
	 public final static int vide = 0;
	 private int[][] grille;  
	 private int taille;
	   public boolean estPlein() {
	      for (int col = 0; col < taille; col++) {
	        for (int ligne = 0; ligne < taille; ligne++) {
	          if (grille[col][ligne] == vide) {
	            return false;
	          }
	        }
	      }

	      return true;
	    }

	    public int getTaille() {
	      return taille;
	    }

	    public void afficher() {
	      for (int ligne = taille - 1; ligne >= 0; --ligne) {
	        for (int col = 0; col < taille; col++) {
	          switch (grille[col][ligne]) {
	          case vide:
	            System.out.print(' ');
	            break;
	          case 'x':
	            System.out.print('x');
	            break;
	          case 'o':
	            System.out.print('o');
	            break;
	          }
	        }
	        System.out.println();
	      }

	      for (int i = 0; i < taille; ++i) {
	        System.out.print('-');
	      }
	      System.out.println();
	      for (int i = 1; i <= taille; ++i) {
	        System.out.print(i);
	      }
	      System.out.println();
	    }
	  
	

}

