package Cadriciel;

public class Joueur implements Comparable<Joueur> {
	static int nbJoueurs = 0;
	private int score = 0;
	private int id;
	private CollectionDe des;
	
	public Joueur(){
		nbJoueurs++;
		this.id = nbJoueurs;
	}
	
	public CollectionDe getDes(){
		return des;
	}
	
	public void setDes(CollectionDe des){
		this.des = des;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public int getId(){
		return id;
	}
	
	public void brasserLesDes(){
		Cadriciel.Iterator iterateurDes = des.createIterateur();
		while(iterateurDes.hasNext()){
			De de = (De)iterateurDes.next();
			de.brasserDe();
		}
	}
	
	public int compareTo(Joueur joueur){
		if(score > joueur.getScore())
			return 1;
		else if(score < joueur.getScore())
			return -1;
		else
			return 0;
	}
}
