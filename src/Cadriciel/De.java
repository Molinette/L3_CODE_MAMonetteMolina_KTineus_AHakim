package Cadriciel;

import java.util.Random;

public class De implements Comparable<De>{
	private int faceAuDessus;
	private int nbFaces;
    
	/**
	 * Constructeur
	 */
	public De(){
		this.nbFaces = 6;
		brasserDe();
	}
	
	/**
	 * Constructeur
	 * @param nbFaces Le nombre de faces que le dé a.
	 */
	public De(int nbFaces){
		this.nbFaces = nbFaces;
		brasserDe();
	}
	
	/**
	 * Brasse le dé et remplace la face au dessus par un face au hasard.
	 */
	public void brasserDe(){
		faceAuDessus = new Random().nextInt(nbFaces) + 1;
	}
	
	public int getFaceAuDessus(){
		return faceAuDessus;
	}
	
	/**
	 * Compare la face au dessus d'un dé avec celle d'un autre.
	 * @param de Le dé à comparer
	 */
	public int compareTo(De de){
		if(faceAuDessus > de.getFaceAuDessus())
			return 1;
		else if(faceAuDessus < de.getFaceAuDessus())
			return -1;
		else
			return 0;
	}
}
