package fr.unice.miage;

public class Partie {
	private Joueur[] joueurs = new Joueur[2];
   private Demo demo;
  
   public Partie (Joueur joueur1, Joueur joueur2) {
   demo = new Demo();
   joueurs[0] = joueur1;
   joueurs[1] = joueur2;
   
   }
   
   
   
   public void demo() {
	   int vainqueur = 1;
	   int cJoueur = 0;
	   
   

	    System.out.println("La partie est finie.");
	    demo.afficher();
	    if (vainqueur == 1) {
	      System.out.println("Match nul.");
	    } else {
	      System.out.println("Le vainqueur est " + joueurs);
	    }
	  }
	      
}
   
   
