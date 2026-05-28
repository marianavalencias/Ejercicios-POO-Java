/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras3d;

/**
 *
 * @author maria
 */

public class Piramide3D extends FiguraBase {

private final double base;
private final double altura;
private final double apotema;

public Piramide3D(double base, double altura, double apotema) {

    this.base = base;
    this.altura = altura;
    this.apotema = apotema;

    setVolumen(calcularVolumen());
    setSuperficie(calcularSuperficie());
}

public double calcularVolumen() {

    return (Math.pow(base, 2) * altura) / 3;

}

public double calcularSuperficie() {

    double areaBase = Math.pow(base, 2);

    double areaLateral = 2 * base * apotema;

    return areaBase + areaLateral;

}

}

