package fr.unice.miage;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	int taille = 10;
	Board b = new Board();

	public BoardTest(String name) {
		super(name);
	}

	public void testInitialize() {
		int seuil = 7;
		b.initialize(taille);
		assertTrue("Taille board: ", b.board.length > seuil);
	}

	public void testPartieGagnee() {
		assertFalse("Partie gagnée: ", b.partieGagnee('-'));
	}

	/* public void testJouer() {
		fail("Not yet implemented");
	}*/

	public void testToString() {
		b.initialize(taille);
		assertTrue("Valeur renvoyée - String: ", b.toString() instanceof String);
	}

	public void testMain() {
		fail("Not yet implemented");
	}

}
