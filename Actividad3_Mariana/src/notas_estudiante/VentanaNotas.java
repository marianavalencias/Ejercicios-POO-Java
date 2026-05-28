/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas_estudiante;

/**
 *
 * @author maria
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaNotas extends JFrame implements ActionListener {

    private final JLabel n1;
    private final JLabel n2;
    private final JLabel n3;
    private final JLabel n4;
    private final JLabel n5;
    
    private final JTextField txt1;
    private final JTextField txt2;
    private final JTextField txt3;
    private final JTextField txt4;
    private final JTextField txt5;
    
    private final JButton btnCalcular;
    private final JButton btnLimpiar;
    private final JLabel lblPromedio;
    private final JLabel lblDesviacion;

    private final JLabel lblMayor;
    private final JLabel lblMenor;

public VentanaNotas() {

    setTitle("Sistema Academico");
    setSize(500, 430);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contenedor = getContentPane();
    contenedor.setLayout(null);

    n1 = new JLabel("Ingrese Nota 1:");
    n1.setBounds(20, 20, 120, 25);
    contenedor.add(n1);

    txt1 = new JTextField();
    txt1.setBounds(150, 20, 150, 25);
    contenedor.add(txt1);

    n2 = new JLabel("Ingrese Nota 2:");
    n2.setBounds(20, 60, 120, 25);
    contenedor.add(n2);

    txt2 = new JTextField();
    txt2.setBounds(150, 60, 150, 25);
    contenedor.add(txt2);

    n3 = new JLabel("Ingrese Nota 3:");
    n3.setBounds(20, 100, 120, 25);
    contenedor.add(n3);

    txt3 = new JTextField();
    txt3.setBounds(150, 100, 150, 25);
    contenedor.add(txt3);

    n4 = new JLabel("Ingrese Nota 4:");
    n4.setBounds(20, 140, 120, 25);
    contenedor.add(n4);

    txt4 = new JTextField();
    txt4.setBounds(150, 140, 150, 25);
    contenedor.add(txt4);

    n5 = new JLabel("Ingrese Nota 5:");
    n5.setBounds(20, 180, 120, 25);
    contenedor.add(n5);

    txt5 = new JTextField();
    txt5.setBounds(150, 180, 150, 25);
    contenedor.add(txt5);

    btnCalcular = new JButton("Procesar");
    btnCalcular.setBounds(70, 230, 120, 30);
    btnCalcular.addActionListener(this);
    contenedor.add(btnCalcular);

    btnLimpiar = new JButton("Borrar");
    btnLimpiar.setBounds(220, 230, 120, 30);
    btnLimpiar.addActionListener(this);
    contenedor.add(btnLimpiar);

    lblPromedio = new JLabel("Promedio:");
    lblPromedio.setBounds(20, 280, 300, 25);
    contenedor.add(lblPromedio);

    lblDesviacion = new JLabel("Desviación:");
    lblDesviacion.setBounds(20, 310, 300, 25);
    contenedor.add(lblDesviacion);

    lblMayor = new JLabel("Nota mayor:");
    lblMayor.setBounds(20, 340, 300, 25);
    contenedor.add(lblMayor);

    lblMenor = new JLabel("Nota menor:");
    lblMenor.setBounds(20, 370, 300, 25);
    contenedor.add(lblMenor);
}

@Override
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == btnCalcular) {

        try {

            Calificaciones datos = new Calificaciones();

            datos.notas[0] = Double.parseDouble(txt1.getText());
            datos.notas[1] = Double.parseDouble(txt2.getText());
            datos.notas[2] = Double.parseDouble(txt3.getText());
            datos.notas[3] = Double.parseDouble(txt4.getText());
            datos.notas[4] = Double.parseDouble(txt5.getText());

            lblPromedio.setText("Promedio: " + String.format("%.2f", datos.promedio()));

            lblDesviacion.setText("Desviación: " + String.format("%.2f", datos.desviacion()));

            lblMayor.setText("Nota mayor: " + datos.notaMayor());

            lblMenor.setText("Nota menor: " + datos.notaMenor());

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese solo números",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    if (e.getSource() == btnLimpiar) {

        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");

    }
}


}

