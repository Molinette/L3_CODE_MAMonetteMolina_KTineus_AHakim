package Cadriciel;

public class JoueurIterator implements Iterator {
	private int pos = 0;
	private Joueur[] collectionJoueur;
	
	public JoueurIterator(Joueur[] collectionJoueur){
		this.collectionJoueur = collectionJoueur;
	}
	
	public boolean hasNext(){
		if(pos >= collectionJoueur.length || collectionJoueur[pos] == null)
			return false;
		else
			return true;
	}
	
	public Object next(){
		Joueur joueur = collectionJoueur[pos];
		pos++;
		return joueur;
	}
}
