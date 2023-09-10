package co.edu.unbosque.util;

public class QueueImpl<E> implements Queue<E> {

	private DequeList<E> infos;

	public QueueImpl() {
		infos = new DequeList<E>();
	}

	@Override
	public void enQueue(E info) {
		infos.insertFirst(info);
	}

	@Override
	public E dequeue() {

		return infos.removeLast();
	}

	@Override
	public int size() {

		return infos.size();
	}

	@Override
	public E peek() {

		E temp = infos.removeLast();
		infos.insertLast(temp);

		return temp;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Animales: \n");
		DNode<E> aux = infos.getHead();

		for (int i = 0; i < infos.getSize(); i++) {
			sb.append(aux.getData());
			if (aux == infos.getTail()) {
				break;
			}
			sb.append("\n");
			aux = aux.getNext();
		}

		return sb.toString();
	}

}
