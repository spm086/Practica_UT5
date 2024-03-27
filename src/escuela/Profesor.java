package escuela;

public class Profesor {

	private int id;
	private String nombre;
	private String especialidad;

	Profesor(int id, String nombre, String especialidad) {
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + "]";
	}

	public void presentarse() {
		System.out.println("Hola, soy el profesor " + nombre + ", mi especialidad es " + especialidad);
	}

	public void impartirClase(int suspensos) {
		if (suspensos >= 10) {
			System.out.println(
					"El profesor " + nombre + " está impartiendo una clase de " + especialidad + "para los suspensos");
		} else {
			System.out.println("El profesor " + nombre
					+ " no puede impartir clase de recuperacion. No hay suficientes suspensos.");
		}
	}

	public void calificarExamen(int nota) {
		if (nota >= 5) {
			System.out.println("Muy bien, sigue así.");
		} else {
			System.out.println("Tienes que aplicarte más.");
		}
	}

}
