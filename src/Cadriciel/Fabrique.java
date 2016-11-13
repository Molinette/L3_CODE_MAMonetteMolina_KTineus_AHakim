package Cadriciel;

public class Fabrique {
	public De creerDe(int nbFaces){
		return new De(nbFaces);
	}
	
	public Joueur creerJoueur(){
		return new Joueur();
	}
}
