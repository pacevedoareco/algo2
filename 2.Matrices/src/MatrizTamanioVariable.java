public class MatrizTamanioVariable {
    private static int[][] matriz;

    public static void inicializarMatriz() {
        int[] tamanio = Util.pedirTamanioMatriz();
        matriz = new int[tamanio[0]][tamanio[1]];
    }

    public static int[][] getMatriz() {
        return matriz;
    }
}
