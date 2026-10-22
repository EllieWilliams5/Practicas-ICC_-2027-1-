public class Programa {
    public static void main(String[] args) {

        // Nombre del producto que se va a comprar.
        String producto = "Laptop para la carrera";
        // Precio del producto en pesos.
        int precio = 15000;
        // Descuento que se aplica al precio del producto.
        int descuento = 3000;
        // Plazo de pago en meses (double para que las divisiones den decimales).
        double meses = 18.0;

        // Encabezado de la ficha.
        System.out.println("=== Ficha de compra ===");
        // El nombre del producto.
        System.out.println("- Producto : " + producto);
        // Precio final. Los parentesis hacen la resta antes de unirla al texto.
        System.out.println("- Precio con descuento : " + (precio - descuento));
        // Plazo convertido de meses a años.
        System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
        // Pago mensual. el precio con descuento repartido entre los meses del plazo.
        System.out.println("- Pago mensual : " + ((precio - descuento) / meses));
        // Cierre de la ficha.
        System.out.println("=== Fin de la ficha ===");

    }
}
