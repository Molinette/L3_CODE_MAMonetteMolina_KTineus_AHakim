package Bunco;
import Cadriciel.*;

public class JeuBunco extends Jeu{
	
	public JeuBunco(){
		nbTour = 6;
	}
	
	protected void initJeu(){
		strategie = new BuncoStrategie();
		int nbDesParJoueur = 3;
		int nbFacesDe = 6;
		Fabrique fabrique = new Fabrique();
		
		for(int i = 0; i < joueurs.grandeur() ; i++){
			joueurs.ajouter(fabrique.creerJoueur());
			CollectionDe des = new CollectionDe(nbDesParJoueur);
			for(int j = 0; j < des.grandeur() ; j++){
				des.ajouter(fabrique.creerDe(nbFacesDe));
			}
			joueurs.obtenir(i).setDes(des);
		}
		
	}
	protected void jouerUnTour(){
		Cadriciel.Iterator iterateurJoueurs = joueurs.createIterateur();
		while(iterateurJoueurs.hasNext()){
			joueurActuel = (Joueur)iterateurJoueurs.next();
			do{
				joueurActuel.brasserLesDes();
				strategie.calculerScoreTour(this);
			}while(isTourFini);
		}
		tourActuel++;
	}
	protected void terminerJeu(){
		joueurs = strategie.determinerLeVainqueur(this);
	}
}