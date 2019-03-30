package app;

public interface IFumettoDbManager {
	
	public void inserisciFumetto(Fumetto f);
	
	public void modificaFumetto(Fumetto f);
	
	public void cancellaFumetto(Fumetto f);
	
	public boolean cercaFumetto(Fumetto f);

}
