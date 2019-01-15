package fr.unice.miage;

public interface IBoard {
	void initialize(int taille);
	boolean partieGagnee(char symbole);
	void jouer(int colonne, char symbole) throws CoupInterditException;
	String toString();
}
