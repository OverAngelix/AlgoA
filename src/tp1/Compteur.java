package tp1;

public class Compteur {
	private int comp;
	private int perm;
	
	
	public void incComp() {
		comp=comp+1;
	}
	
	public void incPerm() {
		perm=perm+1;
	}
	
	public void incComp(int n) {
		comp=comp+n;
	}
	
	public void incPerm(int n) {
		perm=perm+n;
	}

	@Override
	public String toString() {
		return "COMPARAISON :" + comp + " ET PERMUTATION : " + perm;
	}
	
	public void reset() {
		comp=0;
		perm=0;
	}
	
}
