package entities;

public class Conta {

    private String titular;
    private int numConta;
    private double saldo;

    public Conta(String titular, int numConta, double depositoInicial) {
        this.titular = titular;
        this.numConta = numConta;
        deposito(depositoInicial);
    }

    public Conta(String titular, int numConta) {
        this.titular = titular;
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= (valor + 5.0);
    }

    public String toString(){
        return " Conta " + getNumConta() + ", Titular: " + getTitular() + ", Saldo: R$ " + getSaldo();
    }

}
