package Calculadora;

import java.util.Scanner;

public class Main {

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
        System.out.println("4: Raíz");

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

