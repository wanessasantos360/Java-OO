import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 9.0/5.0 + 32;
        System.out.println("O equivalente de " + celsius + " C é " + fahrenheit + " F.");
    }
}
