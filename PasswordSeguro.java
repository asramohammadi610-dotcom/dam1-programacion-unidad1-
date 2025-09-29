import java.util.Scanner;

public class PasswordSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        String password = palabra.replace("a", "4")
                .replace("e", "3")
                .replace("i", "1")
                .replace("o", "0")
                .replace("u", "_")
                .replace("A", "4")
                .replace("E", "3")
                .replace("I", "1")
                .replace("O", "0")
                .replace("U", "_");

        System.out.println("Password seguro: " + password);

        sc.close();
    }
}
