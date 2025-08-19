import java.util.Scanner;

// Calcula la fz de atracción entre 2 masas a x metros.
public class CalculadoraGravedad {
    public static void main(String[] args) {
        final double G = 6.67e-11;  // Constante de gravitación universal

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la masa M1 en kilogramos: ");
        double m1 = scanner.nextDouble();

        System.out.print("Ingrese la masa M2 en kilogramos: ");
        double m2 = scanner.nextDouble();

        System.out.print("Ingrese la distancia entre M1 y M2 en metros: ");
        double r = scanner.nextDouble();

        double fuerza = G * (m1 * m2) / (r * r);

        System.out.println("La fuerza de atracción gravitacional es: " + fuerza + " N");

        scanner.close();
    }
}
