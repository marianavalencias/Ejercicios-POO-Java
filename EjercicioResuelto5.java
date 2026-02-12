/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto5;

/**
 *
 * @author maria
 */
public class EjercicioResuelto5 {

  
    public static void main(String[] args) {
        

        //variables
        double SUMA;
        double X;
        double Y;

        
        SUMA = 0;
        System.out.println("SUMA = " + (int)SUMA);

        X = 20;
        System.out.println("X = " + (int)X);

        SUMA = SUMA + X;
        System.out.println("SUMA = SUMA + X = " + (int)SUMA);

        Y = 40;
        System.out.println("Y = " + (int)Y);

        X = X + Math.pow(Y, 2);
        System.out.println("X = X + Y^2 = " + (int)X);

        SUMA = SUMA + X / Y;
        System.out.println("SUMA = SUMA + X / Y = " + SUMA);

        System.out.println("\nEL VALOR FINAL DE LA SUMA ES: " + SUMA);
    
    }
    
}
