/**
* @author Diana Carolina Hernández
* @version 0.5
* @license 
*/

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vista extends JFrame implements ActionListener{

  Container contenedor;
  JTabbedPane tabs;
  JPanel panelCirculares, panelEnlazadas, panelPilas;
  JPanel grillaCirculares, grillaEnlazadas, grillaPilas;
  ArrayList<JButton> botonesCirculares, botonesEnlazadas, botonesPilas;
  //
  ListaC listaC;
  ListaEnlazada listaE;
  Pila pila; 

  public Vista () {
    listaC = new ListaC();
    listaE = new ListaEnlazada();
    pila = new Pila();

    botonesCirculares = new ArrayList<JButton>();
    botonesEnlazadas = new ArrayList<JButton>();
    botonesPilas = new ArrayList<JButton>();
    
    tabs = new JTabbedPane();

    graphics();
    organize();
    this.setSize(600,400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setTitle("Vistas");
  }

  private void graphics () {
    for (int i=0; i<6; i++) {
      botonesCirculares.add( new JButton("ok") );
      botonesCirculares.get(i).addActionListener(this);
    }
    for (int i=0; i<10; i++) {
      botonesEnlazadas.add( new JButton("ok") );
      botonesEnlazadas.get(i).addActionListener(this);
    }
    for (int i=0; i<6; i++) {
      botonesPilas.add( new JButton("ok") );
      botonesPilas.get(i).addActionListener(this);
    }
  }

  private void organize () {
    contenedor = getContentPane();
    contenedor.setLayout(new BorderLayout());

    //Ejercicio Cirulares
    grillaCirculares = new JPanel(new GridLayout(6,2));
    grillaCirculares.add(new JLabel("1. Para saber si la lista está vacía "));
    grillaCirculares.add(botonesCirculares.get(0));
    grillaCirculares.add(new JLabel("2. Para saber el tamaño de la lista "));
    grillaCirculares.add(botonesCirculares.get(1));
    grillaCirculares.add(new JLabel("3. Para insertar un dato a la lista"));
    grillaCirculares.add(botonesCirculares.get(2));
    grillaCirculares.add(new JLabel("4. Para definir el grado del polinomio"));
    grillaCirculares.add(botonesCirculares.get(3));
    grillaCirculares.add(new JLabel("5. Para mostrar el polinomio"));
    grillaCirculares.add(botonesCirculares.get(4));
    grillaCirculares.add(new JLabel("6. Para operar el polinomio "));
    grillaCirculares.add(botonesCirculares.get(5));

    panelCirculares = new JPanel(new BorderLayout());
    panelCirculares.setBorder(BorderFactory.createTitledBorder("Ejercicio Listas Circulares"));
    panelCirculares.setVisible(true);
    panelCirculares.add(new JLabel("\tMenú 1. Listas Circulares"), BorderLayout.NORTH);
    panelCirculares.add(grillaCirculares, BorderLayout.CENTER);

    //Ejercicio Enlazadas
    grillaEnlazadas = new JPanel(new GridLayout(10,2));
    grillaEnlazadas.add(new JLabel("1. Para insertar dato a la lista "));
    grillaEnlazadas.add(botonesEnlazadas.get(0));
    grillaEnlazadas.add(new JLabel("2. Para mostrar lista "));
    grillaEnlazadas.add(botonesEnlazadas.get(1));
    grillaEnlazadas.add(new JLabel("3. ¿Lista vacía?  "));
    grillaEnlazadas.add(botonesEnlazadas.get(2));
    grillaEnlazadas.add(new JLabel("4. Para borrar el primer dato"));
    grillaEnlazadas.add(botonesEnlazadas.get(3));
    grillaEnlazadas.add(new JLabel("5. Retorna un dato dada su posición"));
    grillaEnlazadas.add(botonesEnlazadas.get(4));
    grillaEnlazadas.add(new JLabel("6. Para borrar el último dato"));
    grillaEnlazadas.add(botonesEnlazadas.get(5));
    grillaEnlazadas.add(new JLabel("7. Para calcular el tamaño de la lista"));
    grillaEnlazadas.add(botonesEnlazadas.get(6));
    grillaEnlazadas.add(new JLabel("8. Para fraccionar la lista"));
    grillaEnlazadas.add(botonesEnlazadas.get(7));
    grillaEnlazadas.add(new JLabel("9. Concatena un par de listas"));
    grillaEnlazadas.add(botonesEnlazadas.get(8));
    grillaEnlazadas.add(new JLabel("10. Eliminar dado pos"));
    grillaEnlazadas.add(botonesEnlazadas.get(9));

    panelEnlazadas = new JPanel(new BorderLayout());
    panelEnlazadas.setBorder(BorderFactory.createTitledBorder("Ejercicio Listas Enlazadas"));
    panelEnlazadas.setVisible(true);
    panelEnlazadas.add(new JLabel("\tMenú 2. Listas Enlazadas"), BorderLayout.NORTH);
    panelEnlazadas.add(grillaEnlazadas, BorderLayout.CENTER);

    //Ejercicio Pilas
    grillaPilas = new JPanel(new GridLayout(6,2));
    grillaPilas.add(new JLabel("1. Para apilar un valor"));
    grillaPilas.add(botonesPilas.get(0));
    grillaPilas.add(new JLabel("2. Para mostrar la pila"));
    grillaPilas.add(botonesPilas.get(1));
    grillaPilas.add(new JLabel("3. Para eliminar la pila"));
    grillaPilas.add(botonesPilas.get(2));
    grillaPilas.add(new JLabel("4. Para ver la cima de la pila"));
    grillaPilas.add(botonesPilas.get(3));
    grillaPilas.add(new JLabel("5. Para saber si la pila está vacía"));
    grillaPilas.add(botonesPilas.get(4));
    grillaPilas.add(new JLabel("6. Para desapilar"));
    grillaPilas.add(botonesPilas.get(5));

    panelPilas = new JPanel(new BorderLayout());
    panelPilas.setBorder(BorderFactory.createTitledBorder("Ejercicio Pilas"));
    panelPilas.setVisible(true);
    panelPilas.add(new JLabel("\tMenú 3. Pilas"), BorderLayout.NORTH);
    panelPilas.add(grillaPilas, BorderLayout.CENTER);

    //General
    tabs.addTab("Listas Circulares", panelCirculares);
    tabs.addTab("Listas Enlazadas", panelEnlazadas);
    tabs.addTab("Pilas", panelPilas);

    contenedor.add(tabs,BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==botonesCirculares.get(0)){
      JOptionPane.showMessageDialog(null, "Vacía?", listaC.vacia(), JOptionPane.PLAIN_MESSAGE);
    }
    if(e.getSource()==botonesCirculares.get(1)){
      JOptionPane.showMessageDialog(null, "Tamaño Lista", listaC.calcularTamano(), JOptionPane.PLAIN_MESSAGE);
    }
    if(e.getSource()==botonesCirculares.get(2)){
      JOptionPane.showMessageDialog(null, "3 xyz");
    }
    if(e.getSource()==botonesCirculares.get(3)){
      JOptionPane.showMessageDialog(null, "4 xyz");
    }
    if(e.getSource()==botonesCirculares.get(4)){
      JOptionPane.showMessageDialog(null, "5 xyz");
    }
    if(e.getSource()==botonesCirculares.get(5)){
      JOptionPane.showMessageDialog(null, "6 xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(0)){
      JOptionPane.showMessageDialog(null, "1 xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(1)){
      JOptionPane.showMessageDialog(null, "2 xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(2)){
      JOptionPane.showMessageDialog(null, "3 xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(3)){
      JOptionPane.showMessageDialog(null, "4. xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(4)){
      JOptionPane.showMessageDialog(null, "5. xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(5)){
      JOptionPane.showMessageDialog(null, "6. xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(6)){
      JOptionPane.showMessageDialog(null, "7. xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(7)){
      JOptionPane.showMessageDialog(null, "8. xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(8)){
      JOptionPane.showMessageDialog(null, "9. xyz");
    }
    if(e.getSource()==botonesEnlazadas.get(9)){
      JOptionPane.showMessageDialog(null, "10. xyz");
    }
    if(e.getSource()==botonesPilas.get(0)){
      JOptionPane.showMessageDialog(null, "1 xyz");
    }
    if(e.getSource()==botonesPilas.get(1)){
      JOptionPane.showMessageDialog(null, "2 xyz");
    }
    if(e.getSource()==botonesPilas.get(2)){
      JOptionPane.showMessageDialog(null, "3 xyz");
    }
    if(e.getSource()==botonesPilas.get(3)){
      JOptionPane.showMessageDialog(null, "4 xyz");
    }
    if(e.getSource()==botonesPilas.get(4)){
      JOptionPane.showMessageDialog(null, "5 xyz");
    }
    if(e.getSource()==botonesPilas.get(5)){
      JOptionPane.showMessageDialog(null, "6 xyz");
    }
  }
}
