package entities;

public class Conta {

    private Integer num;
    private String titular;
    protected Double saldo;

    public Conta(){
    }

    public Conta(Integer num, String titular, Double saldo) {
        this.num = num;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNum() {
        return num;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque( double valorSaque){
        saldo -= valorSaque + 5.0;
    }

    public void deposito (double valorDeposito) {
        saldo += valorDeposito;
    }
}
