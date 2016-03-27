/**
* @author: Juan Roa
* License: MIT
*/

public class ListaEnlazada{

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

  public ListaEnlazada selectMenores(int q) {
    Nodo nodo_copia=primero;
    ListaEnlazada list = new ListaEnlazada();

    while(nodo_copia.siguiente != null){
      if(nodo_copia.dato < q){
        list.insertarDato(nodo_copia.dato);
      }
      nodo_copia=nodo_copia.siguiente;
    }
    if(nodo_copia.dato < q){
      list.insertarDato(nodo_copia.dato);
    }
    return list;
  }

  public ListaEnlazada selectMayores(int q) {
    Nodo nodo_copia=primero;
    ListaEnlazada list = new ListaEnlazada();

    while(nodo_copia.siguiente != null){
      if(nodo_copia.dato >= q){
        list.insertarDato(nodo_copia.dato);
      }
      nodo_copia=nodo_copia.siguiente;
    }
    if(nodo_copia.dato >= q){
      list.insertarDato(nodo_copia.dato);
    }

    return list;
  }

  

  public void insertarDato(int dato) {

    Nodo temporal = new Nodo(dato);
    temporal.siguiente = primero;
    primero = temporal;

  }

  public String listar() {
    String info = "";
    Nodo aux = primero;

    if (vacia()){
      info="null";
    }else{
      while (aux != null) {
        info += "{"+aux.dato+"}";
        aux = aux.siguiente;
      }
    }
    return info;
  }

  public void borrarPrimero () {

    if (vacia()) {
      System.out.println("¡ No se puede borrar un elemento en una lista vacía !");
    }else{
      primero = primero.siguiente;
    }

  }

  public void borrarUltimo() {
    Nodo anterior = primero;
    Nodo actual = primero;

    while (actual.siguiente != null){
      anterior = actual;
      actual = actual.siguiente;
    }
    anterior.siguiente = actual.siguiente;
  }

  public int buscarPosicion (int pos) {

    Nodo anterior = primero;
    Nodo actual = primero;
    int k = 0;
    int resultado = 0;

    if (pos > 0) {

      if (vacia()) {
        System.out.println("¡ No se puede buscar un elemento en una lista vacía !");
      }else{
        while (k < pos && actual.siguiente != null) {
            anterior = actual;
            actual = actual.siguiente;
            k++;
            resultado = anterior.dato;
        }
        k+=1;
        if (k == pos) {
          resultado = actual.dato;
        }
      }
    }else{
      System.out.println("¡ La posición debe ser un entero positivo !");
    }
    return resultado;
  }

  public int calcularTamano() {
    Nodo aux = primero;
    int size = 0;

    if (vacia() == false) {
      while (aux.siguiente != null) {
        size++;
        aux=aux.siguiente;
      }
      size++;
    }
    return size;
  }

}
