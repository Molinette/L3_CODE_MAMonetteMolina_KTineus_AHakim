package Cadriciel;

public abstract class Fabrique {
	public De creerDe(int nbFaces){
		return new De(nbFaces);
	}
	
	public Joueur creerJoueur(int id){
		return new Joueur(id);
	}
	
	public abstract Jeu creerJeu();
}
