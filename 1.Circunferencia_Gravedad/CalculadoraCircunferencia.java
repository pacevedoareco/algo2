import java.util.Scanner;

// Pide el radio de una circunferencia y calcula longitud y área
public class CalculadoraCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double longitud = 2 * Math.PI * radio; // 2 pi radio
        double area = Math.PI * radio * radio; // pi * r cuadrado

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área de la circunferencia: " + area);

        scanner.close();
    }
}
