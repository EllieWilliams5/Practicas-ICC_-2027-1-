public class ProgramaNuevo {
    public static void main(String[] args) {

        String producto = "Laptop para la carrera";
        int precio = 15000;
        int descuento = 3000;
        double meses = 18.0;

        System.out.println("=== Ficha de compra ===");

        // Un solo printf imprime los cuatro datos. Cada especificador se
        // reemplaza, en orden por el valor que le corresponde:
        // %s -> Texto (producto).
        // %d -> Entero (precio con descuento).
        // %.2f -> Decimal con 1 cifra (plazo en anios).
        // %.2f -> Decimal con 2 cifras, como un precio (pago mensual).
        // %n -> Salto de linea.
        System.out.printf("- Producto : %s%n- Precio con descuento : %d%n- Plazo de pago en anios : %.1f%n- Pago mensual : %.2f%n",
                producto, (precio - descuento), (meses / 12.0), ((precio - descuento) / meses));

        System.out.println("=== Fin de la ficha ===");

    }
}
