import static org.junit.Assert.*;
import iteration.Main;

import org.junit.Test;


public class MainTest {

	@Test
	public void prixPomme() {
		Main scanner = new Main();
		int expected = 100;
		int actual = scanner.add("Pomme");
		assertEquals("Pomme coute bien 1€", expected, actual);
	}
	
	@Test
	public void prixCerise() {
		Main scanner = new Main();
		int expected = 75;
		int actual = scanner.add("Cerise");
		assertEquals("Cerise coute bien 0,75€", expected, actual);
	}
	
	@Test
	public void prixBanane() {
		Main scanner = new Main();
		int expected = 150;
		int actual = scanner.add("Banane");
		assertEquals("Banane coute bien 2,5€", expected, actual);
	}
	
	@Test
	public void reductionCerise() {
		Main scanner = new Main();
		int expected = 20;
		scanner.add("Cerise");
		scanner.add("Cerise");	
		int actual = scanner.reduction();
		assertEquals("Deux Cerise coute bien 1,3€", expected, actual);
	}

}
