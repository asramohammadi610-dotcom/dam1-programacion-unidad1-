import java.util.Scanner;

public class AnalizadorNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nombre completo: ");
        String nombre = sc.nextLine();

        int primera = nombre.indexOf('a');
        int ultima = nombre.lastIndexOf('a');
        boolean contieneAna = nombre.contains("Ana");

        System.out.println("Primera 'a': " + primera);
        System.out.println("Última 'a': " + ultima);
        System.out.println("¿Contiene 'Ana'? " + contieneAna);

        sc.close();
    }
}
