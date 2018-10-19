package tp5;

import java.util.LinkedList;

public class Chainage implements HashTable{
	private LinkedList<HashCouple> [] ls;
	private final int SIZEDEF = 8;
	public Chainage(int size) {
		ls = (LinkedList<HashCouple>[])new LinkedList<?> [size]; 
		for(int i =0;i<size;i++) {
			ls[i]= new LinkedList<HashCouple>();
		}
	}
	
	public Chainage() {
		ls = (LinkedList<HashCouple>[])new LinkedList<?> [SIZEDEF]; 
		for(int i =0;i<SIZEDEF;i++) {
			ls[i]= new LinkedList<HashCouple>();
		}
	}
	
	public String ToString() {
		String result="";
		for(int i =0;i<ls.length;i++) {
			result+="[ ";
			for(HashCouple h : ls[i]) {
				result+=h.getValue()+",";
			}
			result=result.substring(0,result.length()-1);
			result+=" ]";
		}
		//System.out.println(result);
		return result;
	}
	@Override
	public Integer put(String key, Integer value) {
		int hash = key.hashCode();
		hash = Math.floorMod(hash, ls.length);
		Integer pl = null;
		for(HashCouple h :ls[hash]) {
			if(h.getKey().equals(key)) {
				pl=h.getValue();
				h.setValue(value);
			}
		}
		if(pl==null) {
		ls[hash].add(new HashCouple(key, value));
		}
		return pl;
	}

	@Override
	public Integer get(String key) {
		int hash = key.hashCode();
		hash = Math.floorMod(hash, ls.length);
		Integer pl = null;
		for(HashCouple h :ls[hash]) {
			if(h.getKey().equals(key)) {
				pl=h.getValue();
			}
		}
		
		return pl;
	}

	@Override
	public boolean remove(String key) {
		int hash = key.hashCode();
		hash = Math.floorMod(hash, ls.length);
		Integer pl = null;
		for(HashCouple h :ls[hash]) {
			if(h.getKey().equals(key)) {
				h = null;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean contains(String key) {
		int hash = key.hashCode();
		hash = Math.floorMod(hash, ls.length);
		Integer pl = null;
		for(HashCouple h :ls[hash]) {
			if(h.getKey().equals(key)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int size() {
		return ls.length;
	}

}
