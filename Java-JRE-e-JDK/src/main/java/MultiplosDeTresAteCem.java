public class MultiplosDeTresAteCem {
    public static void main(String[] args) {
        /* Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
        * Dica: Existem duas maneiras tradicionais de resolver este problema. Uma delas consiste em
        * fazer o for, e utilizar numero % 3 para descobrir o resto da divisão de um número por 3
        * (o operador % se chama de módulo). Se o resto for zero, ele é divisível por 3.
        */
        for (int i = 1; i<=100; i++){
            if(i%3 == 0) System.out.println(i + " é divisível por 3.");
        }

    }
}
