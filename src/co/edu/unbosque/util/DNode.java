package co.edu.unbosque.util;

public class DNode<E> {

	private E data;
	private DNode<E> prev;
	private DNode<E> next;

	public DNode() {
		// TODO Auto-generated constructor stub
	}

	public DNode(E data) {
		this.data = data;
	}

	public DNode(E data, DNode<E> prev, DNode<E> next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public DNode<E> getPrev() {
		return prev;
	}

	public void setPrev(DNode<E> prev) {
		this.prev = prev;
	}

	public DNode<E> getNext() {
		return next;
	}

	public void setNext(DNode<E> next) {
		this.next = next;
	}
}
