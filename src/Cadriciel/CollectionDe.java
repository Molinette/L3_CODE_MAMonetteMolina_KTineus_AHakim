package Cadriciel;

public class CollectionDe extends Cadriciel.Collection{
	private De[] tableauDe;
	
	public CollectionDe(int nbDe){
		grandeur = nbDe;
		tableauDe = new De[grandeur];
	}
	
	public DeIterator createIterateur(){
		return new DeIterator(tableauDe);
	}
	
	public void ajouter(De de){
		tableauDe[nbElements] = de;
		nbElements++;
	}
	
	public De obtenir(int index){
		return tableauDe[index];
	}
}
