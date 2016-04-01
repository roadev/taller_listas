/**
* @author: Juan Roa
* License: MIT
*/

public class Principal2 {

  ListaC listaPpal;
  java.util.Scanner sc = new java.util.Scanner(System.in);

  public Principal2() {
    listaPpal = new ListaC();
  }

  public void menu() {

    String text = "|                  Menú                 |\n| Ingrese una opción:                   |\n";
    text += "| 1 para saber si está vacía            |\n";
    text += "| 2 para saber el tamaño de la lista    |\n";
    text += "| 3 para insertar dato a la lista       |\n";
    text += "| 4 para definir el grado del polinomio |\n";
    text += "| 5 para mostrar polinomio              |\n";
    text += "| 6 para operar polinomio               |\n";
    System.out.println(text);
    int a = sc.nextInt();

    if (a == 1) {
      System.out.println("La lista está vacía? = " + listaPpal.vacia());
    }else if (a == 2) {
      System.out.println("Tamaño Lista = " + listaPpal.calcularTamano());
    }else if (a == 3) {
      if (listaPpal.calcularTamano() <= listaPpal.grado) {
        System.out.println(" Ingrese el dato deseado: ");
        int i = sc.nextInt();
        listaPpal.insertar(i);
      } else {
        System.out.println("No es posible ingresar más coeficientes al polinomio");
      }
    }else if (a == 4) {
      System.out.println("Ingrese el grado del polinomio: ");
      int num = sc.nextInt();
      listaPpal.definirGrado(num);
      System.out.println("Grado del Polinomio = " + listaPpal.grado);
    }else if (a == 5) {
      System.out.println("Polinomio: " + listaPpal.imprimir());
    }else if (a == 6) {
      System.out.println("Ingrese el dato para operar el polinomio: ");
      int num = sc.nextInt();
      if (!listaPpal.vacia()) {
        System.out.println("y = " + listaPpal.operar(num));
      } else {
        System.out.println("No se puede operar una lista vacía");
      }
    }
  }

  public void mostrarMenu(String texto){
    int choice;
    do {
      System.out.println(texto);
      menu();
      System.out.println("Ingrese 0 para SALIR");
      choice = sc.nextInt();
    }while (choice!=0);
  }
}
