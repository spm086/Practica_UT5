package escuela;

public class Alumno {

	private String nombre;
	private int edad;
	private String curso;
	private int nota;
	private int suspensos;

	Alumno(String nombre, int edad, String curso, int nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
		this.nota = nota;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getSuspensos() {
		return suspensos;
	}

	public void setSuspensos(int suspensos) {
		this.suspensos = suspensos;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + ", nota=" + nota + ", suspensos="
				+ suspensos + "]";
	}

	public void presentarse() {
		System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y curso " + curso);
	}

	public void estudiar() {

		if (nota < 5) {

			System.out.println(nombre + " está estudiando para recuperar");
		} else {
			System.out.println(nombre + "No tiene que estudiar porque ha aprobado");
		}
	}

	public int contarSuspensos() {
		int suspensos = 0;
		if (nota < 5) {
			suspensos++;
		}
		return suspensos;
	}
}
