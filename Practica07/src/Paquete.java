/**
 * Modela la entidad de un paquete para la empresa de envios postales y paqueteria.
 * Encapsula la informacion fisica (peso, dimensiones espaciales), codigo de rastreo
 * y valor monetario declarado. Provee metodos para determinar el peso
 * volumetrico y el peso cobrable.
 * 
 * @author Su laboratorista Manolin
 * @version 1.0
 */
public class Paquete {

    // ##### Atributos #####

    /** Codigo alfanumerico unico que identifica al paquete en el almacen. */
    private String codigoRastreo;

    /** Peso fisico real de la mercancia en kilogramos. */
    private double peso;

    /** Altura del paquete en centimetros. */
    private double alto;

    /** Anchura del paquete en centimetros. */
    private double ancho;

    /** Longitud o largo del paquete en centimetros. */
    private double largo;

    /** Valor comercial declarado del contenido en moneda nacional (MXN). */
    private double valorDeclarado;

    /** Indica si el cliente solicito entrega prioritaria urgente / express. */
    private boolean envioExpress;


    /** Porcentaje de recargo para envios express. */
    public static final double PORCENTAJE_EXPRESS = 30.0;

    // ##### Constructores #####

    /**
     * Crea un paquete estandar con dimensiones y valores minimos predeterminados.
     */
    public Paquete() {
        this.codigoRastreo = "ND-000";
        this.peso = 1.0;
        this.alto = 10.0;
        this.ancho = 10.0;
        this.largo = 10.0;
        this.valorDeclarado = 100.0;
        this.envioExpress = false;
    }

    /**
     * Crear un paquete con los parametros especificados
     * 
     * @param codigoRastreo Codigo unico de rastreo.
     * @param peso Peso fisico en kilogramos (debe ser mayor a 0).
     * @param alto Altura en centimetros (debe ser mayor a 0).
     * @param ancho Anchura en centimetros (debe ser mayor a 0).
     * @param largo Longitud en centimetros (debe ser mayor a 0).
     * @param valorDeclarado Valor monetario declarado (mayor o igual a 0).
     */
    public Paquete(String codigoRastreo, double peso, double alto, double ancho, double largo, double valorDeclarado) {
        this.codigoRastreo = (codigoRastreo != null && !codigoRastreo.equals("")) 
                             ? codigoRastreo : "SIN-CODIGO";
        this.peso = (peso > 0.0) ? peso : 1.0;
        this.alto = (alto > 0.0) ? alto : 10.0;
        this.ancho = (ancho > 0.0) ? ancho : 10.0;
        this.largo = (largo > 0.0) ? largo : 10.0;
        this.valorDeclarado = (valorDeclarado >= 0.0) ? valorDeclarado : 0.0;
        this.envioExpress = false;
    }

    /**
     * Constructor con todos los parametros.
     * 
     * @param codigoRastreo Codigo unico de rastreo.
     * @param peso Peso fisico en kilogramos (debe ser mayor a 0).
     * @param alto Altura en centimetros (debe ser mayor a 0).
     * @param ancho Anchura en centimetros (debe ser mayor a 0).
     * @param largo Longitud en centimetros (debe ser mayor a 0).
     * @param valorDeclarado Valor monetario declarado (mayor o igual a 0).
     * @param envioExpress true si requiere envio prioritario express; false en envio normal.
     */
    public Paquete(String codigoRastreo, double peso, double alto, double ancho, double largo, 
                   double valorDeclarado, boolean envioExpress) {
        this.codigoRastreo = (codigoRastreo != null && !codigoRastreo.equals("")) 
                             ? codigoRastreo : "SIN-CODIGO";
        this.peso = (peso > 0.0) ? peso : 1.0;
        this.alto = (alto > 0.0) ? alto : 10.0;
        this.ancho = (ancho > 0.0) ? ancho : 10.0;
        this.largo = (largo > 0.0) ? largo : 10.0;
        this.valorDeclarado = (valorDeclarado >= 0.0) ? valorDeclarado : 0.0;
        this.envioExpress = envioExpress;
    }

