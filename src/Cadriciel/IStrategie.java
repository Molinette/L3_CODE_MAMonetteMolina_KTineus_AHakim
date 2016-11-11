package Cadriciel;

public interface IStrategie {
	public void brasserLesDes();
	public void calculerScoreTour();
	public CollectionJoueur determinerLeVainqueur(Jeu jeu);
	public boolean isTourFini();
	public boolean isPartieFini();
}
