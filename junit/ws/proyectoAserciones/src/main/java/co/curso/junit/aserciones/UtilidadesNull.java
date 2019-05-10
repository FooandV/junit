package co.curso.junit.aserciones;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesNull {

	private List<Persona> personas;

	public UtilidadesNull() {
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Freyder", "Otalvaro"));
		personas.add(new Persona("Violetta", "Otalvaro"));
		personas.add(new Persona("esperanza", "Rueda"));
	}

	/**
	 * Busca en el array de personas y si encuentra una con el mismo nombre la devuelve,
	 * en caso contrario devuelve null
	 * @param nombre
	 * @return
	 * */
	public Persona damePersona(String nombre) {
		Persona p = null;

		for (Persona persona : personas) {
			if (persona.getNombre().equalsIgnoreCase(nombre)) {
				p = persona;
			}
		}
		return p;
	}
}
