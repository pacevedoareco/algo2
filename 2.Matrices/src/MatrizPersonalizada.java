import java.util.InputMismatchException;
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
                boolean inputValido = false;
                // bucle hasta que el valor sea correcto
                do {
                    try {
                        System.out.print("Ingrese valor para posición [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                        if(matriz[i][j] < 1)
                            throw new Exception("ValorIncorrecto");
                        inputValido = true;
                    } catch (InputMismatchException e) {
                        System.out.println("El valor tiene que ser un entero positivo. Vuelva a intentarlo.");
                        scanner.next(); // "limpio" el cache del scanner.
                    } catch (Exception e){
                        System.out.println("El valor tiene que ser un entero positivo. Vuelva a intentarlo.");
                    }
                } while (!inputValido);
            }
        }
    }

    public static int[][] getMatriz() {
        return matriz;
    }
}