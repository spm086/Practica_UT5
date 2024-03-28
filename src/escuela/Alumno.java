package escuela;

public class Alumno {

	/**
	 * @author Sonia
	 * @version 1.0
	 * @since 27/03/2024
	 */

	private String nombre;
	private int edad;
	private String curso;
	private int nota;
	private int suspensos;

	/**
	 * Estos parametros son necesarios para la creacion del objeto Alumno.
	 * 
	 * @param nombre
	 * @param edad
	 * @param curso
	 * @param nota
	 */

	Alumno(String nombre, int edad, String curso, int nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
		this.nota = nota;

	}

	/**
	 * @return Este metodo lo que hace es devolvernos el nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Esto es el nombre del alumno y con este metodo set puedo
	 *               modificarlo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Este lo que hace es devolvernos la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad Esto es la edad del alumno y con este metodo set podemos
	 *             modificarlo
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return Esto lo que hace es devolver el curso del Alumno
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * 
	 * @param curso Esto es el curso en el que esta el alumno y con este metodo
	 *              podemos modificarlo
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * 
	 * @return Aqui lo que hace es devolver la nota de alumno
	 */

	public int getNota() {
		return nota;
	}

	/**
	 * 
	 * @param nota Esta es la nota del alumno y con este metodo podemos modificarla
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}

	/**
	 * 
	 * @return Aqui lo que hace es devolver los suspensos
	 */
	public int getSuspensos() {
		return suspensos;
	}

	/**
	 * 
	 * @param suspensos Con este metodo tambien podemos modificarlo en caso de que
	 *                  queramos cambiar algo
	 */
	public void setSuspensos(int suspensos) {
		this.suspensos = suspensos;
	}

	/**
	 * Este metodo lo que hace es darnos todos los datos del alumno.
	 */
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + ", nota=" + nota + ", suspensos="
				+ suspensos + "]";
	}

	/**
	 * Este metodo muestra por pantalla un mensaje de presentacion del alumno.
	 */
	public void presentarse() {
		System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y curso " + curso);
	}

	/**
	 * Este metodo dependiendo de la nota que tiene el alumno imprime un mensaje
	 * diciendo si debe estudiar o no.
	 */

	public void estudiar() {

		if (this.nota < 5) {

			System.out.println(nombre + " está estudiando para recuperar");
		} else {
			System.out.println(nombre + "No tiene que estudiar porque ha aprobado");
		}
	}

	/**
	 * Este metodo cuenta los suspensos que hay en total.
	 * 
	 * @return Devuelve un int con los numeros de suspensos que hay en total
	 */

	public int contarSuspensos() {
		int suspensos = 0;
		if (this.nota < 5) {
			suspensos++;
		}
		return suspensos;
	}
}
