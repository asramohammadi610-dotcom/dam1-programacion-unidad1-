import java.util.Scanner;

public class InventarioVideojuegosRetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inventario = 75;
        System.out.print("Consolas recibidas: ");
        int recibidas = sc.nextInt();
        System.out.print("Consolas vendidas: ");
        int vendidas = sc.nextInt();
        inventario += recibidas;
        inventario -= vendidas;
        System.out.printf("Inventario final: %d consolas\n", inventario);
    }
}
