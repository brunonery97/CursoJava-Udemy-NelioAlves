package entities;

public class Conta {

    private Integer numConta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numConta, String titular, Double saldo, Double limiteSaque) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
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

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        validarSaque(valor);
        saldo -= valor;
    }

    private void validarSaque( double valor){
        if (valor > getLimiteSaque()){
            throw new RuntimeException("Erro de saque: A quantia excede o limite de saque.");
        } if (valor > getSaldo()){
            throw new RuntimeException("Saldo insuficiente.");
        }
    }

}


