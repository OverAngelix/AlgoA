package Laby;

import java.util.Arrays;

public class MyFile {
	Cell[] tab;
	int sommet;
	int queue;
	int nItems;
	
	public MyFile() {
		tab=new Cell[8];
		sommet =0;
		queue= 0;
		nItems=0;
	}
	
	public Cell peek() {
		if(!isEmpty()) {
		return tab[sommet];
		}
		return null;
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	
	public Cell poll() {
		if(!isEmpty()) {
        Cell temp = tab[sommet++];
	    if (sommet == tab.length) {
	      sommet = 0;
	    }
	    nItems--;
	    return temp;}
		return null;
		
	}
	
	public void offer(Cell c) {
		if (queue == tab.length - 1)
		      queue = -1;
		    tab[++queue] = c;
		    nItems++;
	}
}
