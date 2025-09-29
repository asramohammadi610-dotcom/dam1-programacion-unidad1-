import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la temperatura en Celsius: ");
        double celsius = Double.parseDouble(sc.nextLine());
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Temperatura en Celsius: %.2f\n", celsius);
        System.out.printf("Temperatura en Fahrenheit: %.2f\n", fahrenheit);
    }
}
