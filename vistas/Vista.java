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
    this.setSize(400,400);
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
    grillaCirculares.add(new JLabel("1. "));
    grillaCirculares.add(botonesCirculares.get(0));
    grillaCirculares.add(new JLabel("2. "));
    grillaCirculares.add(botonesCirculares.get(1));
    grillaCirculares.add(new JLabel("3. "));
    grillaCirculares.add(botonesCirculares.get(2));
    grillaCirculares.add(new JLabel("4. "));
    grillaCirculares.add(botonesCirculares.get(3));
    grillaCirculares.add(new JLabel("5. "));
    grillaCirculares.add(botonesCirculares.get(4));
    grillaCirculares.add(new JLabel("6. "));
    grillaCirculares.add(botonesCirculares.get(5));

    panelCirculares = new JPanel(new BorderLayout());
    panelCirculares.setBorder(BorderFactory.createTitledBorder("Ejercicio Listas Circulares"));
    panelCirculares.setVisible(true);
    panelCirculares.add(new JLabel("\tMenú 1. Listas Circulares"), BorderLayout.NORTH);
    panelCirculares.add(grillaCirculares, BorderLayout.CENTER);

    //Ejercicio Enlazadas
    grillaEnlazadas = new JPanel(new GridLayout(10,2));
    grillaEnlazadas.add(new JLabel("1. "));
    grillaEnlazadas.add(botonesEnlazadas.get(0));
    grillaEnlazadas.add(new JLabel("2. "));
    grillaEnlazadas.add(botonesEnlazadas.get(1));
    grillaEnlazadas.add(new JLabel("3. "));
    grillaEnlazadas.add(botonesEnlazadas.get(2));
    grillaEnlazadas.add(new JLabel("4. "));
    grillaEnlazadas.add(botonesEnlazadas.get(3));
    grillaEnlazadas.add(new JLabel("5. "));
    grillaEnlazadas.add(botonesEnlazadas.get(4));
    grillaEnlazadas.add(new JLabel("6. "));
    grillaEnlazadas.add(botonesEnlazadas.get(5));
    grillaEnlazadas.add(new JLabel("7. "));
    grillaEnlazadas.add(botonesEnlazadas.get(6));
    grillaEnlazadas.add(new JLabel("8. "));
    grillaEnlazadas.add(botonesEnlazadas.get(7));
    grillaEnlazadas.add(new JLabel("9. "));
    grillaEnlazadas.add(botonesEnlazadas.get(8));
    grillaEnlazadas.add(new JLabel("10. "));
    grillaEnlazadas.add(botonesEnlazadas.get(9));

    panelEnlazadas = new JPanel(new BorderLayout());
    panelEnlazadas.setBorder(BorderFactory.createTitledBorder("Ejercicio Listas Enlazadas"));
    panelEnlazadas.setVisible(true);
    panelEnlazadas.add(new JLabel("\tMenú 2. Listas Enlazadas"), BorderLayout.NORTH);
    panelEnlazadas.add(grillaEnlazadas, BorderLayout.CENTER);

    //Ejercicio Pilas
    grillaPilas = new JPanel(new GridLayout(6,2));
    grillaPilas.add(new JLabel("1. "));
    grillaPilas.add(botonesPilas.get(0));
    grillaPilas.add(new JLabel("2. "));
    grillaPilas.add(botonesPilas.get(1));
    grillaPilas.add(new JLabel("3. "));
    grillaPilas.add(botonesPilas.get(2));
    grillaPilas.add(new JLabel("4. "));
    grillaPilas.add(botonesPilas.get(3));
    grillaPilas.add(new JLabel("5. "));
    grillaPilas.add(botonesPilas.get(4));
    grillaPilas.add(new JLabel("6. "));
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
    //if(e.getSource()==buttonInit){
      //game.playGame();
      //areaResultados.setText(game.getResult());
      //game = new JuegoAtp ();
    //}
  }
}
