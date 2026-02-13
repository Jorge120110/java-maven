package maven_project;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class PrimerPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n");
		saludo();
		System.out.println("\n");
		multiplicacion();
		
		ejemplosDeclaracion();
        ejemplosUtilidades();
        ejemplosRecorridos();
        diferenciaArrayList();
	}
	
	//----------------- Funciones del ejercicio inicial ------------------
	
	public static void saludo() {
		System.out.println("Hola mundo desde Java");
	}
	
	public static void multiplicacion() {
		int a = 10;
		int b = 5;
		
		System.out.println("El resultado de la suma es:"+ (a*b));
	}
			
	//----------------- Funciones Ejemplos de Arreglos ------------------
	
	//---------- 1) Formas de declarar un arreglo en Java ---------
	public static void ejemplosDeclaracion() {
        System.out.println("--- 1. DECLARACIÓN DE ARREGLOS ---");
        
        // Declaración especificando tamaño
        int[] numeros = new int[10];

        // Declaración inicializando con ítems definidos
        String[] amigos = {"juan", "pablo", "jose"};
        
        System.out.println("Arreglos declarados correctamente.\n");
    }
	
	//---------- 2) Métodos y utilidades principales para arreglos ---------
    public static void ejemplosUtilidades() {
        System.out.println("--- 2. MÉTODOS Y UTILIDADES ---");

        // asList
        String[] juegos = {"CS2", "Minecraft", "Valorant"};
        List<String> listaJuegos = Arrays.asList(juegos);
        System.out.println("asList: " + listaJuegos);

        // sort
        int[] desordenados = {50, 10, 100, 5, 25, 60, 1, 9, 14, 2};
        Arrays.sort(desordenados);
        System.out.println("sort: " + Arrays.toString(desordenados));

        // fill
        int[] notasRelleno = new int[5];
        Arrays.fill(notasRelleno, 100);
        System.out.println("fill (100): " + Arrays.toString(notasRelleno));

        // copyOf
        int[] edades = {12, 15, 14};
        int[] copia = Arrays.copyOf(edades, 5);
        System.out.println("copyOf (tamaño 5): " + Arrays.toString(copia) + "\n");
    }
	
    //---------- 3) ¿Cómo se recorren los arreglos en Java? ---------
    
    public static void ejemplosRecorridos() {
        System.out.println("--- 3. RECORRIDO DE ARREGLOS ---");

        int[] punteos = {65, 80, 95};

        // For común
        for (int i = 0; i < punteos.length; i++) {
            System.out.println("For Común - Índice " + i + ": " + punteos[i]);
        }

        // For-each
        String[] cpus = {"i5-1235U", "i9-12900"}; 
        for (String cpu : cpus) {
            System.out.println("For-each - CPU: " + cpu);
        }

        // Streams
        System.out.print("Streams: ");
        Arrays.stream(punteos).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");
    }
    
    //---------- 4) Diferencias entre arreglos y ArrayList en Java ---------
    public static void diferenciaArrayList() {
        System.out.println("--- 4. EJEMPLO DE ARRAYLIST ---");
        
        ArrayList<Integer> listaDinamica = new ArrayList<>();
        listaDinamica.add(10); 
        listaDinamica.add(20);
        
        System.out.println("ArrayList (dinámico): " + listaDinamica);
        System.out.println("Tamaño actual: " + listaDinamica.size());
    }
    
}
