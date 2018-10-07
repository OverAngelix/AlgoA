package Laby;

import java.util.Arrays;

public class MyPile {
	Cell[] tab;
	int sommet;
	
	public MyPile() {
		tab=new Cell[8];
		sommet =0;
	}
	
	public Cell peek() {
		if(!isEmpty()) {
		return tab[sommet-1];
		}
		return null;
	}
	
	public boolean isEmpty() {
		return sommet==0;
	}
	
	public Cell pop() {
		if(!isEmpty()) {
			return tab[--sommet];
		}
		return null;
		
	}
	
	public void push(Cell c) {
		if(sommet >tab.length-1) {
			tab = Arrays.copyOf(tab, tab.length*2);
		}
		tab[sommet++]=c;
	}
}
