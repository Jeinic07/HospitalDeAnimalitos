package co.edu.unbosque.util;


public class MyDoubleLinkedList<E> {

	protected DNode<E> head;
	protected DNode<E> currentPosition;


	public MyDoubleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public MyDoubleLinkedList(DNode<E> head, DNode<E> currentPosition) {
		super();
		this.head = head;
		this.currentPosition = currentPosition;
	}

	public DNode<E> getHead() {
		return head;
	}

	public void setHead(DNode<E> head) {
		this.head = head;
	}

	public DNode<E> getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(DNode<E> currentPosition) {
		this.currentPosition = currentPosition;
	}

	public boolean isEmpty() {
		return (head == null) ? true : false;
	}

	public void forward(int i) {
		if (i > 0 && this.head != null) {
			int positionforward = i;
			if (this.currentPosition == null) {
				currentPosition = head;
				positionforward--;
			}
			while (currentPosition.getNext() != null && positionforward > 0) {
				currentPosition = currentPosition.getNext();
				positionforward--;
			}
		}
	}

	public void backward(int i) {
		if (i <= 0 || head == null || currentPosition == null) {
			return;
		}
		int positionbackward = i;
		while (currentPosition != null && positionbackward > 0) {
			currentPosition = currentPosition.getNext();
			positionbackward--;
		}

	}

	public void insert(E data) {
		DNode<E> newNode = new DNode<>(data);
		if (currentPosition == null) {
			newNode.setNext(head);
			if (head != null) {
				head.setPrev(newNode);
			}
			head = newNode;

		} else {
			newNode.setNext(currentPosition.getNext());
			newNode.setPrev(currentPosition);
			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrev(newNode);
			}
			currentPosition.setNext(newNode);
		}
		currentPosition = newNode;
	}

	public int size() {
		int size = 0;
		DNode<E> temp = head;

		while (temp != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}

	public void remove(int i) {
		int index = 0;
		if (i > size() || head == null || i < 0) {
			return;
		}
		currentPosition = head;

		if (!this.isEmpty()) {
			while (index < i) {
				index++;
				currentPosition = currentPosition.getNext();
			}
			if (currentPosition.getNext() != null) {

				if (currentPosition.getPrev() == null) {
					currentPosition.getNext().setPrev(null);
					head = currentPosition.getNext();
				} else {
					currentPosition.getPrev().setNext(currentPosition.getNext());
					currentPosition.getNext().setPrev(currentPosition.getPrev());
				}
			} else {
				if (currentPosition.getPrev() != null) {
					currentPosition.getPrev().setNext(null);

				} else {
					head = null;
				}
			}

		}

	}

	public void addFirst(E data) {
		DNode<E> newNode = new DNode<>(data);
		if (head == null) {
			this.insert(data);
		} else {
			if (head.getNext() != null) {

				newNode.setNext(head);
				head.setPrev(newNode);
				head = newNode;
			} else {
				head.setPrev(newNode);
				head = newNode;
			}

		}

	}

	public E get(int i) {
		int index = 0;
		E info = null;
		if (i > size() || head == null || i < 0) {
			return info;
		}

		currentPosition = head;
		if (!this.isEmpty()) {
			while (index < i) {
				index++;
				currentPosition = currentPosition.getNext();
			}
		}
		info = currentPosition.getData();
		return info;
	}

	public void set(int i, E data) {
		int index = 0;
		if (i > size() || head == null || i < 0) {
			return;
		}
		currentPosition = head;
		if (!this.isEmpty()) {
			while (index < i) {
				index++;
				currentPosition = currentPosition.getNext();
			}
		}
		currentPosition.setData(data);
	}

	@Override
	public String toString() {

		DNode<E> temp = head;

		StringBuilder sb = new StringBuilder();

		while (temp != null) {
			sb.append(temp.getData());
			if (temp.getNext() != null) {
				sb.append("\n");
			}
			temp = temp.getNext();
		}

		return sb.toString();

	}

}
