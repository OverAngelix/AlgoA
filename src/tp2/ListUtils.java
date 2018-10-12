package tp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListUtils {
	
	
	public static List<Integer> genereRdmIntList() {
		Random rand = new Random();
		int sizeList = rand.nextInt(30)+1;
		System.out.println( "taille liste " + sizeList);
		List<Integer> l = new ArrayList<Integer>();
		for ( int cpt = 0; cpt < sizeList; cpt++) {
			int randomNumber = rand.nextInt(100)+1;
			System.out.println(randomNumber);
			l.add(randomNumber);
			randomNumber = 0;
			
		}
		
		return l;
	}
	
	public  void affiche(List<Integer> l) {
		ListIterateur li = new ListIterateur(l);
		while(li.hasNext()) {
			li.next();
		}
		System.out.println(li.toString());
		
	}
	
	public  void afficheInverse(List<Integer> l) {
		ListIterateurInverse li = new ListIterateurInverse(l);
		while(li.hasPrevious()) {
			li.previous();
		}
		System.out.println(li.toString());
	}
	
	public  int somme(List<Integer> l) {
		int result = 0;
		for ( int cpt = 0; cpt < l.size(); cpt++) {
			result+=l.get(cpt);
			
		}
		System.out.println("RESULTAT : " + result);
		return result;
	}
	
	public  int moyenne(List<Integer> l) {
		int total = 0;
		for ( int cpt = 0; cpt < l.size(); cpt++) {
			total+=l.get(cpt);
		}
		int moyenne = total/l.size();
		return moyenne;
	}
	
	public  int min(List<Integer> l) {
		int min = l.get(0);
		for ( int cpt = 1; cpt < l.size(); cpt++) {
			if ( l.get(cpt) < min) {
					min = l.get(cpt);
			}
		}
		
		return min;
	}
	
	public  int max(List<Integer> l) {
		int max = l.get(0);
		for ( int cpt = 1; cpt < l.size(); cpt++) {
			if ( l.get(cpt) > max) {
					max = l.get(cpt);
			}
		}
		
		return max;
	}
	
	public  List<Integer> positions(List<Integer> l, int n) {
       List<Integer> l2 = new ArrayList<Integer>();
       
       for ( int cpt = 0; cpt < l.size(); cpt++) {
    	   if ( l.get(cpt) == n) {
    		   l2.add(cpt);
    	   }
       }
		return l2;
	}
	
	public  List<Integer> paire(List<Integer> l) {
	       List<Integer> l2 = new ArrayList<Integer>();
	       
	       for ( int cpt = 0; cpt < l.size(); cpt++) {
	    	   if ( l.get(cpt) % 2 == 0) {
	    		   l2.add(l.get(cpt));
	    	   }
	       }
			
			return l2;
	}
	
	public static boolean estTrie(List<Integer> l) {
		for ( int cpt = 0; cpt < l.size()-1; cpt++) {
			if ( l.get(cpt) > l.get(cpt+1)) {
				return false;
			}
			
		}
		return true;
	}
	
	public  List<Integer> trie(List<Integer> l) {
	       List<Integer> l2 = l;
	       
	       Collections.sort(l2);
	       
	       return l2;
			
			
	}
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l = genereRdmIntList();
		
		System.out.println(estTrie(l));
	}
	
	
	

}
