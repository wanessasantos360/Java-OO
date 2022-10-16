public class Fatorial {
    public static void main(String[] args) {

        //Para calcular o fatorial, só precisa modificar a variável numberFactorial
        int numberFactorial = 5;

        System.out.println("O resultado do fatorial de "
                +numberFactorial+ ": "
                + metodoDoFatorial(numberFactorial));

    }
    public static int metodoDoFatorial(int n) {
        int resultado = 1; // Para assegurar que o fatorial de 0 resulte 1

        for(int i = 1; i<=n; i++) resultado *=i; // Valor acumulado na variável rasultado
        return resultado;
    }
}
