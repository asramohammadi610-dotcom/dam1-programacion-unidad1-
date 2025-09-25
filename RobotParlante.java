
import java.util.Scanner;

public class RobotParlante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar una palabra al usuario
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        // Mostrar los resultados
        System.out.println("Primera letra: " + palabra.charAt(0));
        System.out.println("Última letra: " + palabra.charAt(palabra.length() - 1));
        System.out.println("Primeros 3 caracteres: " + palabra.substring(0, Math.min(3, palabra.length())));
        System.out.println("Últimos 3 caracteres: " + palabra.substring(Math.max(0, palabra.length() - 3)));
        System.out.println("Mayúsculas: " + palabra.toUpperCase());

        scanner.close();
    }
}
