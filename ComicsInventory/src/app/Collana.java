package app;

import java.util.ArrayList;
import java.util.List;

public class Collana {
	private int id;
	private String nome;
	private String casaEditrice;
	private String descrizione;
	//private List<Fumetto> listaFumetti; //array/mappa per la lista di fumetti da contenere, può essere vuoto
	
	public Collana(int id, String nome, String casaEditrice, String descrizione) {
		this.id = id;
		this.nome = nome;
		this.casaEditrice = casaEditrice;
		this.descrizione = descrizione;
	}
	
	public Collana () {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Fumetto> getListaFumetti() {
		List<Fumetto> listaFumetti = new ArrayList<Fumetto>();
		//TODO - Query che cerca Fumetti con idCollana (this.id) passato
		return listaFumetti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
