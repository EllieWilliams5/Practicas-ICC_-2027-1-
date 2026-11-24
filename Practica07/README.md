# Práctica 7: Introducción a la Programación Orientada a Objetos
**Introducción a las Ciencias de la Computación (Semestre 2027-1)**
**Facultad de Ciencias, UNAM**

---

## Datos del alumno

> **Nota de privacidad:** si publicas tu proyecto en un repositorio público de GitHub, no es necesario incluir esta sección; basta con que tus datos estén en la entrega de Google Classroom.

- **Nombre completo:** Manolin
- **Número de cuenta:** 123456789
- **Correo institucional:** victor_mendiola@ciencias.unam.mx

---

## Descripción de la práctica

Sistema de cotización para una empresa de entrega de paquetes, modelado con Programación Orientada a Objetos:

- **`Paquete`**: modela cada paquete del almacén (código de rastreo, peso, alto, ancho, largo, valor declarado y modalidad express). Calcula su peso volumétrico (`largo × ancho × alto / 5000`) y su peso cobrable (el mayor entre el peso real y el volumétrico).
- **`CotizadorEnvio`**: clase de utilería con métodos `static` que valida un paquete (incluido el caso `null`), cotiza el envío con una tarifa escalonada por peso cobrable y determina si el envío requiere seguro.
- **`PruebaPaqueteria`**: programa de pruebas con los casos `p1` a `p4`, una referencia `null`, el constructor por omisión, datos inválidos y la propuesta personal.

**Propuesta personal:** recargo por envío express. Si el cliente solicita entrega urgente (`envioExpress = true`), el método `calculaRecargoExpress()` de `Paquete` calcula un recargo del 30 % sobre la tarifa base de `CotizadorEnvio`.

---

## Estructura

```text
practica07/
├── README.md
├── src/   Paquete.java, CotizadorEnvio.java, PruebaPaqueteria.java
├── bin/   archivos .class (generados con javac)
└── doc/   documentación HTML (generada con javadoc)
```

---

## Comandos para compilar, ejecutar y documentar

Ejecuta los siguientes comandos desde la raíz de la carpeta de la práctica:

### 1. Compilación
```bash
javac -d bin src/*.java
```

### 2. Ejecución de las pruebas
```bash
java -cp bin PruebaPaqueteria
```

### 3. Generación de documentación Javadoc
```bash
javadoc -d doc -author -encoding UTF-8 src/*.java
```

---

## Evidencia de ejecución

```text
=== Caso 1 ===
Codigo: MX123A, express: false
Volumetrico: 0.6 kg, cobrable: 2.0 kg
Cotizacion: $120.0, seguro? false
=== Caso 2 ===
Codigo: MX456B, express: false
Volumetrico: 16.0 kg, cobrable: 16.0 kg
Cotizacion: $325.0, seguro? false
=== Caso 3 ===
Codigo: MX789C, express: false
Volumetrico: 5.4 kg, cobrable: 12.0 kg
Cotizacion: $246.0, seguro? true
=== Caso 4 ===
Codigo: MX000D, express: true
Volumetrico: 5.6 kg, cobrable: 8.0 kg
Cotizacion: $174.0, seguro? true
=== null ===
Valido? false
Cotizacion: -1.0
Seguro? false
=== Constructor por omision ===
Codigo: ND-000, express: false
Volumetrico: 0.2 kg, cobrable: 1.0 kg
Cotizacion: $120.0, seguro? false
=== Datos invalidos ===
Codigo: SIN-CODIGO, express: false
Volumetrico: 0.4 kg, cobrable: 1.0 kg
Cotizacion: $120.0, seguro? false
=== Propuesta: recargo express ===
Normal: recargo $0.0
Express: recargo $52.2, total $226.2
```
