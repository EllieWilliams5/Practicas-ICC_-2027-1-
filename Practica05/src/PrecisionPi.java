/*
 * Actividad 1.2: Repetir hasta llegar a la precision deseada
 */
public class PrecisionPi {
    public static void main(String[] args) {

        // Error maximo aceptado.
        double tolerancia = 0.1;

	// Variables para contar los dardos.
        int dardosLanzados = 0;
        int dardosDentro = 0;

        // Antes de lanzar comenzar a lanzar, la estimacion es 0,
	// asi que el error inicial es pi.
        double estimacionPi = 0.0;
        double error = Math.abs(estimacionPi - Math.PI);

	// Como esto es mayor que cualquier tolerancia, el ciclo
	// siempre arranca.

        while (error >= tolerancia) {

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

            // La estimacion y el error se recalculan en cada vuelta
	    // del ciclo. Si no, la condicion del while revisaria siempre
	    // el mismo valor y se ejecutaría por siempre y para siempre.
            estimacionPi = 4.0 * dardosDentro / dardosLanzados;
            error = Math.abs(estimacionPi - Math.PI);
	    
        }

	
	// Se imprimen la tolerancia, los dados necesarios, la estimación
	// de Pi y el error.
        System.out.printf("Tolerancia: %s%n", tolerancia);
        System.out.printf("Dardos necesarios: %d%n", dardosLanzados);
        System.out.printf("Estimacion de pi: %.6f%n", estimacionPi);
        System.out.printf("Error: %.6f%n", error);
	
    }
}
