package Bunco;

import Cadriciel.*;


public class BuncoStrategie implements IStrategie {

	@Override
	public void calculerScoreTour(Jeu jeu) {
		boolean isTourFini = false;
		int score = 0;
		Joueur joueur = jeu.getJoueurActuel();
		CollectionDe des = joueur.getDes();
		
		if(isTriplet(des)){
			if(des.obtenir(0).getFaceAuDessus() == jeu.getTourActuel()){
				score += 21;
				isTourFini = true;
			} else{
				score += 5;
			}
		}else{
			Cadriciel.Iterator iterateurDes = des.createIterateur();
			while(iterateurDes.hasNext()){
				De de = (De)iterateurDes.next();
				if(de.getFaceAuDessus() == jeu.getTourActuel()){
					score += 1;
				}
			}
			if(score == 0){
				isTourFini = true;
			}
		}
		
		joueur.setScore(joueur.getScore() + score);
		jeu.setIsTourFini(isTourFini);
	}

	@Override
	public CollectionJoueur determinerLeVainqueur(Jeu jeu) {
		CollectionJoueur joueurs = new CollectionJoueur(jeu.getJoueurs());
		joueurs.sort();
		return joueurs;
	}
	
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
