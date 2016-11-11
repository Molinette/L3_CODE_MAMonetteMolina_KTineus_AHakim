package Cadriciel;

public class JoueurIterator implements Iterator<Joueur> {
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
	
	public Joueur next(){
		Joueur joueur = collectionJoueur[pos];
		pos++;
		return joueur;
	}
}
