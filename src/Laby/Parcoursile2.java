package Laby;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Parcoursile2 {
	
	public static void main(String[] args) {
		Labyrinthe la = new Labyrinthe();
		//Queue<Cell> p = new LinkedList<>();
		MyFile p = new MyFile();
		Cell depart = new Cell(0, 1);
		p.offer(depart);
		la.poserMarque(depart.x, depart.y);
		while(!p.isEmpty()) {
			try {
				Thread.sleep(10) ;
				}
				catch(InterruptedException e){}
			Cell actu = p.peek();
			Cell fin = new Cell(la.n()-1, la.n()-2);
			if(actu.x==fin.x && actu.y==fin.y) {
				System.out.println("SORTIE TROUVE");
				System.exit(-1);
			}
			else {
				
				if(!la.estMarque(actu.x+1, actu.y) && !la.estMur(actu.x+1, actu.y)) {
					Cell suiv = new Cell(actu.x+1, actu.y);
					la.poserMarque(suiv.x, suiv.y);
					p.offer(suiv);
				}
				else if(actu.x>1 && !la.estMarque(actu.x-1, actu.y) && !la.estMur(actu.x-1, actu.y)) {
					Cell suiv = new Cell(actu.x-1, actu.y);
					la.poserMarque(suiv.x, suiv.y);
					p.offer(suiv);
					
				}
				else if (!la.estMarque(actu.x, actu.y+1) && !la.estMur(actu.x, actu.y+1)) {
					Cell suiv = new Cell(actu.x, actu.y+1);
					la.poserMarque(suiv.x, suiv.y);
					p.offer(suiv);
					
				}else if(!la.estMarque(actu.x, actu.y-1) && !la.estMur(actu.x, actu.y-1)) {
					Cell suiv = new Cell(actu.x, actu.y-1);
					la.poserMarque(suiv.x, suiv.y);
					p.offer(suiv);
				}
				
				else {
					la.poserMarqueRetour(actu.x, actu.y);
					p.poll();
					
				}
			}
		}
		System.out.println("Il n'y a pas de chemin reliant l'entrée à la sortie");
	}
}
