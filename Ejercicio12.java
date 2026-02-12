/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author maria
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Declaración de variables
        int horasTrabajadas = 48;
        int valorHora = 5000;
        double porcentajeRetencion = 0.125;

        double salarioBruto;
        double retencion;
        double salarioNeto;

        salarioBruto = horasTrabajadas * valorHora;
        retencion = salarioBruto * porcentajeRetencion;
        salarioNeto = salarioBruto - retencion;

        System.out.println("===== LIQUIDACION DE SALARIO =====");
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: $" + valorHora);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retencion (12.5%): $" + retencion);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
    
}
