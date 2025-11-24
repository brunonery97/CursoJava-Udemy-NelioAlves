package entities;

public class ContaEmpresa extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresa(){
        super();
    }

    public ContaEmpresa(Integer num, String titular, Double saldo, Double limiteEmprestimo) {
        super(num, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double valor) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo( double valor){
        if (valor <= limiteEmprestimo) {
            saldo += valor - 10.0;
        }
    }
}
