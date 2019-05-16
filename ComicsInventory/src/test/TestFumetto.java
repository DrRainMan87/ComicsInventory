package test;

import static org.junit.jupiter.api.Assertions.fail;

import app.FumettoDbManager;
import org.junit.jupiter.api.Test;

import app.ComicsInventory;
import app.Fumetto;

class TestFumetto {

	@Test
	void testInserisciFumetto() {
		//TODO
		Fumetto f1 = new Fumetto();
		f1.setNumero(2);
		f1.setTitolo("Titolo di Test");
		f1.setOrdinato(false);
		f1.setMancante(false);
		f1.setDescrizione("Descrizione di Test");
		FumettoDbManager fDbManager = new FumettoDbManager();
		fDbManager.inserisciFumetto(f1);
		//Assert che fumettoCreato non sia nullo e controllare che i suoi campi non siano nulli con dei nuovi Assert
	}

	@Test
	void testModificaFumetto() {
		Fumetto f1 = new Fumetto();
		ComicsInventory ci = new ComicsInventory();
		Fumetto fumettoCreato = ci.creaFumetto(f1);
	}

	@Test
	void testCancellaFumetto() {
		Fumetto f1 = new Fumetto();
		ComicsInventory ci = new ComicsInventory();
		Fumetto fumettoCreato = ci.creaFumetto(f1);
	}

	@Test
	void testCercaFumetto() {
		Fumetto f1 = new Fumetto();
		ComicsInventory ci = new ComicsInventory();
		Fumetto fumettoCreato = ci.creaFumetto(f1);
	}

	@Test
	void testGetMaxId() {
		FumettoDbManager fDB = new FumettoDbManager();
		int result = fDB.getMaxId();
		System.out.println(result);
	}

}
