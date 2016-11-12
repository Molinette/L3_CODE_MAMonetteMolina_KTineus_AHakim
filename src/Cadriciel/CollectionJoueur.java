package Cadriciel;

public class CollectionJoueur {
	private Joueur[] tableauJoueur;
	
	public CollectionJoueur(int nbJoueur){
		tableauJoueur = new Joueur[nbJoueur];
	}
	
	public JoueurIterator createIterateur(){
		return new JoueurIterator(tableauJoueur);
	}
	
	public void ajoutJoueur(Joueur joueur, int index){
		tableauJoueur[index] = joueur;
	}
}
