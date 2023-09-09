package co.edu.unbosque.util;

public interface Deque<E> {

	public void insertLast(E info);

	public E removeLast();

	public void insertFirst(E info);

	public E removeFirst();

	public int size();

}
