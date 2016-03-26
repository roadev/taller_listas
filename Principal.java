public class Principal {

  public static void main(String[] args) {
    int dato = 0;
    char choice;
    ListaEnlazada lista = new ListaEnlazada();
    java.util.Scanner sc = new java.util.Scanner(System.in);

    do {

      System.out.println("Ingrese una opción: ");
      int a = sc.nextInt();
      lista.menu(a);

      if (a == 1) {
        System.out.println("Ingrese el dato deseado: ");
        int i = sc.nextInt();
        lista.insertarDato(i);
      }

      System.out.println("¿Desea continuar? \nteclee s para continuar...");

    }while (choice == 's' || choice == 'S');
    System.out.println("Ingrese dato");
    dato = sc.nextInt();
    lista.insertarDato(dato);
    lista.vacia();
    lista.listar();

  }
}
