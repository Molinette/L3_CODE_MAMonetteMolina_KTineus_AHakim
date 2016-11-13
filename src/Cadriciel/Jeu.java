package Cadriciel;

public abstract class Jeu{
	protected int nbTour = 1;
	protected boolean isTourFini = false;
	protected Joueur joueurActuel;
	protected int tourActuel = 1;
	protected CollectionJoueur joueurs;
	protected IStrategie strategie;
	
	public void jouerUnePartie(int nbJoueurs){
		joueurs = new CollectionJoueur(nbJoueurs);
		
		initJeu();
		for(int i = 0; i < nbTour; i++){
			jouerUnTour();
		}
		terminerJeu();
	}
	protected abstract void initJeu();
	protected abstract void jouerUnTour();
	protected abstract void terminerJeu();
	public void setIsTourFini(boolean isTourFini){
		this.isTourFini = isTourFini;
	}
	
	public CollectionJoueur getJoueurs(){
		return joueurs;
	}
	public Joueur getJoueurActuel(){
		return joueurActuel;
	}
	
	public int getTourActuel(){
		return tourActuel;
	}
}
