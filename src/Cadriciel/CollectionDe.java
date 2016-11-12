package Cadriciel;

public class CollectionDe {
	private De[] tableauDe;
	
	public CollectionDe(int nbDe){
		tableauDe = new De[nbDe];
	}
	
	public DeIterator createIterateur(){
		return new DeIterator(tableauDe);
	}
	
	public void ajoutDe(De de, int index){
		tableauDe[index] = de;
	}
}
