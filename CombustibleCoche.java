import java.util.Scanner;

public class CombustibleCoche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustible = 100;

        System.out.print("Viajes realizados: ");
        int viajes = sc.nextInt();

        System.out.print("Repostajes hechos: ");
        int repostajes = sc.nextInt();

        combustible = combustible - (viajes * 8) + (repostajes * 15);

        System.out.println("Combustible final: " + combustible);

        sc.close();
    }
}
