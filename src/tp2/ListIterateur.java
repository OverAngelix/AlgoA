package tp2;

import java.util.Iterator;
import java.util.List;

public class ListIterateur implements Iterator<Integer> {
	int idx = 0;
	List<Integer> l;
	String s = "";
	
	public ListIterateur(List<Integer> l) {
		this.l = l;
	}

	@Override
	public boolean hasNext() {
		return idx < l.size();
	}

	@Override
	public Integer next() {
		if ( hasNext() ) {
			if(idx ==l.size()-1) {
				s+=l.get(idx);
			}else {
				s+=l.get(idx) + " -> ";
			}
			idx++;
		}
		
		
		return null;
	}
	
	public String toString() {
		return s;
	}

}
