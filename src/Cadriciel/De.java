package Cadriciel;

import java.util.Random;

public class De implements Comparable<De>{
	private int faceAuDessus;
	private int nbFaces;
	
	public De(){
		this.nbFaces = 6;
		brasserDe();
	}
	
	public De(int nbFaces){
		this.nbFaces = nbFaces;
		brasserDe();
	}
	
	public void brasserDe(){
		faceAuDessus = new Random().nextInt(nbFaces) + 1;
	}
	
	public int getFaceAuDessus(){
		return faceAuDessus;
	}
	
	public int compareTo(De de){
		if(faceAuDessus > de.getFaceAuDessus())
			return 1;
		else if(faceAuDessus < de.getFaceAuDessus())
			return -1;
		else
			return 0;
	}
}
