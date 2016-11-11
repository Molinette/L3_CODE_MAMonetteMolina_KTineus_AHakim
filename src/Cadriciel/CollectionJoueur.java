package Cadriciel;

public class CollectionJoueur {
	private Joueur[] tableauJoueur;
	
	public CollectionJoueur(int nbJoueur){
		tableauJoueur = new Joueur[nbJoueur];
	}
	
	public Iterator createIterateur(){
		return new JoueurIterator(tableauJoueur);
	}
}
