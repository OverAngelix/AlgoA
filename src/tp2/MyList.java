package tp2;

public class MyList<E> {
	public  Node<E> first=null;
	public Node<E> last=null;
	
	public MyList() {	
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
/*	public static int indexOf(Object o) {
		
	}
	
	public static boolean contains(Object o) {
		
	}
	
	public static int lastIndexOf(Object o) {
		
	}
	*/
	public String toString() {
		String s="";
		Node<E> e = first;
		while(e!= null) {
			s+=e.getValue()+" ";
			s.substring(0, s.length()-1);
			e=e.getNext();
		}
		System.out.println(s);
		return s;
	}
	
	public boolean add(E e) {
		Node sui = new Node<E>(e, null);
		if(isEmpty()) {
			first = sui;
			last = sui;
			return true;
		}else {
			last.setNext(sui);
			return true;
		}
	}
	
	public int size() {
		int idx=0;
		Node<E> e = first;
		while(e!= null) {
			idx++;
			e=e.getNext();
		}
		return idx;
	}
	
	public void clear() {
		last=null;
		first=null;
	}
	/*
	public E get(int idx) {
		
	}
	
	public void add(int idx,E element) {
		
	}
	
	public E remove(int idx) {
		
	}
	
	public boolean(Object o) {
		
	}*/

}
