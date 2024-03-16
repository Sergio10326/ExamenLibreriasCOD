package Calculadora;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar una calculadora simple.
 */
public class Main {

    /**
     * Método principal para ejecutar la calculadora.
     * Permite al usuario ingresar dos números y seleccionar una operación para realizar con ellos.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este programa)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("0: Suma");
        System.out.println("1: Resta");
        System.out.println("2: Multiplicación");
        System.out.println("3: División");

        int operacion = scanner.nextInt();

        try {
            double resultado = Operacion.operar(num1, num2, operacion);
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Operación no válida");
        }

        scanner.close();
    }
}




