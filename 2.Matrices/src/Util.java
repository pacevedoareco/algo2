import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    // Invierte el contenido de cada fila de la matriz dada
    public static void invertirContenidoPorFilas(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            int i = 0;
            int j = matriz[fila].length - 1;
            while (i < j) {
                int aux = matriz[fila][i];
                matriz[fila][i] = matriz[fila][j];
                matriz[fila][j] = aux;
                i++;
                j--;
            }
        }
    }

    // Precarga una matriz con enteros positivos
    public static void precargarMatriz(int[][] matriz) {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1 + random.nextInt(99);
            }
        }
    }

    // Pide el nro de filas y columnas y retorna un array de 2 posiciones con esos valores
    public static int[] pedirTamanioMatriz(){
        Scanner scanner = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        boolean inputValido = false;
        // bucle hasta que el valor sea correcto
        do {
            try {
                System.out.print("Ingrese cantidad de filas: ");
                filas = scanner.nextInt();
                System.out.print("Ingrese cantidad de columnas: ");
                columnas = scanner.nextInt();
                if(filas < 1 || columnas < 1)
                    throw new Exception();
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("El valor tiene que ser un entero positivo. Vuelva a intentarlo.");
                scanner.next(); // "limpio" el cache del scanner.
            } catch (Exception e){
                System.out.println("El valor tiene que ser un entero positivo. Vuelva a intentarlo.");
            }
        } while (!inputValido);
        return new int[]{filas, columnas};
    }

    // Imprime matrices en consola
    public static void imprimirMatriz(int[][] m) {
        for (int[] filas : m) {
            for (int celda : filas) {
                System.out.printf("%4d", celda);
            }
            System.out.println();
        }
    }
}
