package co.edu.unbosque.persistence;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.util.QueueImpl;

public class AnimalDAO {

	private QueueImpl<AnimalDTO> animales;

	public AnimalDAO() {
		animales = new QueueImpl<AnimalDTO>();
	}

	public QueueImpl<AnimalDTO> getAnimales() {
		return animales;
	}

	public void setAnimales(QueueImpl<AnimalDTO> animales) {
		this.animales = animales;
	}

	public void agregar(Object o) {

		animales.enQueue((AnimalDTO) o);

	}

	public void atender() {
		animales.dequeue();
	}

	public String mostrar() {
		return animales.toString();
	}
}
