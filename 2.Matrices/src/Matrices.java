public class Matrices {

    public static void main(String[] args) {

        // Ejercicio 1: Precargar matriz de 5*10 e invertir orden por fila.
        Util.precargarMatriz(MatrizTamanioFijo.getMatriz());
        System.out.println("Matriz de tamaño fijo original:");
        Util.imprimirMatriz(MatrizTamanioFijo.getMatriz());
        Util.invertirContenidoPorFilas(MatrizTamanioFijo.getMatriz());
        System.out.println("\nMatriz de tamaño fijo con cada fila invertida:");
        Util.imprimirMatriz(MatrizTamanioFijo.getMatriz());

        System.out.println("\n/-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\\ \n");

        // Ejercicio 2: Igual que 1 pero pedir al usuario el tamaño de la matriz
        MatrizTamanioVariable.inicializarMatriz();
        Util.precargarMatriz(MatrizTamanioVariable.getMatriz());
        System.out.println("Matriz de tamaño variable original:");
        Util.imprimirMatriz(MatrizTamanioVariable.getMatriz());
        Util.invertirContenidoPorFilas(MatrizTamanioVariable.getMatriz());
        System.out.println("\nMatriz de tamaño variable con cada fila invertida:");
        Util.imprimirMatriz(MatrizTamanioVariable.getMatriz());

        System.out.println("\n/-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\\ \n");

        // Ejercicio 3: Igual que 2 pero pedir los números de la matriz.
        MatrizPersonalizada.inicializarMatriz();
        MatrizPersonalizada.cargarMatriz();
        System.out.println("Matriz personalizada original:");
        Util.imprimirMatriz(MatrizPersonalizada.getMatriz());
        Util.invertirContenidoPorFilas(MatrizPersonalizada.getMatriz());
        System.out.println("\nMatriz personalizada con cada fila invertida:");
        Util.imprimirMatriz(MatrizPersonalizada.getMatriz());

    }
}