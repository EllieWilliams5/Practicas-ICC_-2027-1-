# Práctica 5 --- Decisiones y repeticiones

Este proyecto contiene tres programas:

- **EstimacionPi**: Aproxima el valor de pi con el método Monte Carlo lanzando
  un número fijo de dardos (Actividad 1.1).
- **PrecisionPi**: Lanza dardos hasta que la estimación de pi queda dentro de
  una tolerancia (Actividad 1.2).
- **CotizadorPines**: Valida los datos del préstamo, ajusta la tasa según el
  tipo de cliente y calcula el interés simple y el compuesto (Parte 2 completa).

## Estructura

```
Practica05/
|-- Readme.md (este documento)
|-- src/    código fuente (.java)
|-- bin/    archivos compilados (.class)
|-- docs/   reporte en pdf
```

## Cómo compilar y ejecutar

Desde la carpeta `Practica05`:

```
javac -d bin src/*.java
```
Para compilar todos los archivos en `src/` y guardar el resultado en `bin/`

```
java -cp bin EstimacionPi
java -cp bin PrecisionPi
java -cp bin CotizadorPines
```
Para ejecutar un *bytecode* de la clase elegida.

## Algunos valores para que verifican que el programa esta bien ;)

| Tasa aplicada | 15 % | 
| Interés simple | $3385.99 |
| Total con interés simple | $16284.99 |
| Interés compuesto | $3844.71 |
| Total con interés compuesto | $16743.71 |
