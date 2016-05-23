/**
* @author: Juan Roa
* License: MIT
*/

public class Pila {

	Nodo inicio;
	Nodo fin;

	public Pila() {
		inicio = null;
		fin = null;
	}

	public void eliminar () {
		inicio = fin = null;
	}


	public void apilar (int x) {

		Nodo temp = new Nodo();
		temp.dato = x;
		if (inicio == null) {
			fin = inicio;
		}
		temp.siguiente = inicio;
		inicio = temp;
	}

	public void desapilar() {

		if (inicio == null) {
			System.out.println ("Pila Vacía!!!");
		}else{
			inicio = inicio.siguiente;
		}
	}

	public int cima() {

		if (inicio == null) {
			return -1;
		}else{
			return inicio.dato;
		}
	}

	public boolean vacia() {

		if (inicio == null) {
			return true;
		}else{
			return false;
		}
	}

	public void mostrar () {

		Nodo temp = inicio;
		String con = "El contenido de la pila es: \n";
		while (temp != null) {
			con += temp.dato + "\n";
			temp = temp.siguiente;
		}
		System.out.println (con);
	}

}
