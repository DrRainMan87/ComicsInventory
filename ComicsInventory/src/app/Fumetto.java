package app;

import java.util.Date;

public class Fumetto {
	private int id;
	private int numero;
	private String titolo;
	private Date dataDiUscita;
	private boolean ordinato = false; //boolean se ordinato in fumetteria/edicola
	private boolean mancante = false; //boolean se il fumetto e' mancante
	private String descrizione;
	
	public Fumetto(int id, int numero, String titolo, Date dataDiUscita, boolean ordinato, boolean mancante, String descrizione) {
		this.id = id;
		this.numero = numero;
		this.titolo = titolo;
		this.dataDiUscita = dataDiUscita;
		this.ordinato = ordinato;
		this.mancante = mancante;
		this.descrizione = descrizione;
	}

	public Fumetto() {
		
	}
	
		
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Date getDataDiUscita() {
		return dataDiUscita;
	}

	public void setDataDiUscita(Date dataDiUscita) {
		this.dataDiUscita = dataDiUscita;
	}

	public boolean isOrdinato() {
		return ordinato;
	}

	public void setOrdinato(boolean ordinato) {
		this.ordinato = ordinato;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getMancante() {
		return mancante;
	}

	public void setMancante(boolean mancante) {
		this.mancante = mancante;
	}
	
	
}
