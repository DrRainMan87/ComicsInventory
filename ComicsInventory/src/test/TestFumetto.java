package test;

import static org.junit.jupiter.api.Assertions.fail;

import app.FumettoDbManager;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import app.ComicsInventory;
import app.Fumetto;

class TestFumetto {

	@Test
	void testInserisciFumetto() {
		//Test OK
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
		//Test OK
		Fumetto f1 = new Fumetto();
		f1.setId(1);
		f1.setNumero(2);
		f1.setTitolo("Titolo di Test");
		f1.setOrdinato(false);
		f1.setMancante(false);
		f1.setDescrizione("Descrizione di Test2");
		FumettoDbManager fDbManager = new FumettoDbManager();
		boolean result = fDbManager.cercaFumetto(f1);
		System.out.println(result);
		//Assert.assertTrue(result);
		//Assert.assertFalse(fDbManager.cercaFumetto(f1));
	}

	@Test
	void testGetMaxId() {
		//Test OK
		FumettoDbManager fDB = new FumettoDbManager();
		int result = fDB.getMaxId();
		System.out.println(result);
	}

}
