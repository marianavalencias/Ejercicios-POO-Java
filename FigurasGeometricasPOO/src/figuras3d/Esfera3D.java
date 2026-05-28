/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras3d;

/**
 *
 * @author maria
 */

public class Esfera3D extends FiguraBase {

private final double radio;

public Esfera3D(double radio) {

    this.radio = radio;

    setVolumen(calcularVolumen());
    setSuperficie(calcularSuperficie());
}

public final double calcularVolumen() {

    return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

}

public final double calcularSuperficie() {

    return 4 * Math.PI * Math.pow(radio, 2);

}

}

