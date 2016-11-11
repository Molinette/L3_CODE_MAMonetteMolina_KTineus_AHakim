package Cadriciel;

public class CollectionDe {
	private De[] tableauDe;
	
	public CollectionDe(int nbDe){
		tableauDe = new De[nbDe];
	}
	
	public Iterator createIterateur(){
		return new DeIterator(tableauDe);
	}
}
