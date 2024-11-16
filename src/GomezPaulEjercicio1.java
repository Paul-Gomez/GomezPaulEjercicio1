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
                scanner.next(); //Limpio el buffer
            }
        }

        /* Genero la matriz bidimensional con valores aleatorios entre 1 y 9.
        Utilizo dos bucles for para llenar las filas y columnas con números aleatorios.
        random.nextInt (9) va del 0 al 8, por ello pongo el +1.
         */
         */
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }

        //Uso el loop while hasta que la variable finJuego sea true.
        boolean finJuego = false;
        while (!finJuego) {
            //Menú de opciones.
            System.out.println("\nSelecciona una opción:");
            System.out.println("[0] Salir");
            System.out.println("[1] Mostrar matriz");
            System.out.println("[2] Poner bomba");

            //Leo la opción del usuario.
            int opcion = scanner.hasNextInt() ? scanner.nextInt() : -1;
            scanner.nextLine(); // Limpio el buffer.
