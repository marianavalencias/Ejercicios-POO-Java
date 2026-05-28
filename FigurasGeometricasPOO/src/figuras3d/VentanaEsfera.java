/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras3d;

/**
 *
 * @author maria
 */



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends JFrame implements ActionListener {


JLabel radio;
JLabel volumen;
JLabel superficie;

JTextField textoRadio;

JButton calcular;

public VentanaEsfera() {

    setLayout(null);

    setTitle("Esfera");

    setSize(320,250);

    setLocationRelativeTo(null);

    radio = new JLabel("Radio:");

    radio.setBounds(20,20,100,20);

    add(radio);

    textoRadio = new JTextField();

    textoRadio.setBounds(100,20,120,20);

    add(textoRadio);

    calcular = new JButton("Calcular");

    calcular.setBounds(90,70,120,30);

    add(calcular);

    calcular.addActionListener(this);

    volumen = new JLabel("Volumen:");

    volumen.setBounds(20,130,250,20);

    add(volumen);

    superficie = new JLabel("Superficie:");

    superficie.setBounds(20,170,250,20);

    add(superficie);

}

@Override
public void actionPerformed(ActionEvent e) {

    double r =
            Double.parseDouble(textoRadio.getText());

    double v =
            (4.0/3.0) * Math.PI * r * r * r;

    double s =
            4 * Math.PI * r * r;

    volumen.setText(
            "Volumen: " +
            String.format("%.2f",v));

    superficie.setText(
            "Superficie: " +
            String.format("%.2f",s));

}


}

