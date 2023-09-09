package co.edu.unbosque.util;

public interface Queue<E> {

	public void enQueue(E info);

	public E dequeue();

	public int size();

	public E peek();

}
