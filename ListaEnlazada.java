public class ListaEnlazada {

  Nodo primero;

  public ListaEnlazada() {
    primero = null;
  }

  public boolean vacia() {

    if (primero == null) {
      return true;
    }else{
      return false;
    }

  }

  public void insertarDato(int dato) {

    Nodo temporal = new Nodo(dato);
    temporal.siguiente = primero;
    primero = temporal;

  }

  public String listar() {
    String info = "";
    Nodo aux = primero;

    while (aux != null) {
      info += "{"+aux.dato+"}";
      aux = aux.siguiente;
    }
    return info;
  }

  public void borrarPrimero () {
    primero = primero.siguiente;
  }

  public void borrarUltimo() {
    Nodo anterior = primero;
    Nodo actual = primero;

    while (actual.siguiente != null) {
      anterior = actual;
      actual = actual.siguiente;
    }
    anterior.siguiente = null;
  }

  public void buscarPosicion (int pos) {
    Nodo anterior = primero;
    Nodo actual = primero;
    int k = 0;

    if (pos > 0) {
      while (k != pos && actual.siguiente != null) {
        anterior = actual;
        actual = actual.siguiente;
        k++;
        System.out.print("k" + k);
      }
      anterior.siguiente = actual.siguiente;
    }
  }

  public void menu(int a) {

    System.out.println("1 para insertar dato a la lista: ");
    System.out.println("2 para insertar dato a la lista: ");
    System.out.println("3 para insertar dato a la lista: ");
    System.out.println("4 para insertar dato a la lista: ");
  }

}
