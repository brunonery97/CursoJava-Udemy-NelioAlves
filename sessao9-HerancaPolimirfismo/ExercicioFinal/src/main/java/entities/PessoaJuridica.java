package entities;

public class PessoaJuridica extends Pessoa{

    private Integer numeroFuncionario;

    public PessoaJuridica(){
     super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double imposto() {

        double valorImposto = 0;
        if ( numeroFuncionario > 10){
            valorImposto = getRendaAnual() * 0.14;
        } else {
            valorImposto = getRendaAnual() * 0.16;
        }
        return valorImposto;
    }
}
