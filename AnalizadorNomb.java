import java.util.Scanner;

public class AnalizadorNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre completo: ");
        String nombre = sc.nextLine();
        System.out.println("Primera 'a': " + nombre.indexOf('a'));
        System.out.println("Última 'a': " + nombre.lastIndexOf('a'));
        System.out.println("¿Contiene 'Ana'? " + nombre.contains("Ana"));
    }
}
