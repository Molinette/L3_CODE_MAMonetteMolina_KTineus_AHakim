package Cadriciel;

public class Joueur implements Comparable<Joueur> {
	static int nbJoueurs = 0;
	private int score = 0;
	private int id;
	private CollectionDe des;
	
	/**
	 * Constructeur
	 */
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
	
	/**
	 * Brasse tout les dés dans la collection
	 */
	public void brasserLesDes(){
		Cadriciel.Iterator iterateurDes = des.createIterateur();
		while(iterateurDes.hasNext()){
			De de = (De)iterateurDes.next();
			de.brasserDe();
		}
	}
	
	/**
	 * Compare le score du joueur avec celui d'un autre.
	 * @param joueur L'autre joueur
	 */
	public int compareTo(Joueur joueur){
		if(score > joueur.getScore())
			return 1;
		else if(score < joueur.getScore())
			return -1;
		else
			return 0;
	}
}
