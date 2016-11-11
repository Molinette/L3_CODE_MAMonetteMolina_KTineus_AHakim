package Cadriciel;

import java.util.Random;

public class De implements Comparable<De>{
	private int faceAuDessus;
	private int nbFaces;
	
	public De(){
		this.nbFaces = 6;
	}
	
	public De(int nbFace){
		this.nbFaces = nbFaces;
	}
	
	public void brasserDe(){
		faceAuDessus = new Random().nextInt(6) + 1;
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
