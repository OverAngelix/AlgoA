package tp5;

import java.util.LinkedList;

public class Adressage implements HashTable{
	HashCouple [] hc;
	private final int SIZEDEF = 8;
	
	public Adressage(int size) {
		hc = new HashCouple [size];
		for(int i =0 ;i<size;i++) {
			hc[i]=null;
		}
	}
	
	public Adressage() {
		hc = new HashCouple [SIZEDEF];
		for(int i =0 ;i<SIZEDEF;i++) {
			hc[i]=null;
		}
	}
	
	@Override
	public Integer put(String key, Integer value) {
		int h = key.hashCode();
		h = Math.floorMod(h, hc.length);
		if(hc[h]==null) {
			hc[h]=new HashCouple(key, value);
			return null;
		}
		while(hc[h]!=null) {
			if(hc[h].getKey().equals(key)) {
				Integer ol = hc[h].getValue();
				hc[h]=new HashCouple(key, value);
				return ol;
			}
			h=Math.floorMod(h+1, hc.length);
			if(hc[h]==null) {
				hc[h]=new HashCouple(key, value);
				return 1;
			}
			
		}
		return null;
	}

	@Override
	public Integer get(String key) {
		int h = key.hashCode();
		h = Math.floorMod(h, hc.length);
		
		while(hc[h]!=null) {
			if(hc[h].getKey().equals(key)) {
				return hc[h].getValue();
			}
			h=Math.floorMod(h+1, hc.length);
		}
		return null;
	}

	@Override
	public boolean remove(String key) {
		int h = key.hashCode();
		h = Math.floorMod(h, hc.length);
		int localidx=h;
		boolean IsDelete=false;
		while(!IsDelete) {
		    if(hc[h]==null) {
		    	return false;
		    }else if(hc[h].getKey().equals(key)){
				hc[h]=null;
				localidx=h;
				h=Math.floorMod(h+1, hc.length);
				while(hc[h]!=null) {
				    if(Integer.valueOf(hc[h].getKey().hashCode()%hc.length)<=localidx) {
					hc[localidx]=new HashCouple(hc[h].getKey(), hc[h].getValue());
					hc[h]=null;
					localidx=h;
				    }
				    h=Math.floorMod(h+1, hc.length);
				}
				return true;
		    }else {
		    	h=Math.floorMod(h+1, hc.length);
		    }
		}
		return true;
	}

	@Override
	public boolean contains(String key) {
		int h = key.hashCode();
		h = Math.floorMod(h, hc.length);
		while(hc[h]!=null) {
			if(hc[h].getKey().equals(key)) {
				return true;
			}	
			h=Math.floorMod(h+1, hc.length);
		}
		return false;
	}

	@Override
	public int size() {
		return hc.length;
	}

	public String toString() {
		String result="";
		for(int i = 0;i<size();i++) {
			if(hc[i]==null) {
				result+=" ,";
			}else {
			result+=hc[i].getValue()+" ,";
			}
		}
		System.out.println(result);
		return result;
	}
}
