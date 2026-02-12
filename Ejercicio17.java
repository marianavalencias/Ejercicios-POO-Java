/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);

        double radio;
        double area;
        double longitud;

        System.out.print("Ingrese el radio del circulo: ");
        radio = teclado.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;

        System.out.printf("El area del circulo es: %.2f%n", area);
        System.out.printf("La longitud de la circunferencia es: %.2f%n", longitud);

       
    }
    
}
