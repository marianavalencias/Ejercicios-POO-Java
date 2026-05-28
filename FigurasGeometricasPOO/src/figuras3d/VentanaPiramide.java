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

public class VentanaPiramide extends JFrame implements ActionListener {


JLabel base;
JLabel altura;
JLabel apotema;
JLabel volumen;
JLabel superficie;

JTextField textoBase;
JTextField textoAltura;
JTextField textoApotema;

JButton calcular;

public VentanaPiramide() {

    setLayout(null);

    setTitle("Piramide");

    setSize(350,350);

    setLocationRelativeTo(null);

    base = new JLabel("Base:");
    base.setBounds(20,20,100,20);
    add(base);

    textoBase = new JTextField();
    textoBase.setBounds(120,20,120,20);
    add(textoBase);

    altura = new JLabel("Altura:");
    altura.setBounds(20,60,100,20);
    add(altura);

    textoAltura = new JTextField();
    textoAltura.setBounds(120,60,120,20);
    add(textoAltura);

    apotema = new JLabel("Apotema:");
    apotema.setBounds(20,100,100,20);
    add(apotema);

    textoApotema = new JTextField();
    textoApotema.setBounds(120,100,120,20);
    add(textoApotema);

    calcular = new JButton("Calcular");
    calcular.setBounds(90,150,120,30);
    add(calcular);

    calcular.addActionListener(this);

    volumen = new JLabel("Volumen:");
    volumen.setBounds(20,220,250,20);
    add(volumen);

    superficie = new JLabel("Superficie:");
    superficie.setBounds(20,260,250,20);
    add(superficie);

}

@Override
public void actionPerformed(ActionEvent e) {

    double b =
            Double.parseDouble(textoBase.getText());

    double h =
            Double.parseDouble(textoAltura.getText());

    double a =
            Double.parseDouble(textoApotema.getText());

    double v =
            (b * b * h) / 3;

    double s =
            (b * b) + (2 * b * a);

    volumen.setText(
            "Volumen: " +
            String.format("%.2f",v));

    superficie.setText(
            "Superficie: " +
            String.format("%.2f",s));

}


}
