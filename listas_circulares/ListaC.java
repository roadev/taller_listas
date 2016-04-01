/**
*
* @author Juan Roa
*/
public class ListaC {

  Nodo primero;
  Nodo ultimo;
  int grado;

  public ListaC() {
    primero = null;
    ultimo = null;
    grado = 0;
  }

  public void definirGrado(int i) {

    if (grado == 0) {
      grado = i;
    } else {
      System.out.println("No se puede redefinir el grado del polinomio");
    }

  }

  public boolean vacia() {

    if ((primero == null) && (ultimo == null)) {
      return true;
    }else{
      return false;
    }

  }

  public void insertar(int dato) {
    Nodo temp = new Nodo();
    temp.dato = dato;

    if (primero ==null) { // como mínimo el polinomio es una constante
      primero = temp;
      ultimo = primero;
      primero.siguiente = ultimo;
    } else {
      ultimo.siguiente = temp;
      temp.siguiente =primero;
      ultimo=temp;
    }
  }

  public String imprimir () {
    Nodo actual = new Nodo();
    actual = primero;
    String msj = "y =";

    if (!vacia()) {
      do{
        msj += " " + actual.dato;
        actual= actual.siguiente;
      }while(actual != primero);
    } else {
      msj = "null";
    }

    return msj;
  }

  public int operar(int x) {
    Nodo anterior=primero;
    Nodo actual=primero;
    int resultado = 0;

    System.out.println("x = " + x);

    do{
      resultado += (x*actual.dato);
      anterior = actual;
      actual = actual.siguiente;
    }while (actual != primero);

    return resultado;
  }

  public int calcularTamano() {
    Nodo anterior=primero;
    Nodo actual=primero;
    int size = 0;

    if (!vacia()) {
      do {
        size++;
        anterior = actual;
        actual = actual.siguiente;
      } while (actual != primero);
    }
    return size;
  }

}
