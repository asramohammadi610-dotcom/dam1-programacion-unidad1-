
import java.util.Scanner;

public class  PasswordSeguro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();
        String password = palabra.replace("a", "4")
        System password = palabra.replace("e", "3")
        System password = palabra.replace("i", "1")
        System password = palabra.replace("o", "0")
        System password = palabra.replace("u", "_");
        System.out.println("Password seguro: " + password);
    }
}
