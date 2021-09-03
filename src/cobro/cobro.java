/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javafx.scene.control.CheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author KATHE
 */
public class cobro extends JFrame implements ActionListener{
    
    menuparqueadero parqueadero;
    
    int b100, b50, b20, b10, b5, cent;
    double arre_dinero[] = {200, 100, 50, 20, 10, 5, 2, 1 0.5};
    double cantidadesIniciales[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    double cantidades[];
    String arre_billetes[] = {"Q200, Q100, Q50, Q20, Q10, Q5, Q2, Q1, Q0.5"};

    String s="" ,ss="",m_inicial="", m_final="";
    double cambio_1, total_Pagar, cambio_2, suma=0.00;
    int nb_nec, nb_entregar, billete;

    JPanel panelRB, panel_Billetes, panel_Monedas, panel_BM, panel_Abajo;
    JRadioButton Billetes;
    JLabel form, cien, cincuenta, veinte, diez, cinco, dos, uno;
    JTextField Cien, Cincuenta, Veinte, Diez, Cinco, Dos, Uno;
    JButton Aceptar, Regresar, Checar, Conf_Adm;

    public cobro(){
    
    super("Forma de pago");
    setSize(350, 200);
    this.setResizable(isMaximumSizeSet ());
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocation(500, 230);

    panelRB = new JPanel();
    panelRB.setLayout(new FlowLayout());
    panelRB.setBackground(Color.WHITE);
    panelRB.add(form = new  JLabel("Forma de pago"));
    
    ButtonGroup radios = new JPanel();
    radios.add(Billetes = new JRadioButton("Billetes"));

    panelRB.add(Billetes);
    panelRB.add(Aceptar = new JButton("Aceptar"));

    panel_Billetes = new JPanel();
    panel_Billetes.setLayout(new GridLayout(2,4));
    panel_Billetes.add(cien = new JLabel("Q100:"));
    panel_Billetes.add(Cien = new JTextField(5));
    panel_Billetes.add(cincuenta = new JLabel("Q50:"));
    panel_Billetes.add(Cincuenta = new JTextField(5));
    panel_Billetes.add(veinte = new JLabel ("20:"));
    panel_Billetes.add(Veinte = new JTextField(5));
    panel_Billetes.add(diez = new JLabel ("10:"));
    panel_Billetes.add(Diez = new JTextField(5));

    panel_Monedas = new JPanel();
    panel_Monedas.setLayout(new GridLayout(4,2));
    panel_Monedas.add(cinco = new JLabel("Q5"));
    panel_Monedas.add(Cinco = new JTextField(5));
    panel_Monedas.add(dos = new JLabel ("Q2"));
    panel_Monedas.add(Dos = new JTextField(5));
    panel_Monedas.add(uno = new JLabel ("Q1"));
    panel_Monedas.add(Uno = new JTextField(5));

    panel_BM = new JPanel();
    panel_BM.setLayout(new GridLayout(1,2));
    panel_BM.add(panel_Billetes);
    panel_BM.add(panel_Monedas);
    
    panel_Abajo = new JPanel();
    panel_Abajo.setLayout(new FlowLayout());
    panel_Abajo.setBackground(Color.white);
    panel_Abajo.add(Checar = new JButton("Pagar"));
    panel_Abajo.add(Conf_Adm = new JButton ("Almacen en caja"));
    panel_Abajo.add(Regresar = new JButton ("Regresar"));

    JPanel panel = (Jpanel)this.getContentPane();
    panel.setLayout(new BorderLayout());

    panel.add("North", panelRB);
    panel.add("Center", panel_BM);
    panel.add("South", panel_Abajo);

    Aceptar.addActionListener(this);
    Regresar.addActionListener(this);
    
}
   
