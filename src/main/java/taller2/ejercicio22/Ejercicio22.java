/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller2.ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {
    
    public static void main(String[] args) {
        
        String nombre;
        double salarioHora, horasTrabajadas, salarioMensual;
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = leer.nextLine();

        System.out.print("Ingrese el salario básico por hora: ");
        salarioHora = leer.nextDouble();

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        horasTrabajadas = leer.nextDouble();

        salarioMensual = salarioHora * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println("El salario mensual de " + nombre + " es de: $" + salarioMensual);
        } else {
            System.out.println(nombre);
        }
    }
}
