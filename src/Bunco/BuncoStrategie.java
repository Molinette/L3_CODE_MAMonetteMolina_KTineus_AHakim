package Bunco;

import Cadriciel.*;


public class BuncoStrategie implements IStrategie {

	/**
	 * Calcule le score du tour pour le jour actuel et decide si le tour est fini pour le joueur.
	 * @param jeu Le jeu dont il est question.
	 */
	public void calculerScoreTour(Jeu jeu) {
		boolean isTourFini = false;
		int score = 0;
		Joueur joueur = jeu.getJoueurActuel();
		CollectionDe des = joueur.getDes();
		
		//Vérifie si ce sont des triplets.
		if(isTriplet(des)){
			
			/*Si le premier dé(et donc tous les dés vu que ce sont des triplets) 
			 est égale au tour actuel, on gagne 21 pts et on fini le tour.*/
			if(des.obtenir(0).getFaceAuDessus() == jeu.getTourActuel()){
				score += 21;
				isTourFini = true;
			//Sinon, on gagne 5 pts
			} else{
				score += 5;
			}
		//Sinon ajoute 1 à chaque fois que la face au dessus du dé est égale au tour actuel.
		}else{
			Cadriciel.Iterator iterateurDes = des.createIterateur();
			while(iterateurDes.hasNext()){
				De de = (De)iterateurDes.next();
				if(de.getFaceAuDessus() == jeu.getTourActuel()){
					score += 1;
				}
			}
			//Si le score est de 0 (et donc qu'aucun dé est égale au tour actuel), on fini le tour.
			if(score == 0){
				isTourFini = true;
			}
		}
		
		joueur.setScore(joueur.getScore() + score);
		jeu.setIsTourFini(isTourFini);
	}

	/**
	 * Tri la collection de joueur de manière décroissante selon leur score
	 * @param jeu Le jeu à calculer
	 */
	public CollectionJoueur determinerLeVainqueur(Jeu jeu) {
		CollectionJoueur joueurs = new CollectionJoueur(jeu.getJoueurs());
		joueurs.sort();
		return joueurs;
	}
	
	/**
	 * Regarde si les dés sont des triplets
	 * @param des La collection de dés à vérifier
	 * @return si il s'agit bien de triplets
	 */
	public boolean isTriplet(CollectionDe des){
		boolean isTriplet = true;
		
		Cadriciel.Iterator iterateurDes = des.createIterateur();
		De deCourant = (De)iterateurDes.next();
		
		while(iterateurDes.hasNext()){
			De deProchain = (De)iterateurDes.next();
			if(deCourant.compareTo(deProchain) != 0){
				isTriplet = false;
			}
			deCourant = deProchain;
		}
		
		return isTriplet;
	}
}
