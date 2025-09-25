
import java.util.Scanner;

public class InventarioVideojuegosRetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int consolas = 75;

        System.out.print("Consolas recibidas: ");
        int recibidas = sc.nextInt();
        consolas += recibidas;

        System.out.print("Consolas vendidas: ");
        int vendidas = sc.nextInt();
        consolas -= vendidas;

        System.out.printf("Inventario final: %d consolas%n", consolas);

        sc.close();
    }
}
