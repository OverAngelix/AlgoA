package Laby;

import java.util.Arrays;

public class MyFile {
	Cell[] tab;
	int sommet;
	int queue;
	
	public MyFile() {
		tab=new Cell[8];
		sommet =0;
		queue= 0;
	}
	
	public Cell peek() {
		if(!isEmpty()) {
		return tab[queue];
		}
		return null;
	}
	
	public boolean isEmpty() {
		return sommet==0;
	}
	
	public Cell poll() {
		if(!isEmpty()) {
			return tab[--sommet];
		}
		return null;
		
	}
	
	public void offer(Cell c) {
		if(sommet >tab.length-1) {
			tab = Arrays.copyOf(tab, tab.length*2);
		}
		tab[sommet++]=c;
	}
}
