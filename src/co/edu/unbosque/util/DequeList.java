package co.edu.unbosque.util;

public class DequeList<E> extends MyDoubleLinkedList<E> implements Deque<E> {
	// colas fifo, first int, first out
	// pilas lifo, last int, first out
	private DNode<E> tail;
	private int size;

	public DequeList() {
		this.head = new DNode<E>();
		this.tail = new DNode<E>();
		this.head.setNext(this.tail);
		this.tail.setPrev(this.head);
		size = 0;
	}

	@Override
	public void insertLast(E info) {
		DNode<E> t = this.tail;
		DNode<E> temp = new DNode<E>();

		temp.setData(info);
		temp.setPrev(t);
		t.setNext(temp);
		tail = temp;

		if (size == 0) {
			head = temp;
		}
		size++;

	}

	@Override
	public E removeLast() {

		if (this.tail == null) {
			return null;
		}

		E value = tail.getData();
		this.tail = tail.getPrev();
		size--;

		return value;
	}

	@Override
	public void insertFirst(E info) {

		DNode<E> h = this.head;
		DNode<E> temp = new DNode<E>();

		temp.setData(info);
		temp.setNext(h);
		h.setPrev(temp);

		this.head = temp;

		if (size == 0) {
			this.tail = temp;
		}
		size++;
	}

	@Override
	public E removeFirst() {

		if (this.head == null) {
			return null;
		}

		E value = this.getHead().getData();
		this.head = head.getNext();
		size--;

		return value;
	}

	@Override
	public int size() {
		return this.size;
	}

	public DNode<E> getTail() {
		return tail;
	}

	public void setTail(DNode<E> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Head [");
		DNode<E> aux = head;

		for (int i = 0; i < size; i++) {
			sb.append(aux.getData());
			if (aux == tail) {
				break;
			}
			sb.append(" <-> ");
			aux = aux.getNext();
		}

		sb.append("] Tail");

		return sb.toString();
	}

}
