package Cadriciel;

public interface IStrategie {
	public void brasserLesDes();
	public boolean calculerScoreTour();
	public CollectionJoueur determinerLeVainqueur(Jeu jeu);
	public int getNbTour();
	public int getNbDe();
}
