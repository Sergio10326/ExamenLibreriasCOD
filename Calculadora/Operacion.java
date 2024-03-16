package Calculadora;

/**
 * Esta libreria se utiliza para hacer operaciones
 */
public final class Operacion {
    /**
     * Opcion para elegir Sumar
     */
    public static final int SUMA = 0;
    /**
     * Opcion para elegir Restar
     */
    public static final int RESTA = 1;
    /**
     * Opcion para elegir Multiplicar
     */
    public static final int MULTIPLICACION = 2;
    /**
     * Opcion para elegir Dividir
     */
    public static final int DIVISION = 3;
    /**
     * Opcion para elegir Raiz de cualquier índice
     */
    public static final int RAIZ = 4;

    /**
     * Realiza la operación especificada entre dos números.
     * @param num1 el primer número
     * @param num2 el segundo número
     * @param operacion el tipo de operación a realizar
     * @return el resultado de la operación
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
            case RAIZ:
                if (num1 < 0 && num2 % 2 == 0) {
                    throw new ArithmeticException("No se puede calcular la raíz de un número negativo con un índice par");
                }
                return Math.pow(num1, 1.0 / num2);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}
