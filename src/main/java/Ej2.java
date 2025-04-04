import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 implements Reader<Student>{
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger log = LoggerFactory.getLogger(Ej2.class);

    public  Student read(){
        log.info("Introduzca su NIF:");
        String nif = scanner.nextLine();
        log.info("Introduzca su nombre:");
        String name = scanner.nextLine();
        log.info("Introduzca su apellido:");
        String surname = scanner.nextLine();
        int zipCode = askZipCode();

        return new Student(
                nif,
                name,
                surname,
                zipCode
        );
    }

    private static int askZipCode() {
         Integer zipCode = null;
        do {
            try {
                log.info("Introduce el codigo postal");
                zipCode = scanner.nextInt();
            } catch (InputMismatchException e) {
                log.error("El valor introducido no entero ni positivo");
            }
            scanner.nextLine();
        } while (zipCode == null);


        return zipCode;
    }

}
