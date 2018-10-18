package tp4;

import java.util.HashMap;

public class Dico  implements BidirectionnalMap<String, String>{
	HashMap<String,String> in = new HashMap<>();
	HashMap<String,String> out = new HashMap<>();
	
	@Override
	public String getFromPrimary(String k) {	
		return in.get(k);
	}

	@Override
	public String getFromSecondary(String k) {
		return out.get(k);
	}

	@Override
	public void put(String k1, String k2) {
		in.put(k1, k2);
		out.put(k2, k1);
	}

	@Override
	public boolean isEmpty() {
		return in.isEmpty() && out.isEmpty();
	}

	@Override
	public void clear() {
		in.clear();
		out.clear();
	}

	@Override
	public void removeFromPrimary(String k1) {
		this.in.remove(k1);	
	}
	
	public String toString() {
		return "VOICI LE DICO SUPREME\n"
				+ in.toString() + ", --> "+out.toString();
	}

}
