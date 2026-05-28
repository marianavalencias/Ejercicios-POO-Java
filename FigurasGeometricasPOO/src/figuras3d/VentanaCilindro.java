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

public class VentanaCilindro extends JFrame implements ActionListener {


JLabel radio;
JLabel altura;
JLabel volumen;
JLabel superficie;

JTextField textoRadio;
JTextField textoAltura;

JButton calcular;

public VentanaCilindro() {

    setLayout(null);

    setTitle("Cilindro");

    setSize(320,300);

    setLocationRelativeTo(null);

    radio = new JLabel("Radio:");
    radio.setBounds(20,20,100,20);
    add(radio);

    textoRadio = new JTextField();
    textoRadio.setBounds(120,20,120,20);
    add(textoRadio);

    altura = new JLabel("Altura:");
    altura.setBounds(20,60,100,20);
    add(altura);

    textoAltura = new JTextField();
    textoAltura.setBounds(120,60,120,20);
    add(textoAltura);

    calcular = new JButton("Calcular");
    calcular.setBounds(90,110,120,30);
    add(calcular);

    calcular.addActionListener(this);

    volumen = new JLabel("Volumen:");
    volumen.setBounds(20,170,250,20);
    add(volumen);

    superficie = new JLabel("Superficie:");
    superficie.setBounds(20,210,250,20);
    add(superficie);

}

@Override
public void actionPerformed(ActionEvent e) {

    double r =
            Double.parseDouble(textoRadio.getText());

    double h =
            Double.parseDouble(textoAltura.getText());

    double v =
            Math.PI * r * r * h;

    double s =
            2 * Math.PI * r * (h + r);

    volumen.setText(
            "Volumen: " +
            String.format("%.2f",v));

    superficie.setText(
            "Superficie: " +
            String.format("%.2f",s));

}


}

