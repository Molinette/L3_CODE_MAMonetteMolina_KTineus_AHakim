package Bunco;
import Cadriciel.*;

public class JeuBunco extends Jeu{
	
	public JeuBunco(){
		setDes(new CollectionDe(getNbDe()));
	}
	
	public void brasserLesDes(){
		Iterator<De> iterateur = getDes().createIterateur();
		while(iterateur.hasNext()){
			iterateur.next().brasserDe();
		}
	}
	
	public boolean calculerScoreTour(){
		return true;
	}
	
	public CollectionJoueur determinerLeVainqueur(Jeu jeu){
		return null;
	}
	
	public int getNbTour(){
		return 6;
	}
	
	public int getNbDe(){
		return 3;
	}
}
