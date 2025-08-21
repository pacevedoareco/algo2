import java.util.Scanner;

public class MatrizPersonalizada {
    private static int[][] matriz;

    public static void inicializarMatriz() {
        int[] tamanio = Util.pedirTamanioMatriz();
        matriz = new int[tamanio[0]][tamanio[1]];
    }
    
    public static void cargarMatriz(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese valor para posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] getMatriz() {
        return matriz;
    }
}