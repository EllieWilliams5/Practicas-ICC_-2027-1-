# Práctica 6 · Entrada de datos y cierre de la Cabaña del Misterio

Tres programas que leen datos del usuario con `Scanner` y los validan antes de usarlos.

- **PiInteractivo**: estima π con el método Monte Carlo. El usuario elige cuántos
  dardos lanzar; el programa vuelve a pedir el dato mientras no sea un entero positivo.
- **BinarioInteractivo**: convierte a binario un entero no negativo que elige el
  usuario, con divisiones sucesivas entre 2. Pregunta si se quiere convertir otro.
- **CabanaDelMisterio**: registra a un cliente del señor Pines y ofrece un menú para
  cotizar con interés simple y compuesto, compararlos y cambiar el capital. Termina con
  la opción 0, al llegar a 5 operaciones o al cometer 3 errores en el menú.

## Cómo compilar y ejecutar

Desde la carpeta `Practica06`:

```
javac -d bin src/*.java
java -cp bin PiInteractivo
java -cp bin BinarioInteractivo
java -cp bin CabanaDelMisterio
```

## Ejemplos de ejecución

**PiInteractivo**
```
Cuantos dardos quieres lanzar? hola
> "hola" no es un numero entero valido (o es demasiado grande).
Cuantos dardos quieres lanzar? -20
> La cantidad de dardos debe ser mayor que 0.
Cuantos dardos quieres lanzar? 100000
Dardos lanzados: 100000
Dardos dentro del circulo: 78463
Estimacion de pi: 3.138520
```

**BinarioInteractivo**
```
Escribe un numero entero no negativo: 26
El numero 26 en binario es: 11010
Quieres convertir otro numero? (s/n): s
Escribe un numero entero no negativo: 0
El numero 0 en binario es: 0
Quieres convertir otro numero? (s/n): n
Hasta luego!
```

**CabanaDelMisterio** (opción 3 con los datos de Robbie)
```
> Por favor, elige una opcion: 3

### Opcion 3 : Comparacion de intereses ###
> Interes simple = 3385.99
> Interes compuesto = 3844.71
> La diferencia entre ellos es de 458.72
> El interes compuesto es mayor.
```

## Estructura

```
Practica06/
├── Readme.md
├── src/          código fuente
├── bin/          archivos .class
└── docs/
    └── images/   capturas de pantalla
```
