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
    text += "| 1 para insertar dato a la lista       |\n";
    text += "| 2 para mostrar lista                  |\n";
    System.out.println(text);
    int a = sc.nextInt();

    if (a == 1) {
      System.out.println(" Ingrese el dato deseado: ");
      int i = sc.nextInt();
      listaPpal.insertar(i);
    }else if (a == 2) {      
      System.out.println("Lista Circular:");
      listaPpal.imprimir();
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
