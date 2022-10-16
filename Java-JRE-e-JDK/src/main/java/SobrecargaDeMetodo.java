public class SobrecargaDeMetodo {
    public static void main(String[] args) {
        area(2);
        area(2,3);
        area(2,4,5);
    }

    public static void area (double lado){
        System.out.println("Quadrado " + (lado*lado));
    }

    public static void area (double lado, double altura){
        System.out.println("Retângulo "+ (lado * altura));
    }

    public static void area(double bMaior, double bMenor, double altura) {
        System.out.println("Losango "+(((bMenor+bMaior)*altura)/2));
    }
}
