package Cadriciel;

public abstract class Jeu implements IStrategie{
	private int tourActuel;
	private CollectionJoueur joueurs;
	private CollectionDe des;
	
	public Jeu(){

	}
	
	public int getTourActuel(){
		return tourActuel;
	}
	
	public void setTourActuel(int tourActuel){
		this.tourActuel = tourActuel;
	}
	
	public CollectionJoueur getJoueurs(){
		return joueurs;
	}
	
	public void setJoueurs(CollectionJoueur joueurs){
		this.joueurs = joueurs;
	}
	
	public CollectionDe getDes(){
		return des;
	}
	
	public void setDes(CollectionDe des){
		this.des = des;
	}
}
