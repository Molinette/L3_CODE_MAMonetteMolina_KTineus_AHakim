package Cadriciel;

public class CollectionDe extends Cadriciel.Collection{
	private De[] tableauDe;
	
	/**
	 * Constructeur
	 * @param nbDe Le nombre de dés et donc la grandeur de la collection
	 */
	public CollectionDe(int nbDe){
		grandeur = nbDe;
		tableauDe = new De[grandeur];
	}
	
	
	public DeIterator createIterateur(){
		return new DeIterator(tableauDe);
	}
	
	/**
	 * Ajoute un dé dans la collection
	 * @param de Le dé à ajouter
	 */
	public void ajouter(De de){
		tableauDe[nbElements] = de;
		nbElements++;
	}
	
	/**
	 * Retourne un dé à un index en particulier
	 * @param index L'index où se trouve le dé dans le tableau
	 * @return le dé
	 */
	public De obtenir(int index){
		return tableauDe[index];
	}
}