    // ##### Getters y Setters #####

    /** @return El codigo de rastreo del paquete. */
    public String getCodigoRastreo() { 
        return codigoRastreo; 
    }

    /** @param codigoRastreo El nuevo codigo alfanumerico de rastreo. */
    public void setCodigoRastreo(String codigoRastreo) {
        if (codigoRastreo != null && !codigoRastreo.equals("")) {
            this.codigoRastreo = codigoRastreo;
        }
    }

    /** @return El peso fisico en kilogramos. */
    public double getPeso() { return peso; }

    /** @param peso El nuevo peso fisico (debe ser mayor a cero). */
    public void setPeso(double peso) {
        if (peso > 0.0) {
            this.peso = peso;
        }
    }

    /** @return La altura en centimetros. */
    public double getAlto() { 
        return alto; 
    }

    /** @param alto La nueva altura en centimetros (debe ser mayor a cero). */
    public void setAlto(double alto) {
        if (alto > 0.0) {
            this.alto = alto;
        } else {
            System.out.println("Error: La altura debe ser mayor a cero.");
        }
    }

    /** @return La anchura en centimetros. */
    public double getAncho() { 
        return ancho; 
    }

    /** @param ancho La nueva anchura en centimetros (debe ser mayor a cero). */
    public void setAncho(double ancho) {
        if (ancho > 0.0) {
            this.ancho = ancho;
        } else {
            System.out.println("Error: La anchura debe ser mayor a cero.");
        }
    }

    /** @return La longitud en centimetros. */
    public double getLargo() { 
        return largo; 
    }

    /** @param largo La nueva longitud en centimetros (debe ser mayor a cero). */
    public void setLargo(double largo) {
        if (largo > 0.0) {
            this.largo = largo;
        } else {
            System.out.println("Error: La longitud debe ser mayor a cero.");
        }
    }

    /** @return El valor monetario declarado en pesos (MXN). */
    public double getValorDeclarado() { 
        return valorDeclarado; 
    }

    /** @param valorDeclarado El nuevo valor declarado (no puede ser negativo). */
    public void setValorDeclarado(double valorDeclarado) {
        if (valorDeclarado >= 0.0) {
            this.valorDeclarado = valorDeclarado;
        } else {
            System.out.println("Error: El valor declarado no puede ser negativo.");
        }
    }

    /** @return true si tiene modalidad express activa; false en caso contrario. */
    public boolean isEnvioExpress() { 
        return envioExpress; 
    }

    /** @param envioExpress Modalidad de envio express a asignar. */
    public void setEnvioExpress(boolean envioExpress) {
        this.envioExpress = envioExpress;
    }


    // ##### Métodos calculadores #####

    /**
     * Calcula el peso volumetrico equivalente de acuerdo al factor de conversion IATA:
     * (largo * ancho * alto) / 5000.
     * 
     * @return El peso volumetrico en kilogramos.
     */
    public double calculaPesoVolumetrico() {
        return (this.largo * this.ancho * this.alto) / 5000.0;
    }

    /**
     * Determina el peso cobrable final de la orden postal, que corresponde
     * al valor maximo entre el peso fisico real y el peso volumetrico calculado.
     * 
     * @return El mayor entre el peso real y el volumetrico.
     */
    public double obtenerPesoCobrable() {
        double pesoVolumetrico = calculaPesoVolumetrico();
        return (this.peso >= pesoVolumetrico) ? this.peso : pesoVolumetrico;
    }

    /**
     * Propuesta personal: calcula el recargo por envio express, equivalente
     * al 30% de la tarifa base que calcula CotizadorEnvio.
     *
     * @return El recargo en pesos, o 0.0 si el envio no es express
     *         o si el paquete no es valido.
     */
    public double calculaRecargoExpress() {
        double tarifaBase = CotizadorEnvio.cotizarEnvio(this);
        if (!this.envioExpress || tarifaBase < 0) {
            return 0.0;
        }
        return tarifaBase * PORCENTAJE_EXPRESS / 100.0;
    }
}