package co.curso.junit.aserciones;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesSame {

	private List<Persona> personas;

	public UtilidadesSame() {
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Violetta", "Otalvaro"));
		personas.add(new Persona("Santiago", "Carmona"));
		personas.add(new Persona("jimena", "Baron"));
	}

	public Persona devuelveObjeto(Persona persona) {

		if (personas.contains(persona)) { // compara con equals
			return persona;
		} else {
			return new Persona("Paco", "Martinez");
		}
	}
}
