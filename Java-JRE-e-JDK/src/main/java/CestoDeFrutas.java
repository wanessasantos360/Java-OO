import java.util.Arrays;
import java.util.Scanner;

public class CestoDeFrutas {
    public static void main(String[] args) {
        String[] frutas = new String[5];
        System.out.println("Insira a sua lista de compras: 1");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            frutas[i] = input.nextLine();
            System.out.println("Insira a fruta: " + (i+2) + " : ");
        }
        System.out.println("As frutas no seu carrinho são:");
        System.out.println(Arrays.toString(frutas));
    }
}
