package Cadriciel;

public abstract class DeroulementPartie {
	public void jouerUnePartie(){
	}
	protected abstract void initJeu();
	protected abstract void jouerUnTour();
	protected abstract void terminerJeu();
}
