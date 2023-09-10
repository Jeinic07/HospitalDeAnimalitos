package co.edu.unbosque.model;

public class AnimalDTO {

	private String nombre;
	private String especie;
	private String casoDeConsulta;

	public AnimalDTO() {
		// TODO Auto-generated constructor stub
	}

	public AnimalDTO(String nombre, String especie, String casoDeConsulta) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.casoDeConsulta = casoDeConsulta;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCasoDeConsulta() {
		return casoDeConsulta;
	}

	public void setCasoDeConsulta(String casoDeConsulta) {
		this.casoDeConsulta = casoDeConsulta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Nombre: " + this.nombre + "\n");
		sb.append("Especie: " + this.especie + "\n");
		sb.append("Caso de consulta: " + this.casoDeConsulta + "\n");

		return sb.toString();
	}

}
