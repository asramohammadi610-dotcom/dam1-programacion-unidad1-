import java.util.Scanner;

public class CombustibleCoche {
    public static void main(String[] args) {

        final int REPOSTAJE_GASOLINA = 15;
        final int VIAJE_GASOLINA = 8;

        Scanner sc = new Scanner(System.in);
        int combustible = 100;

        System.out.print("Viajes realizados: ");
        int viajes = sc.nextInt();

        System.out.print("Repostajes hechos: ");
        int repostajes = sc.nextInt();

        combustible += (repostajes * REPOSTAJE_GASOLINA) - (viajes * VIAJE_GASOLINA);

        combustible = Math.max(0, Math.min(100, combustible));

        System.out.println("Combustible final: " + combustible);

        sc.close();
    }
}
