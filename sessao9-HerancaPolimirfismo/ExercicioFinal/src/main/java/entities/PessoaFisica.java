package entities;

public class PessoaFisica extends Pessoa {

    private Double gastosComSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double imposto() {

        double valorImposto = 0;
        if (getRendaAnual() < 20000.00 ){
            valorImposto = getRendaAnual() * 0.15;
        } else {
            valorImposto = getRendaAnual() * 0.25;
        }

        valorImposto -= getGastosComSaude() * 0.50;
        if (valorImposto < 0){
            valorImposto = 0.0;
        }

        return valorImposto;
    }
}
