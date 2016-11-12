package Cadriciel;

public class Joueur implements Comparable<Joueur> {
	private int score;
	private int id;
	
	public Joueur(int id){
		this.id = id;
	}
	
	public int getScore(){
		return score;
	}
	
	public int getId(){
		return id;
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
