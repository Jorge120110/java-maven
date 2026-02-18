# Guía Práctica de Arreglos y ArrayList en Java}
## 1. Como se declara un arreglo en java:
En Java, los arreglos son estructuras permiten almacenar varios datos bajo un mismo nombre, para declararlo se coloca el tipo de dato que almacena seguido de corchetes [], se puede agregar un tamaño especifico para la estructura usando la palabra "new" mas corchetes y el tamaño de la misma o añadiendo directamente sus ítems agregando llaves {} junto con los datos dentro.

Ejemplos:

```java
	1)	int[] numeros = new int[10];

	2)	String[] amigos = {"juan", "pablo", "jose"};
```

## 2. Metodos y Utilidades pirncipales para Arreglos

Los metodos y utilidades para los arreglos permiten hacer acciones como buscar, ordenar o rellenar dentro de los datos de los arreglos de manera mas facil sin tener que hacer codigos mas complejos.

Ejemplos:

### 1) Arrays.asList(array)
Sirve para convertir un arreglo en una lista.

```java
String[] juegos = {"CS2", "Minecraft", "Valorant"};
	List<String> listaJuegos = Arrays.asList(juegos);

System.out.println("Lista completa: " + listaJuegos);
```

### 2) Arrays.sort
Es un metodo que sirve para ordenar los datos dentro de arreglos.

```java	
int[] numeros = {50, 10, 100, 5, 25, 60, 1, 9, 14, 2};
Arrays.sort(numeros);
```

System.out.println(Arrays.toString(numeros));

### 3) Arrays.fill(array, valor)
Asigna un valor especifico a cada valor del arreglo.

```java
int[] notas = new int[10];
	Arrays.fill(notas, 0);
```

### 4) Arrays.copyOf(original, newLength)
Copia un arreglo y crea un nuevo copiando sus elementos, en caso de ser mas grande rellena los elementos con 0 y si es mas pequeño, elimina los elementos sobrantes.

```java
int[] edades = {12, 15, 14, 11, 16};
	
int[] CopiaMasEdades = Arrays.copyOf(edades, 10);
int[] copiaMenosEdades = Arrays.copyOf(edades, 2);
```

### 5) Arrays.toString(array)
Convierte un arreglo en una cadena de texto con formato para leer.

```java
int[] calificaciones = {56, 78, 61, 98, 89};
	String StringResult = Arrays.toString(calificaciones);

System.out.println("El arreglo: " + StringResult);
```

## 3. Como se recorren los arreglos en Java

### 1) For común: 
Es la forma mas antigua de hacer bucles, normalmente se utiliza usando una variable como contador, inicialmente en 0 hasta lo que se necesite.

Ejemplo:

```java
int[] punteos = {65, 80, 95, 60, 72};

	for (int i = 0; i < punteos.length; i++){
		System.out.println("En el índice numero: " + i + "esta la nota: " + punteos[i]);
	}
```

### 2) For-each:
Utilizado para leer los arreglos en momentos donde no se necesita saber la posición exacta.

Ejemplo:

```java
String[] CPUs = {"i5-12900", "Ryzen9-9950x", "Ryzen5-5600g"};

	for (String CPU : CPUs){
System.out.println("Las CPU´s disponibles son: " + CPU);
	}
```

### 3) Streams:
Forma mas moderna y metodo muy potente para procesar grandes cantidades de datos de manera mas limpia usando forEach dentro de su estructura.

```java
int[] notas={22, 20, 85, 94, 57, 68, 89};
	
Arrays.stream(notas).forEach(n -> System.out.println("Nota: " + n));
```

## 4. Diferencias entre arreglos y ArrayList en Java

### Tamaño fijo vs tamaño dinámico

El Array tiene un tamaño estatico que definimos al inicio de su creación y que no puede cambiar.

El ArrayList tiene un tamaño variable (dinamico), no definimos su tamaño si no que agregamos o eliminamos sus elementos en función de nuestras necesidades.


### Tipos primitivos vs clases envolventes

El Array puede almacenar tipos primitivos (int, doublé, char) y objetos (String, usuario) dentro de si.

El ArrayList solo puede almacenar objetos, utilizando automáticamente clases envolventes como "Integer" para guardar números.


### Métodos disponibles (`add`, `remove`, `size`, etc.)

El Array es bastante limitado, utilizando solo "length" para saber su tamaño y los corchetes "[]" para acceder a ellos mediante su índice.

El ArrayList es mucho mas versátil, pudiendo utilizar varios métodos distitnos para realizar operaciones dentro de si (add(), remove(), get(), set(), etc).


