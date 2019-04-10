package test;

import app.Collana;
import app.CollanaDbManager;
import app.ComicsInventory;
import app.Fumetto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCollana {

    @Test
    void testInserisciCollana() {
        Collana c1 = new Collana();
        c1.setNome("Collana2");
        c1.setCasaEditrice("Marvel");
        c1.setDescrizione("Descrizione di prova");
        //ComicsInventory ci = new ComicsInventory();
        //Collana collanaCreata = ci.creaCollana(c1);
        CollanaDbManager cDbManager = new CollanaDbManager();
        cDbManager.inserisciCollana(c1);
    }

    @Test
    void modificaCollana() {
    }

    @Test
    void cancellaCollana() {
    }

    @Test
    void cercaCollana() {
    }
}