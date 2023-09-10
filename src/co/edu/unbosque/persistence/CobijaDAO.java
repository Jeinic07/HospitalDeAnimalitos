package co.edu.unbosque.persistence;

import co.edu.unbosque.model.CobijaDTO;
import co.edu.unbosque.util.StackImpl;

public class CobijaDAO {

	private StackImpl<CobijaDTO> cobijas;
	
	public CobijaDAO() {

		cobijas = new StackImpl<CobijaDTO>();
		
	}

	public StackImpl<CobijaDTO> getCobijas() {
		return cobijas;
	}

	public void setCobijas(StackImpl<CobijaDTO> cobijas) {
		this.cobijas = cobijas;
	}
	
	public void entregarCobija(Object o) {
		cobijas.push((CobijaDTO)o);
	}
	
	public String mostrarCobijasEntregadas() {
		
		return cobijas.toString();
	}
	
}
