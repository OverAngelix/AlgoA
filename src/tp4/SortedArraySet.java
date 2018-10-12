package tp4;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;

public class SortedArraySet<E> {
	
	private E[] tab;
	private int cpt;
	final Comparator<? super E> comparator;
	

	public SortedArraySet(E[] tab, int cpt, Comparator<? super E> comparator) {
		this.tab = tab;
		this.cpt = cpt;
		this.comparator = comparator;
	}
	
	public SortedArraySet(Collection<? extends E> collection) {
		tab=(E[]) collection.toArray();
		this.comparator = null;
	}
	
	public SortedArraySet(Comparator<? super E> comparator) {
		tab=(E[]) (new Object[100]);
		this.comparator = comparator;
	}
	
	
	public  SortedArraySet() {
		tab=(E[]) (new Object[100]);
		this.comparator = null;
	}
	
	public int compare(E e1, E e2) throws Exception {
		if(comparator!=null) {
			return comparator.compare(e1, e2);
		}
		if(!(e1 instanceof Comparable && e2 instanceof Comparable)) {
			throw new Exception("les elements ne sont pas comparables");
		}
		return (((Comparable)e1).compareTo(e2));
	}

	public SortedArraySet<E> clone(){
		return new SortedArraySet<>(tab, cpt, comparator);
	}

	public int size() {
		return cpt;
	}

	public boolean isEmpty() {
		return cpt==0;
	}
	
	private int indexOf(E element) {
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==element) {
				return i;
			}	
		}
		return -1;
	}
	
	private boolean insert(int idx,E element) {
		if(tab[idx]==null) {
			tab[idx]=element;
			return true;
		}
		return false;
	}
	
	private boolean remove(int idx) {
		if(tab[idx]!=null) {
			tab[idx]=null;
			return true;
		}
		return false;
	}
}