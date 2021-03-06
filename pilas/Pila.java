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
		temp.nombre = x;
		if (inicio == null) {
			fin = inicio;
		}
		temp.sgte = inicio;
		inicio = temp;
	}

	public void desapilar() {

		if (inicio == null) {
			System.out.println ("Pila Vacía!!!");
		}else{
			inicio = inicio.sgte;
		}
	}

	public int cima() {

		if (inicio == null) {
			return -1;
		}else{
			return inicio.nombre;
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
			con += temp.nombre + "\n";
			temp = temp.sgte;
		}
	System.out.println(con);
	}

}
