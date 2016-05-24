/**
* @author Diana Carolina Hernández
* @version 0.5
* @license 
*/

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VistaAuxEnlazadas extends JDialog implements ActionListener{

  Container contenedor;
  JPanel panelEnlazadas2;
  JPanel grillaEnlazadas2;
  ArrayList<JButton> botonesEnlazadas2;
  JButton botonCerrar;
  //
  ListaEnlazada listaE2;

  public VistaAuxEnlazadas (JFrame parent, String title, boolean modal) {
    super(parent, title);
    listaE2 = new ListaEnlazada();

    botonesEnlazadas2 = new ArrayList<JButton>();

    graphics();
    organize();
    this.setModal(modal);
    this.setSize(600,300);
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    this.setVisible(true);
  }

  private void graphics () {
    for (int i=0; i<6; i++) {
      botonesEnlazadas2.add( new JButton("ok") );
      botonesEnlazadas2.get(i).addActionListener(this);
    }
    botonCerrar = new JButton("Cerrar");
    botonCerrar.addActionListener(this);
  }

  private void organize () {
    contenedor = getContentPane();
    contenedor.setLayout(new BorderLayout());

    //Auxiliar Enlazadas 2
    grillaEnlazadas2 = new JPanel(new GridLayout(6,2));
    grillaEnlazadas2.add(new JLabel("1. Para insertar dato a la lista "));
    grillaEnlazadas2.add(botonesEnlazadas2.get(0));
    grillaEnlazadas2.add(new JLabel("2. Para mostrar lista "));
    grillaEnlazadas2.add(botonesEnlazadas2.get(1));
    grillaEnlazadas2.add(new JLabel("3. ¿Lista vacía?  "));
    grillaEnlazadas2.add(botonesEnlazadas2.get(2));
    grillaEnlazadas2.add(new JLabel("4. Para borrar el primer dato"));
    grillaEnlazadas2.add(botonesEnlazadas2.get(3));
    grillaEnlazadas2.add(new JLabel("5. Para borrar el último dato"));
    grillaEnlazadas2.add(botonesEnlazadas2.get(4));
    grillaEnlazadas2.add(new JLabel("6. Para calcular el tamaño de la lista"));

    panelEnlazadas2 = new JPanel(new BorderLayout());
    panelEnlazadas2.setBorder(BorderFactory.createTitledBorder("Ejercicio Listas Enlazadas"));
    panelEnlazadas2.setVisible(true);
    panelEnlazadas2.add(new JLabel("      Auxiliar Listas Enlazadas"), BorderLayout.NORTH);
    panelEnlazadas2.add(grillaEnlazadas2, BorderLayout.CENTER);

    JPanel panelBoton = new JPanel(new FlowLayout());
    panelBoton.add(botonCerrar);

    //General
    contenedor.add(panelEnlazadas2,BorderLayout.CENTER);
    contenedor.add(panelBoton,BorderLayout.SOUTH);
  }

  public ListaEnlazada getListaEnlazada () {
    return this.listaE2;
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==botonesEnlazadas2.get(0)){
      int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato deseado:"));
      listaE2.insertarDato(num);
    }
    if(e.getSource()==botonesEnlazadas2.get(1)){
      JOptionPane.showMessageDialog(null, ""+listaE2.listar(), "Imprimir", JOptionPane.PLAIN_MESSAGE);
    }
    if(e.getSource()==botonesEnlazadas2.get(2)){
      JOptionPane.showMessageDialog(null, ""+listaE2.vacia(), "Vacía?", JOptionPane.PLAIN_MESSAGE);
    }
    if(e.getSource()==botonesEnlazadas2.get(3)){
      listaE2.borrarPrimero();
      JOptionPane.showMessageDialog(null, "Se ha borrado el primer elemento.", "Borrar Primero", JOptionPane.PLAIN_MESSAGE);
    }
    if(e.getSource()==botonesEnlazadas2.get(4)){
      listaE2.borrarUltimo();
      JOptionPane.showMessageDialog(null, "Se ha borrado el último elemento.", "Borrar Último", JOptionPane.PLAIN_MESSAGE);
    }
    if(e.getSource()==botonesEnlazadas2.get(5)){
      listaE2.borrarUltimo();
      JOptionPane.showMessageDialog(null, "Tamaño: "+listaE2.calcularTamano(), "Tamaño Lista", JOptionPane.PLAIN_MESSAGE);
    }
    if(e.getSource()==botonCerrar){
      this.dispose();
    }
  }
}
