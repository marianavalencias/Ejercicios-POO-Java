/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto4;

/**
 *
 * @author maria
 */
public class EjercicioResuelto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.util.Scanner leer = new java.util.Scanner(System.in);

// Definición de variables
double EDJUAN, EDALBER, EDANA, EDMAMA;

// Entrada de datos
System.out.print("Ingrese la edad de Juan: ");
EDJUAN = leer.nextDouble();

// Proceso
EDALBER = 2 * EDJUAN / 3;
EDANA = 4 * EDJUAN / 3;
EDMAMA = EDJUAN + EDALBER + EDANA;

// Salida de datos
System.out.println("LAS EDADES SON:");
System.out.println("ALBERTO: " +(int) EDALBER);
System.out.println("JUAN: " + (int)EDJUAN);
System.out.println("ANA: " + (int)EDANA);
System.out.println("MAMA: " + (int)EDMAMA);

    }
    
}
