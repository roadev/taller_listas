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

    panelCirculares = new JPanel(new BorderLayout());
    panelCirculares.setBorder(BorderFactory.createTitledBorder("Ejercicio Listas Circulares"));
    panelCirculares.setVisible(true);
    panelCirculares.add(new JLabel("\tMenú 1. Listas Circulares"), BorderLayout.NORTH);

    panelEnlazadas = new JPanel(new BorderLayout());
    panelEnlazadas.setBorder(BorderFactory.createTitledBorder("Ejercicio Listas Enlazadas"));
    panelEnlazadas.setVisible(true);
    panelEnlazadas.add(new JLabel("\tMenú 2. Listas Enlazadas"), BorderLayout.NORTH);

    panelPilas = new JPanel(new BorderLayout());
    panelPilas.setBorder(BorderFactory.createTitledBorder("Ejercicio Pilas"));
    panelPilas.setVisible(true);
    panelPilas.add(new JLabel("\tMenú 3. Pilas"), BorderLayout.NORTH);

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
