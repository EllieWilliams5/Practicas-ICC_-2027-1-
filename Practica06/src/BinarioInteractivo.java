/*
 * Practica 6 - Actividad 1.2: Decimal a binario interactivo
 * Convierte a binario el numero entero no negativo que elija el usuario,
 * usando divisiones sucesivas entre 2. Se repite mientras el usuario
 * responda s o S.
 */
import java.util.Scanner;

public class BinarioInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char respuesta;

        do {
            // ===== Pedir el numero hasta que sea valido =====
            int numero = 0;
            boolean datoValido = false;

            while (!datoValido) {
                System.out.print("Escribe un numero entero no negativo: ");

                if (sc.hasNextInt()) {
                    numero = sc.nextInt();
                    if (numero >= 0) {
                        datoValido = true;
                    } else {
                        System.out.println("> El numero no puede ser negativo.");
                    }
                } else {
                    String entradaInvalida = sc.next();   // descartar la entrada
                    System.out.println("> \"" + entradaInvalida
                            + "\" no es un numero entero valido (o es demasiado grande).");
                }
            }

            // ===== Conversion por divisiones sucesivas =====
            // Cada residuo es un bit. Como los residuos salen del ultimo al
            // primero, cada bit nuevo se pega a la IZQUIERDA del resultado.
            String binario = "";
            int cociente = numero;

            if (cociente == 0) {
                binario = "0";      // el ciclo no da vueltas con 0
            }

            while (cociente > 0) {
                int residuo = cociente % 2;
                binario = residuo + binario;
                cociente = cociente / 2;
            }

            System.out.println("El numero " + numero + " en binario es: " + binario);

            // ===== Preguntar si quiere convertir otro =====
            System.out.print("Quieres convertir otro numero? (s/n): ");
            respuesta = sc.next().charAt(0);

        } while (respuesta == 's' || respuesta == 'S');

        System.out.println("Hasta luego!");
        sc.close();
    }
}
