//Importo las clases Random y Scanner.
import java.util.Random;
import java.util.Scanner;

public class GomezPaulEjercicio1 { //Defino la clase.
    public static void main(String[] args) {

        //Creo las instancias scanner y random.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        /* Solicito filas y columnas. Si la entrada no es un número entero, lo vuelvo a solicitar.
           Utilizo un bucle while hasta que el usuario indique un número válido.
         */
        int filas = 0, columnas = 0;
        while (filas <= 0 || columnas <= 0) {
            System.out.print("Indica el número de filas: ");
            if (scanner.hasNextInt()) {
                filas = scanner.nextInt();
                if (filas <= 0) System.out.println("El número debe ser entero. Indica el número de filas:");
            } else {
                System.out.println("Debes introducir un número entero.");
                scanner.next();
            }
            System.out.print("Indica el número de columnas: ");
            if (scanner.hasNextInt()) {
                columnas = scanner.nextInt();
                if (columnas <= 0) System.out.println("El número debe ser entero. Indica el número de columnas:");
            } else {
                System.out.println("Debes introducir un número entero.");
                scanner.next();
            }
        }
