package co.edu.unbosque.controller;

import java.util.Random;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.model.CobijaDTO;
import co.edu.unbosque.persistence.AnimalDAO;
import co.edu.unbosque.persistence.CobijaDAO;
import co.edu.unbosque.view.Console;

public class Controller {
// Por: Jeisson Nicolas Uyaban y Javier Felipe Meza
	private Console c;
	private Random r;
	private int numCobijas;
	private AnimalDAO adao;
	private CobijaDAO cdao;

	public Controller() {
		c = new Console();
		r = new Random();
		adao = new AnimalDAO();
		cdao = new CobijaDAO();
		numCobijas = r.nextInt(40 - 20 + 1) + 20;

	}

	public void run() {

		cicloprincipal: while (true) {
			c.imprimirConSalto("Numero de cobijas disponibles actual: " + numCobijas);
			c.imprimirConSalto(
					"Bienvenido al hospital de animalitos, elija una de las opciones a realizar\n1) Registrar entrada de animali\n2) Mostrar los animalitos actuales registrados\n3) Mostrar las cobijas ocupadas por animalitos\n4) Salir :(");

			String temp = c.leerLineaEntera();

			switch (temp) {
			case "1": {

				if (this.numCobijas == 0) {
					c.imprimirConSalto("No se pueden registrar mas animales por el momento :( (cobijas insuficientes)");
					break;
				}

				c.imprimirConSalto("Por favor ingrese el nombre del animal: ");
				String nombre = c.leerLineaEntera();
				c.imprimirConSalto("Por favor ingrese la especie del animal: ");
				String especie = c.leerLineaEntera();
				c.imprimirConSalto("Por favor ingrese el caso por el que viene: ");
				String caso = c.leerLineaEntera();

				AnimalDTO animalTemp = new AnimalDTO(nombre, especie, caso);
				cdao.entregarCobija(new CobijaDTO(animalTemp));
				adao.agregar(animalTemp);

				numCobijas--;
				
				break;
			}
			case "2": {

				if (adao.getAnimales().size() == 0) {
					c.imprimirConSalto("No hay animalitos registrados aun");
					break;
				}

				c.imprimirConSalto(adao.mostrar());

				break;
			}
			case "3": {

				if (adao.getAnimales().size() == 0) {
					c.imprimirConSalto("No hay animalitos registrados aun para mostrar cobijas ocupadas");
					break;
				}

				c.imprimirConSalto(cdao.mostrarCobijasEntregadas());

				break;
			}
			case "4": {

				c.imprimirConSalto("Gracias por venir, que tenga buen dia.");

				break cicloprincipal;
			}
			default:
				c.imprimirConSalto("Elija una opcion valida, por favor.");
			}

		}

	}

}
