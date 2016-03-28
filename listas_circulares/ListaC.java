/**
*
* @author Juan Roa
*/
public class ListaC {

  Nodo primero;
  Nodo ultimo;

  public ListaC() {
    primero= null;
    ultimo =null;
  }

  public void insertar(int dato) {
    Nodo temp = new Nodo();
    temp.dato = dato;
    if (primero ==null)
    {
      primero = temp;
      ultimo = primero;
      primero.siguiente = ultimo;
    } else
    {
      ultimo.siguiente = temp;
      temp.siguiente =primero;
      ultimo=temp;
    }
  }

  public void imprimir () {
    Nodo actual = new Nodo();
    actual = primero;
    do{
      System.out.println(" " + actual.dato);
      actual= actual.siguiente;
    }while(actual != primero);
  }

}
