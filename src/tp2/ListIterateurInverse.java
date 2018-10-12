package tp2;

import java.util.Iterator;
import java.util.List;

public class ListIterateurInverse{
	int idx=0;
	List<Integer> l;
	String s = "";
	
	public ListIterateurInverse(List<Integer> l) {
		this.l = l;
		idx=l.size()-1;
	}

	public boolean hasPrevious() {
		return 0<= idx;
	}

	public Integer previous() {
		if ( hasPrevious() ) {
			if(idx ==0) {
				s+=l.get(idx);
			}else {
				s+=l.get(idx) + " -> ";
			}
			idx--;
		}
		
		
		return null;
	}
	
	public String toString() {
		return s;
	}

}
