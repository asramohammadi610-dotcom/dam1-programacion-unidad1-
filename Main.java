import java.util.Scanner;

public class CinemaTicketSales {
 /*
  * Introduce tu peso en la tierra (kg): 70
  * peso en Marte: 26.60 kg
  * peso en jupiter:176.40 kg
  */
  Run|Debug
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu peso en la Tierra (kg): ");
        double pesoTierra = input.nextDouble();

        final double PRICE_STANDARD = pesoTierra * 38/100;
        final double PRICE_CHILD = pesoTierra * 252/100;
        final double PESO_LUNA = pesoTierra * 16.5/100;

       System.out.printf("Peso en Marte: %.2f kg%n", PRICE_STANDARD);
       System.out.printf("Peso en Júpiter: %.2f kg%n", PRICE_CHILD);
       System.out.printf("Peso en la Luna: %.2f kg%n", PESO_LUNA);