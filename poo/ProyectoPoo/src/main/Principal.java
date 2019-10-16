package main;

import modelo.Autor;
import modelo.Libro;
public class Principal {

	// es el metodo principal, porque por aqui empieza a correr el programa
	public static void main(String[] args) {
		
		Libro libro1 = new libro();
		libro1.setcodigo("isnm000")
		libro1.setnombre(" El naufrago")
		
		Autor miAutor = new Autor();
		miAutor.setCedula(12345);
		miAutor.setNombreCompleto("gabriel garcia marques");
		
		libro1.setMiAutor(miAutor);

		libro1.guardar(libro1);
		
		String mensajes = libro1.guardar(libro1);
		
		System.out.println(mensajes +" "+libro1.setNombre;);
	
		
		//creamos un segundo objeto de la clase libro
		Libro libro2 = new libro()
		libro2.setCodigo("isbn0002");
		libro2.setNombre("Cien años de soledad");
		libro2.setMiAutor(miAutor);
		
		libro2.guardar(libro2);
		
		
		String mensajes = libro2.guardar(libro2);
		
		System.out.println(mensajes +" "+libro2.setNombre;);
	
	}

}
