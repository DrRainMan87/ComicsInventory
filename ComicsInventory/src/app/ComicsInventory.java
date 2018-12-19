package app;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class ComicsInventory {
	private static Scanner input;
	
	public Fumetto creaFumetto(Fumetto f){
		input = new Scanner(System.in);
		int idF = 0, numF = 0;
		String titF, descrF;
		//Data dataF;
		boolean ordF = false, mancF = false;
		
		System.out.println("Inserire l'id del fumetto");
		idF = input.nextInt();
		System.out.println("Inserire il nome del fumetto");
		numF = input.nextInt();
		System.out.println("Inserire il titolo del fumetto");
		titF = input.next();
		System.out.println("Inserire la data di uscita del fumetto");
		//dataF = input.next();
		System.out.println("Inserire se il fumetto e' stato ordinato in fumetteria");
		ordF = input.nextBoolean();
		System.out.println("Inserire se il fumetto e' mancante");
		mancF = input.nextBoolean();
		System.out.println("Inserire una descrizione del fumetto");
		descrF = input.next();
		f.setId(idF);
		f.setNumero(numF);
		f.setTitolo(titF);
		f.setOrdinato(ordF);
		f.setMancante(mancF);
		f.setDescrizione(descrF);
		return f;
	}
	
	public Collana creaCollana(Collana c) {
		//TODO
		return c;
	}
	
	public static void main(String[] args) {

	}

}
