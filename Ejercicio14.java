/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Ejercicio14 {

    int numero;
    int cuadrado;
    int cubo;

    
    public Ejercicio14() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();
    }

    public void hallar_cuadrado() {
        cuadrado = numero * numero;
        System.out.println("El cuadrado es igual a: " + cuadrado);
    }

    public void hallar_cubo() {
        cubo = numero * numero * numero;
        System.out.println("El cubo es igual a: " + cubo);
    }

    public static void main(String[] args) {
        Ejercicio14 obj = new Ejercicio14();
        obj.hallar_cuadrado();
        obj.hallar_cubo();
    }
}
