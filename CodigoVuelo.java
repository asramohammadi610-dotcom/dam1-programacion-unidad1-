import java.util.Scanner;

public class CodigoVuelo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce ciudad de origen: ");
        String origen = sc.nextLine();

        System.out.print("Introduce ciudad de destino: ");
        String destino = sc.nextLine();

        System.out.print("Introduce año del vuelo: ");
        int anio = sc.nextInt();

        String codigo = origen.substring(0, 2) + destino.substring(0, 2) + anio;

        System.out.println("Código de vuelo: " + codigo);

        sc.close();
    }
}
