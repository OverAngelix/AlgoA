package tp6;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BinarySearchTree<K, V> implements Map<K, V>{
	private K key;
	private V value;
	private BinarySearchTree<K, V> left;
	private BinarySearchTree<K, V> right;
    private Comparator<K> comparator;

	public BinarySearchTree(K key, V value) {
		this.key=key;
		this.value=value;
		left=null;
		right=null;
	}
	
	public BinarySearchTree() {
		this.key=null;
		this.value=null;
		left=null;
		right=null;
	}
	
	private int compare(K x, K y)
	   {
	      return comparator.compare(x,y);
	   }

	public String toStringInfice() {
		String s="";
		s+=left.toString();
		s+=this.toString();
		s+=right.toString();
		return s;
	}
	
	public BinarySearchTree<K,V> search(K e){
		BinarySearchTree<K, V> result = this;
		while (result != null) {
			if (comparator.compare(e, result.key) < 0) {
				result = result.left;
			}
			else if (comparator.compare(e, result.key) > 0) {
				result = result.right;
			}
			else if(comparator.compare(e, result.key) == 0) {
				return result;
			}
		}
		return null;
	}
	
	
	
	
	@Override
	public int size() {
		
	}

	@Override
	public boolean isEmpty() {
		return key ==null;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}


}
