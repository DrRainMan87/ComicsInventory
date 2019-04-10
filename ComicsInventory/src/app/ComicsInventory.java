package app;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ComicsInventory {
	private static Scanner input;
	
	public Fumetto creaFumetto(Fumetto f){
		input = new Scanner(System.in);
		int idF = 0, numF = 0;
		String titF, descrF, dataF;
		boolean ordF = false, mancF = false;

		//Commentati perche' messo getMaxId
		//System.out.println("Inserire l'id del fumetto");
		//idF = input.nextInt();
		System.out.println("Inserire il nome del fumetto");
		numF = input.nextInt();
		System.out.println("Inserire il titolo del fumetto");
		titF = input.next();
		System.out.println("Inserire la data di uscita del fumetto, nel formato 01/01/16");
		dataF = input.next();
		System.out.println("Inserire se il fumetto e' stato ordinato in fumetteria");
		ordF = input.nextBoolean();
		System.out.println("Inserire se il fumetto e' mancante");
		mancF = input.nextBoolean();
		System.out.println("Inserire una descrizione del fumetto");
		descrF = input.next();
		
		//Parser da String a Date
	    try {
	     DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
	     Date myDate = dateFormat.parse(dataF);
	     f.setDataDiUscita(myDate);
	     //System.out.println(dateFormat.format(myDate));
	    } catch (ParseException e) {
	      e.printStackTrace();
	    }
	    
		f.setId(idF);
		f.setNumero(numF);
		f.setTitolo(titF);
		f.setOrdinato(ordF);
		f.setMancante(mancF);
		f.setDescrizione(descrF);
		FumettoDbManager fDbManager = new FumettoDbManager();
		fDbManager.inserisciFumetto(f);
		return f;
	}
	
	public Collana creaCollana(Collana c) {
		//int idC;
		String nomeC, casaEditriceC, descrizioneC;
		input = new Scanner(System.in);

		//System.out.println("Inserire l'id della collana");
		//idC = input.nextInt();
		System.out.println("Inserire il nome della collana");
		nomeC = input.next();
		System.out.println("Inserire la casa editrice della collana");
		casaEditriceC = input.next();
		System.out.println("Inserire la descrizione della collana");
		descrizioneC = input.next();
		
		//c.setId(idC);
		c.setNome(nomeC);
		c.setCasaEditrice(casaEditriceC);
		c.setDescrizione(descrizioneC);
		CollanaDbManager cDbManager = new CollanaDbManager();
		cDbManager.inserisciCollana(c);
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("##### Comics Inventory #####\n");
		System.out.println("Scegliere 0 per uscire\n");
		System.out.println("Scegliere 1 per inserire una nuova Collana\n");
		System.out.println("Scegliere 2 per inserire un nuovo Fumetto\n");
		System.out.println("Scegliere 3 per vedere tutte le Collane\n");
		System.out.println("Scegliere 4 per vedere tutti i Fumetti\n");
		System.out.println("Scegliere 5 per vedere i Fumetti di una Collana\n");
		System.out.println("Scegliere 6 per cercare un Fumetto\n");
		System.out.println("Scegliere 7 per cancellare una Collana\n");
		System.out.println("Scegliere 8 per cancellare un Fumetto\n");
	}

}
