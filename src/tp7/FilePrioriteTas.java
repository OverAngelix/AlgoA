package tp7;

import java.util.Comparator;

public class FilePrioriteTas<E> implements FilePriorite<E>{
	E[] tab;
	final int DEFAULTSIZE;
	Comparator<? super E> comp;
	public FilePrioriteTas() {
		DEFAULTSIZE=7;
		tab = (E[]) new Object[DEFAULTSIZE];
	}
	
	public FilePrioriteTas(int size) {
		DEFAULTSIZE=size;
		tab = (E[]) new Object[DEFAULTSIZE];
	}
	
	
	private int compare(E e1,E e2) {
		if(comp!=null) {
			return comp.compare(e1, e2);
		}
		return ((Comparable<E>)e1).compareTo(e2);
	}
	
	@Override
	public void clear() {
		for(int i = 0; i<size(); i++) {
			tab[i] = null;
		}
		
	}

	@Override
	public Comparator<? super E> comparator() {
		 return comp;
	}

	
	@Override
	public String toString() {
		int sss= size();
		if(sss==0) {
			return "";
		}
		String s = "[";
		for(int i = 0;i<sss;i++) {
			s += tab[i]+", ";
		}
		s= s.substring(0,s.length()-2);
		s+="]";
		return s;
	}
	
	public int parent(int i) { 
		 return (i-1)/2; 

	 } 
	  
	
	@Override
	public boolean offer(E e) {
		if(size() == tab.length) {
			return false;
		}
		int i = size();
		tab[i] = e;
		if(i == 0) {
			return true;
		}
		while(compare(e,tab[parent(i)]) > 0) {
			E tmp = tab[parent(i)];
			tab[parent(i)] = e;
			tab[i] = tmp;
			i = parent(i);
		}
		return true;
	}

	@Override
	public E peek() {
		return tab[0];
	}
	
	

	@Override
    public E poll() {
	if(isEmpty()) {
	    return null;
	}comp = null;
	E disparu = tab[0];
	tab[0]=tab[size()-1];
	tab[size()-1]=null;
	boolean trie=true;
	while(!trie) {
	    trie=true;
	    for(int cpt=0;cpt<tab.length;cpt++) {
		int idxC1=(cpt*2)+1;
		int idxC2=(cpt*2)+2;
		E tmp;
		if(idxC1 < tab.length && idxC2 < tab.length && tab[idxC1]!=null && tab[idxC2]!= null) {
		    tmp=tab[cpt];
		    if(compare(tab[cpt],tab[idxC1])<0) {
			tab[cpt]=tab[idxC1];
			tab[idxC1]=tmp;
			trie=false;
		    }else if(compare(tab[cpt],tab[idxC2])<0) {
			tab[cpt]=tab[idxC2];
			tab[idxC1]=tmp;
			trie=false;
		    }
		}
	    }
	}
	return disparu;
    }

	@Override
	public int size() {
		int element =0;
		for(int i =0;i<tab.length;i++) {
			if(tab[i]!=null) {
				element++;
			}
		}
		return element;
	}

	@Override
	public boolean isEmpty() {
		return tab[0]==null;
	}
	

}


