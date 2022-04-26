# TIPOS DE DATOS EN JAVA
## JAVA VIRTUAL MACHINE (JVM)

* Realiza una gestión eficiente de la memoria. 
* Distribuye la memoria en dis zonas: stack (pila) y heap (montón).

![RAM](/modelo/ram.jpeg "RAM")

### Stack
* Se almacenan: variables locales, llamadas a métodos (parametros y resultados), variables primitivas, referencias a objetos del heap.
* Memoria estática.

### Heap
* Gestionado por el garbage colector.
* Espacio de memoria en tiempo de ejecución donde se registran los objetos.
* Memoria dinámica.
* No posee estructura de asignación de espacios.

### Variable
* Contenedor de memoria donde se almacena información.
* En Java se declara con un tipo que se conservará durante todo su ciclo de vida en el interior de la app.
* La variable debe tener un nombre.
* Existen de tipo primitivo y referenciado.

## PRIMITIVOS
* Contenedores de tamaño especifico que almacenan valores y no tienen métodos.
* Ejemplos: boolean, char, byte, short, long , float, double.

## REFERENCIADOS
* Almacenan las referencias a los datos.
* Estos datos se escriben en una zona de memoria llamada heap.
* Accesible desde otras instancias de clase.
* Su ciclo de vida termina cuando no se necesita más.
* Mientras exista almenos una referencia activa en la zona de datos esta se mantendrá.
* Tan pronto como no haya más referencias, la zona se conidera no utilizada y se procede a su destrucción por parte del Garbage Collector.
* Un tipo referenciado puede no referenciar nada -> null.
* new: instanciación de una clse. Reserva una dirección de un área de memooria.

## Variable de referencia
* Caracteriza una instancia de clase, es decir la dirección de donde está el objeto.
* Contiene la dirección de un objeto, cuyo valor por defecto es null.
* Durante una prueba e igualdad entre dos variables por referencia, son las direcciones de los objetos que se compara y no el contenido de los objetos de si mismos.
* Cuando se usa una referencia como argumento de un metodo es la dirección del objeto lo que se pasa, y no el objeto en si mismo  