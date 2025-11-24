package entities;

public class Employee {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentoSalario ( double porcentagem) {
        this.salarioBruto += this.salarioBruto * porcentagem / 100;
    }

    public String toString(){
        return nome + ", R$" + salarioLiquido();
    }
}
