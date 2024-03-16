package Calculadora;

/**
 * Esta clase proporciona operaciones básicas de matemáticas.
 */
public final class Operacion {
    /**
     * Opción para elegir Sumar.
     */
    public static final int SUMA = 0;
    /**
     * Opción para elegir Restar.
     */
    public static final int RESTA = 1;
    /**
     * Opción para elegir Multiplicar.
     */
    public static final int MULTIPLICACION = 2;
    /**
     * Opción para elegir Dividir.
     */
    public static final int DIVISION = 3;

    /**
     * Realiza la operación especificada entre dos números.
     *
     * @param num1      El primer número.
     * @param num2      El segundo número.
     * @param operacion El tipo de operación a realizar. Debe ser una de las constantes definidas en esta clase (SUMA, RESTA, MULTIPLICACION o DIVISION).
     * @return El resultado de la operación.
     * @throws ArithmeticException   Si se intenta dividir por cero.
     * @throws IllegalArgumentException Si se proporciona un tipo de operación no válido.
     */
    public static double operar(double num1, double num2, int operacion) {
        switch (operacion) {
            case SUMA:
                return num1 + num2;
            case RESTA:
                return num1 - num2;
            case MULTIPLICACION:
                return num1 * num2;
            case DIVISION:
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}

