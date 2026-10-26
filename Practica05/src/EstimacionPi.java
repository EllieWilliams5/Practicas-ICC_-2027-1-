/*
 * Actividad 1.1: Un numero fijo de dardos
 */
public class EstimacionPi {
    public static void main(String[] args) {

        // Cantidad de dardos a lanzar.
        int dardosTotales = 1000;

	// Contador del ciclo.
        int dardosLanzados = 0;

	// Dardos que caen dentro del cuarto de circulo
        int dardosDentro = 0;     

        while (dardosLanzados < dardosTotales) {
	    
            // Coordenadas al azar dentro del cuadrado, entre 0 y 1
            double x = Math.random();
            double y = Math.random();

            // El dardo esta dentro si su distancia al origen es <= 1.
            if (x * x + y * y <= 1) {
                dardosDentro++;
            }

	    // Sin importar si el dardo quedo dentro o fuera, aumenta
	    // este contador en 1.
            dardosLanzados++;
        }

        // pi = 4 * (dentro / total).
        // El 4.0 hace que la division sea decimal y no entera.
        double estimacionPi = 4.0 * dardosDentro / dardosTotales;

	// Se imprimen la información de los dardos y la estimación de Pi.
        System.out.printf("Dardos lanzados: %d%n", dardosTotales);
        System.out.printf("Dardos dentro del circulo: %d%n", dardosDentro);
        System.out.printf("Estimacion de pi: %.6f%n", estimacionPi);
    }
}
