package proyectoMoreUnit;

public class Persona {
	
	private String nombre;
	private String apellido; 
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}