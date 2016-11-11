package Cadriciel;

public class DeIterator implements Iterator<De> {
	private int pos = 0;
	private De[] collectionDe;
	
	public DeIterator(De[] collectionDe){
		this.collectionDe = collectionDe;
	}
	
	public boolean hasNext(){
		if(pos >= collectionDe.length || collectionDe[pos] == null)
			return false;
		else
			return true;
	}
	
	public De next(){
		De de = collectionDe[pos];
		pos++;
		return de;
	}
}
