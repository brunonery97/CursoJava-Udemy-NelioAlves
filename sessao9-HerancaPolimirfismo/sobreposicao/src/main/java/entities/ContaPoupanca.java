package entities;

public class ContaPoupanca extends Conta {

    private Double taxaJuros;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer num, String titular, Double saldo, Double taxaJuros) {
        super(num, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo (){
        saldo += saldo * taxaJuros;
    }

    @Override
    public void saque( double valorSaque){
        saldo -= valorSaque;
    }
}
