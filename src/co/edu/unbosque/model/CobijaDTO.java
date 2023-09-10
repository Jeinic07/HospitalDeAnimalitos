package co.edu.unbosque.model;

public class CobijaDTO {

	private AnimalDTO animal;
	
	public CobijaDTO() {
		// TODO Auto-generated constructor stub
	}

	public CobijaDTO(AnimalDTO animal) {
		super();
		this.animal = animal;
	}

	public AnimalDTO getAnimal() {
		return animal;
	}

	public void setAnimal(AnimalDTO animal) {
		this.animal = animal;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Animal dueño de la cobija: "+animal.getNombre());
		
		return sb.toString();
	}
}
