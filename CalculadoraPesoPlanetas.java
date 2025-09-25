import java.util.Scanner;

public class CalculadoraPesoPlanetas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso en la Tierra
        System.out.print("Introduce tu peso en la Tierra (kg): ");
        double pesoTierra = scanner.nextDouble();

        // Calcular el peso en otros cuerpos celestes
        double pesoMarte = pesoTierra * 0.38;
        double pesoJupiter = pesoTierra * 2.52;
        double pesoLuna = pesoTierra * 0.165;

        // Mostrar los resultados
        System.out.printf("Peso en Marte: %.2f kg%n", pesoMarte);
        System.out.printf("Peso en Júpiter: %.2f kg%n", pesoJupiter);
        System.out.printf("Peso en la Luna: %.2f kg%n", pesoLuna);

        scanner.close();
    }
}