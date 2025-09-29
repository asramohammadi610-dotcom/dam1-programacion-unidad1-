import java.util.Scanner;

public class CalculoJubilacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad actual: ");
        int edadActual = sc.nextInt();
        System.out.print("Introduce la edad de jubilación: ");
        int edadJubilacion = sc.nextInt();
        int faltan = edadJubilacion - edadActual;
        System.out.println("Faltan " + faltan + " años para tu jubilación.");
    }
}
