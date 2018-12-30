package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import app.ComicsInventory;
import app.Fumetto;

class TestFumetto {

	@Test
	void testInserisciFumetto() {
		//TODO
		Fumetto f1 = new Fumetto();
		ComicsInventory ci = new ComicsInventory();
		Fumetto fumettoCreato = ci.creaFumetto(f1);
		//Assert che fumettoCreato non sia nullo e controllare che i suoi campi non siano nulli con dei nuovi Assert
	}

	@Test
	void testModificaFumetto() {
		fail("Not yet implemented");
	}

	@Test
	void testCancellaFumetto() {
		fail("Not yet implemented");
	}

	@Test
	void testCercaFumetto() {
		fail("Not yet implemented");
	}

}
