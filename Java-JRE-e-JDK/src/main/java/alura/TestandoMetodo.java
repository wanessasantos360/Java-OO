package alura;

public class TestandoMetodo {
    double saldo;
    int angencia;
    int numero;
    String titular;

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //Conta contaWanssa = new Conta();
        //contaWanssa.saldo = 100;
        //contaWanssa.depo
    }
}