### Rendimiento

El Array es mas rápido y eficiente al no poder modificar su contenido por tener un tamaño fijo.

El ArrayListe usa mas recursos, ya que, al llenarse o añadir nuevos ítems el sistema crea uno nuevo copiando su contenido mas lo ingresado.


### ¿Cuándo usar cada uno?

Es ideal usar el Array cuando ya sabemos el tamaño especifico que necesitaremos, necesitemos ser eficientes o lo llenaremos con grandes cantidades de datos primitivos.

Es ideal usar el ArrayList cuando no sabemos que tamaño tendrá o periódicamente necesitemos operar con su contenido.

# Ingenieria Inversa

Se hizo ingenieria inversa al archivo .jar proporcionado (introduction-0.0.1-SNAPSHOT.jar) del cual salieron:

Una carpeta "Array" con las clases:

	BubbbleSort.java
	MergeSortDemo.java
	QuickSort.java
	SumArray.java

Al inicio del programa usa la funcion "SumArray.java", que toma los elementos dentro del arreglo de tipo int y suma sus valores.

```java
 public class SumArray
 {
	 public int sum(int[] nums) {
     int total = 0;
     for (int n : nums) {
		total += n;
     	}
     return total;
	}
}
```

Tambien contiene una carpeta llamada "introduction" el cual tenia el App.java en el que esta definido el programa, en este se usan las funciones:
	
	MergeSortDemo 
Que toma el arreglo "int[] d2 = { 8, 3, 7, 4, 9, 2 };" y utiliza la tecnica "divide y venceras" hasta llegar a un unico ordenado.

	BubbleSort
Toma el arreglo "int[] arr = { 5, 1, 4, 2, 8 };" y lo ordena comparando los items con sus inmediatos.

	QuickSort
Ordena el arreglo "int[] arr1 = { 10, 7, 8, 9, 1, 5 };" dividiendo sus elementos, dejando de lado izquiedo los mas pequeños y de lado derecho los mas grandes.

# Pseudocodigo y algoritmo

Pseudocodigo:

```java
Algoritmo EncontrarSegundos
    Entrada: Arreglo de enteros 'nums'
    
    // Paso 1: Inicialización con valores extremos
    max1 <- -Infinito, max2 <- -Infinito
    min1 <- +Infinito, min2 <- +Infinito
    
    // Paso 2: Recorrido único del arreglo
    Para cada número 'n' en nums Hacer:
        
        // Lógica para los mayores
        Si n > max1 Entonces:
            max2 <- max1
            max1 <- n
        Sino Si n > max2 Y n != max1 Entonces:
            max2 <- n
        Fin Si
        
        // Lógica para los menores
        Si n < min1 Entonces:
            min2 <- min1
            min1 <- n
        Sino Si n < min2 Y n != min1 Entonces:
            min2 <- n
        Fin Si
        
    Fin Para
    
    // Paso 3: Retornar resultados
    Escribir "Segundo Mayor:", max2
    Escribir "Segundo Menor:", min2
```

## Explicacion:

El algoritmo evalua el arreglo con funciones if, recorre los valores y toma el primero como valor absoluto "max1" cuando encuentra un valor que supere a este, pasa a ser el mayor, el nuevo no se descarta si no que pasa a ser el "max2", cuando encuentra un numero que no es el mayor de todos, evalua si es mayor que el segundo numero, si lo es, pasa a ser el, el segundo. 

Para los numeros menores, utiliza la misma logica pero al contrario, evalua los numeros y compara si el nuevo numero encontrado es menor al actual, si lo es, pasa a ser el mas pequeño, si no lo es, se evalua contra el segundo, si es mas pequeño que ese, pasa a ser el segundo mas pequeño.

## Análisis de complejidad:

### Tiempo (Notación O)

En este algortimo la complejidad del tiempo es "O(n)" ya que, al ser un ciclo que recorre un arreglo una unica vez, su tiempo de ejecucion durara "O(n)" directamente proporcional a la cantidad de "n" elementos que tenga nuestro arreglo.

### Espacio (Notación O)

En el algoritmo, la complejidad del espacio es de "O(1)", porque, no importa la cantidad de elementos que contenga nuestro arreglo, el espacio en memoria que utilice siempre sera el mismo (el espacio utilizado por las 4 variables temporales para guardar los numeros maximos y minimos)

## Aclaración:

Texto agregado en el .md para agregar estetica y mas información, estan subidos los archivos de la manera pedida junto con el codigo comentado dentro de su respectiva carpeta.






