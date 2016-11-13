package Cadriciel;

public class CollectionDe extends Cadriciel.Collection{
	private De[] tableauDe;
	
	/**
	 * Constructeur
	 * @param nbDe Le nombre de d�s et donc la grandeur de la collection
	 */
	public CollectionDe(int nbDe){
		grandeur = nbDe;
		tableauDe = new De[grandeur];
	}
	
	
	public DeIterator createIterateur(){
		return new DeIterator(tableauDe);
	}
	
	/**
	 * Ajoute un d� dans la collection
	 * @param de Le d� � ajouter
	 */
	public void ajouter(De de){
		tableauDe[nbElements] = de;
		nbElements++;
	}
	
	/**
	 * Retourne un d� � un index en particulier
	 * @param index L'index o� se trouve le d� dans le tableau
	 * @return le d�
	 */
	public De obtenir(int index){
		return tableauDe[index];
	}
}
