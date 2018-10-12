package tp4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ExoSet{

	public static void main(String[] args) {
		Set<Integer> ens1 = new HashSet<>();
		Set<Integer> ens2 = new HashSet<>();
		
		for(int i=0;i<10;i++) {
			Random rand = new Random();
			ens1.add(rand.nextInt(100));
			ens2.add(rand.nextInt(100));
		}
		afficher(ens1);
		afficher(ens2);
		afficher(inter(ens1,ens2));
		afficher(union(ens1,ens2));
	}
	
	public static void afficher(Set<Integer> ens) {
		String s="";
		s+="["+ens.size()+"]{";
		for(Integer e : ens) {
			s+=e.toString()+", ";
		}
		s=s.substring(0, s.length()-2);
		s+="}";
		System.out.println(s);
	}
	
	public static Set<Integer> inter(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> result = new HashSet<>();
		for(Integer e :s1) {
			for(Integer e2 :s2) {
				if(e.equals(e2)) {result.add(e2);}
			}
		}
		return result;
	}
	
	public static Set<Integer> union(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> result = new HashSet<>();
		for(Integer e :s1) {
			result.add(e);
		}
		for(Integer e2 :s2) {
			result.add(e2);
		}
		return result;
	}

	public static boolean isIn(Set<Integer> s1, Set<Integer> s2) {
		int cpt=0;
		for(Integer e2 :s2) {
			for(Integer e :s1) {
				if(e.equals(e2)) {cpt++;}
			}
		}
		return cpt>=s2.size();
	}
}
