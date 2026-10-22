/*
 * Cotizador del senor Pines : Calcula el interes simple de un prestamo,
 * el total a pagar y la mensualidad, a partir de los datos del cliente.
 */
public class Cotizador {
    public static void main(String[] args) {

        // ### Datos del cliente ###
	
        String nombreCliente = "Robbie Valentino";
	
        // Clasificaciones: 'P' de Preferente; 'E' de Estandar; 'R' de Riesgoso.
        // Por ahora no cambia el calculo, pero el senor Pines la quiere registrada...
        char clasificacionCliente = 'E';

        // ### Datos del prestamo ###

	// Monto prestado.
        double capital = 12899.0;

	// Porcentaje que se cobra por año.
        double tasaAnual = 15.0;

	// Plazo en meses en los que se hará el pago.
        int plazoMeses = 21;

        // ### Cálculos ###
	
        // La fórmula usa el tiempo en anios.
	// Se divide entre los 12 meses del año.
        double plazoAnios = plazoMeses / 12.0;

        // Interes simple = capital * (tasa / 100) * tiempo en años.
        double interes = capital * (tasaAnual / 100) * plazoAnios;

	// El pago en total.
        double totalAPagar = capital + interes;

        // La mensualidad reparte el total entre los meses del plazo.
        double mensualidad = totalAPagar / plazoMeses;

        // ### Reporte del cliente ###

	// Se imprimen todos los datos con printf
        System.out.println("\n+++++ Cotizador de La Cabana del Misterio +++++\n");
	System.out.println("--- Datos del cliente ---");
        System.out.printf("Cliente: %s%n", nombreCliente);
        System.out.printf("Clasificacion: %c%n", clasificacionCliente);
        System.out.println();
        System.out.println("--- Datos del prestamo ---");
        System.out.printf("Capital: $%.2f%n", capital);
        System.out.printf("Tasa anual: %.2f%%%n", tasaAnual);
        System.out.printf("Plazo: %d meses (%.2f anios)%n", plazoMeses, plazoAnios);
        System.out.println();
        System.out.println("--- Resultado ---");
        System.out.printf("Interes total: $%.2f%n", interes);
        System.out.printf("Total a pagar: $%.2f%n", totalAPagar);
        System.out.printf("Mensualidad: $%.2f%n", mensualidad);
	System.out.println();
    }
}
