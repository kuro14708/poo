package modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro {

	/*
	 * int[] arreglo = new int[10];
	 * 
	 * 
	 * String[] arreglo2 = new String[20];
	 */

	List listaLibro = new ArrayList();

	// Todos los atributos de la clase
	private String codigo;
	private String nombre;

	private Autor miAutor;

	// los metodos de la clase
	public String guardar(Libro miLibrito) {
		/*
		 * for (int i = 0; i < arreglo.length; i++) { Random aleatorio = new Random();
		 * int n=aleatorio.nextInt(10); arreglo[i]=n;
		 * 
		 * }
		 */

		listaLibro.add(miLibrito);

		return "El libro ha sido almacenado exitosamente";
	}

	public List getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(List listaLibro) {
		this.listaLibro = listaLibro;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor getMiAutor() {
		return miAutor;
	}

	public void setMiAutor(Autor miAutor) {
		this.miAutor = miAutor;
	}

	// aqui colocamos los metodos get and set por cada atributo de la clase
	//el metodo get se usa para retornar el valor de un atributo
	//el metodo set se usa para estableser o asignar el valor de un atributo 
	
}
