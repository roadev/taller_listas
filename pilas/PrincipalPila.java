/**
* @author: Juan Roa
* License: MIT
*/

public class PrincipalPila {

  Pila p;

  public PrincipalPila() {
    p = new Pila();
  }

  java.util.Scanner sc = new java.util.Scanner(System.in);

  public void menu() {

    String text = "|                  Menú                 |\n| Ingrese una opción:                   |\n";
    text += "| 1 para apilar un valor                |\n";
    text += "| 2 para mostrar la pila                |\n";
    text += "| 3 para eliminar la pila               |\n";
    text += "| 4 para ver la cima de la pila         |\n";
    text += "| 5 para saber si la pila está vacía    |\n";
    text += "| 6 para desapilar                      |\n";
    System.out.println(text);
    int a = sc.nextInt();

    if (a == 1) {
      System.out.println(" Ingrese el dato deseado: ");
      int i = sc.nextInt();
      p.apilar(i);
    }else if (a == 2) {
      p.mostrar();
    }else if (a == 3) {
      p.eliminar();
    }else if (a == 4) {
      System.out.println(p.cima());
    }else if (a == 5) {
      System.out.println(p.vacia());
    }else if (a == 6) {
      p.desapilar();
    }

  }

  public void mostrarMenu(String texto){
    int choice;
    do {
      System.out.println(texto);
      menu();
      System.out.println("Ingrese 0 para SALIR de Lista Principal");
      choice = sc.nextInt();
    }while (choice != 0);
  }

  public static void main(String[] args) {

    PrincipalPila obj = new PrincipalPila();
    obj.mostrarMenu("|               Principal               |");

  }

}
