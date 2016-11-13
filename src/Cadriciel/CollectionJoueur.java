package Cadriciel;

public class CollectionJoueur extends Cadriciel.Collection{
	private Joueur[] tableauJoueur;
	
	public CollectionJoueur(int nbJoueur){
		grandeur = nbJoueur;
		tableauJoueur = new Joueur[nbJoueur];
	}
	
	public CollectionJoueur(CollectionJoueur collectionJoueur){
		this.tableauJoueur = new Joueur[collectionJoueur.grandeur()];
		for(int i = 0; i < collectionJoueur.grandeur(); i++){
			this.tableauJoueur[i] = collectionJoueur.obtenir(i);
		}
		this.grandeur = collectionJoueur.grandeur();
		this.nbElements = collectionJoueur.getNbElements(); 
	}
	
	public JoueurIterator createIterateur(){
		return new JoueurIterator(tableauJoueur);
	}
	
	public void ajouter(Joueur joueur){
		tableauJoueur[nbElements] = joueur;
		nbElements++;
	}
	
	public Joueur obtenir(int index){
		return tableauJoueur[index];
	}
	
	public void sort(){
		Joueur joueurCompare;
		Joueur joueurCompareTemp;
		int j;
		for (int i = 1; i < grandeur; i++){
			joueurCompare = tableauJoueur[i];
			j = i-1;
			
			/*On compare le joueur comparée avec chacune des joueurs se trouvant à sa gauche
			 * si le joueur à sa gauche est plus petit (retour == 1), on échange le joueur comparé avec celui plus petit.
			 * Si le joueur à sa gauche est plus grand (retour == -1), on passe au prochain joueur comparé. i++*/
			while(j >= 0 && joueurCompare.compareTo(tableauJoueur[j]) == 1){
				joueurCompareTemp = tableauJoueur[j];
				tableauJoueur[j] = tableauJoueur[j+1];
				tableauJoueur[j+1] = joueurCompareTemp;
				j--;
			}
		}
	}
}
