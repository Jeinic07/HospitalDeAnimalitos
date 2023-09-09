package co.edu.unbosque.util;

public class StackImpl<E> implements Stack<E>{
	
	private DequeList<E> infos;

	public StackImpl() {
		infos = new DequeList<E>();
		}
	
	@Override
	public void push(E info) {
		infos.insertFirst(info);
	}

	@Override
	public E pop() {
		
		return infos.removeFirst();
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

		sb.append("Top [");
		DNode<E> aux = infos.getHead();

		for (int i = 0; i < infos.getSize(); i++) {
			sb.append(aux.getData());
			if (aux == infos.getTail()) {
				break;
			}
			sb.append(" <-> ");
			aux = aux.getNext();
		}

		sb.append("] Bottom");

		return sb.toString();
	}

}
