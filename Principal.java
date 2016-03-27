/**
* @author: Juan Roa
* License: MIT
*/

public class Principal {

  ListaEnlazada listaPpal, lista2;
  java.util.Scanner sc = new java.util.Scanner(System.in);

  public Principal() {
    listaPpal = new ListaEnlazada();
    lista2 = new ListaEnlazada();
  }

  public String fraccionarLista(int a) {
    String msj="";

    if (! listaPpal.vacia()) {
      ListaEnlazada menores = listaPpal.selectMenores(a);
      ListaEnlazada mayores_ig = listaPpal.selectMayores(a);
      msj+="Menores = "+menores.listar()+"\n";
      msj+="Mayores = "+mayores_ig.listar();
    }else{
      msj="No se puede dividir una lista vacía";
    }

    return msj;
  }

  public ListaEnlazada concatenarListas () {
    ListaEnlazada nueva_lista = new ListaEnlazada();
    if (!listaPpal.vacia()) {
      nueva_lista = listaPpal;

      if (!lista2.vacia()) {
        Nodo auxPpal = nueva_lista.primero;
        Nodo auxL2 = lista2.primero;
        while(auxPpal.siguiente != null) {
          auxPpal=auxPpal.siguiente;
        }
        auxPpal.siguiente = auxL2;
      }
    } else {
      if ((!lista2.vacia())) {
        nueva_lista = lista2;
      }
    }

    return nueva_lista;
  }

  public void menu() {

      String text = "|                  Menú                 |\n| Ingrese una opción:                   |\n";
      text += "| 1 para insertar dato a la lista       |\n";
      text += "| 2 para mostrar lista                  |\n";
      text += "| 3 ¿Lista vacía?                       |\n";
      text += "| 4 para borrar el primer dato          |\n";
      text += "| 5 retorna un dato dada su posición    |\n";
      text += "| 6 para borrar el último dato          |\n";
      text += "| 7 para calcular el tamaño de la lista |\n";
      text += "| 8 para fraccionar la lista            |\n";
      text += "| 9 concatena un par de listas          |\n";
      text += "| 10 eliminar dado pos                  |\n";
      System.out.println(text);
      int a = sc.nextInt();

      if (a == 1) {
        System.out.println(" Ingrese el dato deseado: ");
        int i = sc.nextInt();
        listaPpal.insertarDato(i);
      }else if (a == 2) {
        System.out.println(listaPpal.listar());
      }else if (a == 3) {
        System.out.println(listaPpal.vacia());
      }else if (a == 4) {
        listaPpal.borrarPrimero();
      }else if (a == 5) {
        System.out.println("Ingrese la posición: ");
        int pos = sc.nextInt();
        System.out.println("Dato = " + listaPpal.buscarPosicion(pos));
      }else if (a == 6) {
        listaPpal.borrarUltimo();
      }else if (a == 7) {
        System.out.println("Tamaño = " + listaPpal.calcularTamano());
      }else if (a == 8) {
        System.out.println("Ingrese el dato para fraccionar la lista: ");
        int num = sc.nextInt();
        System.out.println("Resultado:\n" + fraccionarLista(num));
      }else if (a == 9) {
        int choice2;
        do {
          System.out.println("|               Lista 2                 |");
          menu2();
          System.out.println("Ingrese 0 para SALIR de Lista 2");
          choice2 = sc.nextInt();
        }while (choice2!=0);
        ListaEnlazada aux = concatenarListas();
        System.out.println("Listar concatenados = "+aux.listar());
      }else if (a == 10) {
        System.out.println("Ingrese pos a eliminar: ");
        int pos = sc.nextInt();
        listaPpal.eliminarWhitPos(pos);
        System.out.println("Lista Principal:\n" + listaPpal.listar());
      }
  }

  public void menu2() {

      String text = "|                 Menú 2                |\n| Ingrese una opción:                   |\n";
      text += "| 1 para insertar dato a la lista       |\n";
      text += "| 2 para mostrar lista                  |\n";
      text += "| 3 ¿Lista vacía?                       |\n";
      text += "| 4 para borrar el primer dato          |\n";
      text += "| 5 para borrar el último dato          |\n";
      text += "| 6 para calcular el tamaño de la lista |\n";
      System.out.println(text);
      int a = sc.nextInt();

      if (a == 1) {
        System.out.println(" Ingrese el dato deseado: ");
        int i = sc.nextInt();
        lista2.insertarDato(i);
          System.out.println(" Insertado a lista 2");
      }else if (a == 2) {
        System.out.println(lista2.listar());
      }else if (a == 3) {
        System.out.println(lista2.vacia());
      }else if (a == 4) {
        lista2.borrarPrimero();
      }else if (a == 5) {
        lista2.borrarUltimo();
      }else if (a == 6) {
        System.out.println("Tamaño = " + lista2.calcularTamano());
      }
  }

  public void mostrarMenu(String texto){
    int choice;
    do {
      System.out.println(texto);
      menu();
      System.out.println("Ingrese 0 para SALIR de Lista Principal");
      choice = sc.nextInt();
    }while (choice!=0);
  }

  public static void main(String[] args) {
    Principal obj = new Principal();
    obj.mostrarMenu("|               Principal               |");
  }
}
