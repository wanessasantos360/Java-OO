public class RetornosEmJava {
        public static void main(String[] args) {
            System.out.println(area(2));
            System.out.println(area(2,3));
            System.out.println(area(2,4,5));
        }

        public static double area (double lado){
            return lado*lado;
        }

        public static double area (double lado, double altura){
            return lado * altura;
        }

        public static double area(double bMaior, double bMenor, double altura) {
            return ((bMenor+bMaior)*altura)/2;
        }


}
