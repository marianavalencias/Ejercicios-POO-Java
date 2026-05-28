/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras3d;

/**
 *
 * @author maria
 */




import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame implements ActionListener {

JButton piramide;
JButton esfera;
JButton cilindro;

public VentanaMenu() {

    setLayout(null);

    setTitle("Menu");

    setSize(350,200);

    setLocationRelativeTo(null);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    esfera = new JButton("Esfera");
    esfera.setBounds(40,50,100,30);
    add(esfera);

    cilindro = new JButton("Cilindro");
    cilindro.setBounds(170,50,100,30);
    add(cilindro);
    
    piramide = new JButton("Piramide");
    piramide.setBounds(105,100,120,30);
    Component add = add(piramide);

piramide.addActionListener(this);

    esfera.addActionListener(this);
    cilindro.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e) {

    if(e.getSource()==esfera){

        VentanaEsfera v =
                new VentanaEsfera();

        v.setVisible(true);

    }

    if(e.getSource()==cilindro){

        VentanaCilindro v =
                new VentanaCilindro();

        v.setVisible(true);

    }
if(e.getSource()==piramide){


VentanaPiramide v =
        new VentanaPiramide();

v.setVisible(true);


}

}


}






