package tp5;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class HashCouple implements Map.Entry<String,Integer> {
	
	private String cle;
	private Integer information;
	
	public HashCouple(String cle, Integer information) {
		this.cle = cle;
		this.information = information;
	}

	@Override
	public String getKey() {
		return cle;
	}

	@Override
	public Integer getValue() {
		return information;
	}

	@Override
	public Integer setValue(Integer arg0) {
		information=arg0;
		return information;
	}

	@Override
	public String toString() {
		return "HashCouple [cle=" + cle + ", information=" + information + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		HashCouple h = (HashCouple) o;
		return this.getKey()==h.getKey() && this.getValue()==h.getValue();
	}

}
