import java.util.Scanner;

public class CalculadoraPropinasAvanzadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el total de la cuenta: ");
        double cuenta = sc.nextDouble();

        System.out.printf("Propina 7%%: %.2f%n", cuenta * 0.07);
        System.out.printf("Propina 12%%: %.2f%n", cuenta * 0.12);
        System.out.printf("Propina 18%%: %.2f%n", cuenta * 0.18);

        sc.close();
    }
}
