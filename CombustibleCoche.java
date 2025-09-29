import java.util.Scanner;

public class CombustibleCoche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustible = 100;
        System.out.print("Viajes realizados: ");
        int viajes = sc.nextInt();
        System.out.print("Repostajes hechos: ");
        int repostajes = sc.nextInt();
        combustible -= viajes * 8;
        combustible += repostajes * 15;
        System.out.println("Combustible final: " + combustible);
    }
}

