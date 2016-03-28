
/**
*
* @author Juan Roa
*/
import java.util.*;
public class Principal {

  /**
  * @param args the command line arguments
  */
  public static void main(String[] args) {
    // TODO code application logic here
    ListaC sc = new ListaC();

    sc.insertar(56);
    sc.insertar(7);
    sc.insertar(9);
    sc.insertar(16);
    sc.insertar(35);
    sc.insertar(78);
    sc.imprimir();

    Principal2  obj2 = new  Principal2();
    obj2.mostrarMenu("");
  }

}
