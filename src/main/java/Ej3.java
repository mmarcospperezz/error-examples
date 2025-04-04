import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger log = LoggerFactory.getLogger(Ej2.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                log.info("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                scanner.nextLine();
                entradaValida = true;
            } catch (InputMismatchException e) {
                log.error("Error: Debe ingresar un número válido.");
                scanner.nextLine();
            }
        }

        entradaValida = false;
        while (!entradaValida) {
            try {
                log.info("Ingrese el segundo número (distinto de cero): ");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    throw new ArithmeticException("El divisor no puede ser cero.");
                }
                entradaValida = true;
            } catch (InputMismatchException e) {
                log.error("Error: Debe ingresar un número válido.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                log.error("Error: " + e.getMessage());
            }
        }


        double resultado = num1 / num2;
        log.info("El resultado de la división es: " + resultado);
    }
}
