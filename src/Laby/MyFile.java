package Laby;

import java.util.Arrays;

public class MyFile {
	Cell[] tab;
	int sommet;
	int queue;
	int nItems;
	
	public MyFile() {
		tab=new Cell[1000];
		sommet =0;
		queue= 0;
		nItems=0;
	}
	
	public Cell peek() {
		return tab[queue];
		
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	
	public Cell poll() {
		
        tab[queue++]=null;
        nItems--;
		return null;
		
	}
	
	public void offer(Cell c) {
		    tab[sommet++] = c;
		    nItems++;
	}
}
