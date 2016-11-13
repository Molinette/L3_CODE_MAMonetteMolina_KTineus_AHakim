package Cadriciel;

public interface IStrategie {
	public void calculerScoreTour(Jeu jeu);
	public CollectionJoueur determinerLeVainqueur(Jeu jeu);
}
