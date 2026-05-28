/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas_estudiante;

/**
 *
 * @author maria
 */

public class Calificaciones {


public double[] notas = new double[5];

public double promedio() {
    double suma = 0;

    for (double n : notas) {
        suma += n;
    }

    return suma / notas.length;
}

public double desviacion() {
    double prom = promedio();
    double acumulado = 0;

    for (double n : notas) {
        acumulado += Math.pow(n - prom, 2);
    }

    return Math.sqrt(acumulado / notas.length);
}

public double notaMayor() {
    double mayor = notas[0];

    for (double n : notas) {
        if (n > mayor) {
            mayor = n;
        }
    }

    return mayor;
}

public double notaMenor() {
    double menor = notas[0];

    for (double n : notas) {
        if (n < menor) {
            menor = n;
        }
    }

    return menor;
}


}
