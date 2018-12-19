package app;

import java.util.ArrayList;
import java.util.List;

public class Collana {
	private int id;
	private String nome;
	private String casaEditrice;
	private String descrizione;
	private List<Fumetto> listaFumetti; //array/mappa per la lista di fumetti da contenere, può essere vuoto
	
	public Collana(int id, String nome, String casaEditrice, String descrizione, List<Fumetto> listaFumetti) {
		this.id = id;
		this.nome = nome;
		this.casaEditrice = casaEditrice;
		this.descrizione = descrizione;
		this.listaFumetti = listaFumetti;
	}
	
	public void inserisciFumettoInCollana(Fumetto f) {
		//TODO
	}
	
	public Collana () {
		listaFumetti = new ArrayList<Fumetto>();
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
		return listaFumetti;
	}

	public void setListaFumetti(List<Fumetto> listaFumetti) {
		this.listaFumetti = listaFumetti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
