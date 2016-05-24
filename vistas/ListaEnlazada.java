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
    Nodo nodoCopia = primero;
    ListaEnlazada list = new ListaEnlazada();

    while(nodoCopia.siguiente != null){
      if(nodoCopia.dato < q){
        list.insertarDato(nodoCopia.dato);
      }
      nodoCopia = nodoCopia.siguiente;
    }
    if(nodoCopia.dato < q){
      list.insertarDato(nodoCopia.dato);
    }
    return list;
  }

  public ListaEnlazada selectMayores(int q) {
    Nodo nodoCopia = primero;
    ListaEnlazada list = new ListaEnlazada();

    while(nodoCopia.siguiente != null){
      if(nodoCopia.dato >= q){
        list.insertarDato(nodoCopia.dato);
      }
      nodoCopia = nodoCopia.siguiente;
    }
    if(nodoCopia.dato >= q){
      list.insertarDato(nodoCopia.dato);
    }

    return list;
  }

  public void eliminarWhitPos(int pos) {
    Nodo anterior=primero;
    Nodo actual=primero;
    int i = 1;

    /*
    * El único nodo que no puede ser eliminado en esta implementación es el primero, a menos
    * que se tenga en cuenta esta condición de manera directa.
    */

    if( (pos > 0) && (pos <= calcularTamano()) ){

      while(i<pos){
        anterior = actual;
        actual = actual.siguiente;
        i++;
      }
      actual = actual.siguiente;
      anterior.siguiente = actual;

    /* Condición para eliminar el primer nodo (si pos == 1)
    *  if (pos==1) {
    *    borrarPrimero();
    *  }
    */

    } else {
      System.out.println("Fuera de Rango Válido");
    }
  }

  public void insertarDato(int dato) {

    Nodo aux = primero;
    Nodo nuevo = new Nodo(dato);

    //nuevo.siguiente = primero;
    //primero = nuevo;

    if (vacia()){
      primero = nuevo;
    }else{
      while (aux.siguiente != null) {
        aux = aux.siguiente;
      }
      aux.siguiente = nuevo;
    }

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
