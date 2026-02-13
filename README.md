# Guía Práctica de Arreglos y ArrayList en Java
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


## Aclaración:

Texto agregado en el .md para agregar estetica y mas información, estan subidos los archivos de la manera pedida junto con el codigo comentado dentro de su respectiva carpeta.



