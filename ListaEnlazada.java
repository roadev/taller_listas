/**
* @author: Juan Roa
* License: MIT
*/

public class ListaEnlazada {

  Nodo primero;
  java.util.Scanner sc = new java.util.Scanner(System.in);

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
    //primero = primero.siguiente;

    if (vacia()) {
      System.out.println("¡ No se puede borrar un elemento en una lista vacía !");
    }else{
      primero = primero.siguiente;
      System.out.println("¡ Primer nodo borrado !");
    }

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

  public void menu() {

    int choice;

    do {
      String text = "|               Menú              |\n| Ingrese una opción:             |\n";
      text += "| 1 para insertar dato a la lista |\n";
      text += "| 2 para mostrar lista            |\n";
      text += "| 3 ¿Lista vacía?                 |\n";
      text += "| 4 para borrar el primer dato    |\n";
      System.out.println(text);
      int a = sc.nextInt();

      if (a == 1) {
        System.out.println(" Ingrese el dato deseado: ");
        int i = sc.nextInt();
        insertarDato(i);
      }else if (a == 2) {
        System.out.println(listar());
      }else if (a == 3) {
        System.out.println(vacia());
      }else if (a == 4) {
        borrarPrimero();
      }else{
        break;
      }

      System.out.println("¿Desea continuar? \nteclee 1 para continuar...");
      choice = sc.nextInt();

    }while (choice == 1);

  }

}
