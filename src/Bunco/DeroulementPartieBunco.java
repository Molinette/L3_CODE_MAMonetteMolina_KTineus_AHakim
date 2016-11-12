package Bunco;
import Cadriciel.*;

public class DeroulementPartieBunco extends DeroulementPartie{
	Jeu jeu;
	int nbJoueurs = 2;
	
	public void jouerUnePartie(){
		initJeu();
		
		for(int i = 0; i < jeu.getNbTour(); i++){
			jouerUnTour();
		}
		
		terminerJeu();
	}
	protected void initJeu(){
		Fabrique fabrique = new FabriqueBunco();
		
		jeu = fabrique.creerJeu();
		
		//cr�er les d�s et les place dans la collection de d�s de jeuBanco
		for(int i = 0; i < jeu.getNbDe(); i++){
			jeu.getDes().ajoutDe(fabrique.creerDe(), i);
		};
		
		//cr�er les joueurs et les place dans la collection de joueurs de jeuBanco
		jeu.setJoueurs(new CollectionJoueur(nbJoueurs));
		for(int j = 0; j < nbJoueurs; j++){
			jeu.getJoueurs().ajoutJoueur(fabrique.creerJoueur(j+1), j);
		};
	}
	protected void jouerUnTour(){
		
	}
	protected void terminerJeu(){
		
	}
}
