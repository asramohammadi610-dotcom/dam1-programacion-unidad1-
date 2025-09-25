import java.util.Scanner;

public class VerificadorReportes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo: ");
        String archivo = sc.nextLine();

        System.out.println("¿Empieza con 'data_'? " + archivo.startsWith("data_"));
        System.out.println("¿Termina con '.csv'? " + archivo.endsWith(".csv"));

        sc.close();
    }
}
