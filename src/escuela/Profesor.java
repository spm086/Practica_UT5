package escuela;

public class Profesor {

	/**
	 * @author Sonia
	 * @version 1.0
	 * @since 27/03/2024
	 */

	private int id;
	private String nombre;
	private String especialidad;

	/**
	 * Estos parametros son necesarios para la creacion del objeto Profesor.
	 * 
	 * @param id
	 * @param nombre
	 * @param especialidad
	 */
	Profesor(int id, String nombre, String especialidad) {
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	/**
	 * 
	 * @return Aqui devuelve el id.
	 */

	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id Es el identificador del profesor con este metodo podemos
	 *           modificarlo.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Aqui devuelve el nombre.
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Este es el nombre del profesor y con este metodo podemos
	 *               modificarlo.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Aqui devuelve la especialidad del profesor.
	 */

	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * 
	 * @param especialidad Es la especialidad del profesor y con este metodo podemos
	 *                     modificarla.
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Este metodo lo que hace es poder ver los datos del profesor.
	 */
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + "]";
	}

	/**
	 * Este metodo muestra por pantalla un mensaje de presentacion del profesor.
	 */

	public void presentarse() {
		System.out.println("Hola, soy el profesor " + nombre + ", mi especialidad es " + especialidad);
	}

	/**
	 * @param suspensos Este parametro recibe un int con la nota. El metodo segun la
	 *                  nota determina si esta suspenso o aprobado.
	 */
	public void impartirClase(int suspensos) {
		if (suspensos >= 10) {
			System.out.println(
					"El profesor " + nombre + " está impartiendo una clase de " + especialidad + "para los suspensos");
		} else {
			System.out.println("El profesor " + nombre
					+ " no puede impartir clase de recuperacion. No hay suficientes suspensos.");
		}
	}

	/**
	 * @param nota El parametro nota recoge un int con el numero de la nota. El
	 *             metodo recoge el parametro nota y nos dice si es mayor a 5 que
	 *             esta aprobado y si es menor estara suspenso.
	 */

	/**
	 * 
	 * @deprecated Este metodo ya esta obsoleto y se cambia la version ya que vamos
	 *             a actualizar el metodo.
	 * @version 1.2 Este metodo seria el nuevo modificado, con la version mas
	 *          actualizada.
	 * @see calificarExamenConcurso
	 * 
	 */
	public void calificarExamen(int nota) {
		if (nota >= 5) {
			System.out.println("Muy bien, sigue así.");
		} else {
			System.out.println("Tienes que aplicarte más.");
		}
	}

	/**
	 * 
	 * @param nota Este parametro int guarda la nota del alumno y segun se mayor o
	 *             igual nos dice que debe hacer el alumno, y se elegira al que
	 *             tenga una nota superior a un 9 para el concurso municipal.
	 * 
	 * 
	 */
	public void calificarExamenConcurso(int nota) {
		if (nota >= 5) {
			System.out.println("Muy bien, sigue así.");
		}
		if (nota >= 9.5) {
			System.out.println("Eres el elegido, para el concurso municipal de programación.");
		} else {

		}
		{
			System.out.println("Tienes que presentarte a la recuperación.");
		}
	}

}
