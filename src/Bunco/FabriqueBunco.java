package Bunco;

import Cadriciel.*;

public class FabriqueBunco implements Fabrique {

	public De creerDe() {
		return new De(6);
	}

	public Joueur creerJoueur(int id) {
		return new Joueur(id);
	}

	public Jeu creerJeu() {
		return new JeuBunco();
	}

}
