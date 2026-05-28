/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras3d;

/**
 *
 * @author maria
 */

public class Cilindro3D extends FiguraBase {

private final double radio;
private final double altura;

public Cilindro3D(double radio, double altura) {

    this.radio = radio;
    this.altura = altura;

    setVolumen(calcularVolumen());
    setSuperficie(calcularSuperficie());
}

public double calcularVolumen() {

    return Math.PI * Math.pow(radio, 2) * altura;

}

public double calcularSuperficie() {

    return 2 * Math.PI * radio * (altura + radio);

}

}

