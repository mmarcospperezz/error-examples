import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ej1 {
    private final static Scanner scanner = new Scanner(System.in);
    private static final Logger log = LoggerFactory.getLogger(Ej1.class);

    public static int askInt() {
        Integer number = null;
        do {
            try {
                log.info("Introduce un numero entero");
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                log.error("El valor introducido no es un entero");
            }
            scanner.nextLine();
        } while (number == null);


        return number;
    }

    public static void main(String[] args) {
        int number = askInt();

    }
}

