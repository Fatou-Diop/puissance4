package fr.unice.miage;
import fr.unice.miage.*;


public class Board implements IBoard {
	//on suppose le tableau carré
    public char[][] board;

    public void initialize(int taille) {
    	board = new char[taille][taille];
    	for (int i = 0; i < taille; i++) {
			for (int j = 0; j <taille ; j++) {
				board[i][j]='-';
			}
		}
    }

    public boolean partieGagnee(char symbole) {

    	return false;
    }

    public void jouer(int colonne, char symbole) throws CoupInterditException {


    }

    public String toString() {
    	String s = "";
    	for (int i = 0; i < board.length; i++) {
    		for (int j = 0; j <board.length ; j++) {
				s+=board[i][j] + " ";
			}
    		s+="\n";
    	}
    	return s;
    }

    
    public static void main(String[] args) {
  		Board b = new Board();
  		b.initialize(10);
  	
  		System.out.println(b);
  		try {
  			b.jouer(0, 'x');
  			b.jouer(0, 'o');
  			System.out.println(b);
  			for(int i=0;i<10;i++) {
  				b.jouer(1, 'x');
  				System.out.println(b);
  				Joueur junior = new Joueur();
  				Partie p = new Partie(junior, junior);
  		  		p.demo();
  			}
  		} catch (CoupInterditException e) {
  			e.printStackTrace();
  		}
	}


}
