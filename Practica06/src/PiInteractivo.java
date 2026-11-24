/*
 * Practica 6 - Actividad 1.1: Dardos a la medida
 * Estima pi con el metodo Monte Carlo. Ahora el usuario elige cuantos
 * dardos lanzar, y el programa vuelve a pedir el dato mientras no sea
 * un entero positivo.
 */
import java.util.Scanner;

public class PiInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Pedir la cantidad de dardos hasta que sea valida =====
        int dardosTotales = 0;
        boolean datoValido = false;

        while (!datoValido) {
            System.out.print("Cuantos dardos quieres lanzar? ");

            if (sc.hasNextInt()) {
                dardosTotales = sc.nextInt();
                if (dardosTotales > 0) {
                    datoValido = true;
                } else {
                    System.out.println("> La cantidad de dardos debe ser mayor que 0.");
                }
            } else {
                // hasNextInt() no consume nada: hay que descartar lo que se
                // escribio con next(); si no, el ciclo lo revisaria para siempre.
                String entradaInvalida = sc.next();
                System.out.println("> \"" + entradaInvalida
                        + "\" no es un numero entero valido (o es demasiado grande).");
            }
        }

        // ===== El resto funciona igual que en la Practica 5 =====
        int dardosLanzados = 0;
        int dardosDentro = 0;

        while (dardosLanzados < dardosTotales) {
            double x = Math.random();
            double y = Math.random();

            if (x * x + y * y <= 1) {
                dardosDentro++;
            }
            dardosLanzados++;
        }

        double estimacionPi = 4.0 * dardosDentro / dardosTotales;

        System.out.printf("Dardos lanzados: %d%n", dardosTotales);
        System.out.printf("Dardos dentro del circulo: %d%n", dardosDentro);
        System.out.printf("Estimacion de pi: %.6f%n", estimacionPi);

        sc.close();
    }
}
