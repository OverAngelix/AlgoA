package tp2;

public class Node<E> {
	private E value;
	private Node<E> next;
	
	public Node(E val, Node<E> n) {
		this.value = val;
		this.next = n;
	}
	
	public E getValue() {
		return this.value;
	}
	
	public Node<E> getNext() {
		return this.next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

}
