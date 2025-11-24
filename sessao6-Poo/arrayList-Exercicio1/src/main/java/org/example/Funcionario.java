package org.example;

public class Funcionario {

    private String nome;
    private Integer id;
    private Double salario;

    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public void aumentoSalario(double porcentagem){
        salario += salario * porcentagem / 100;
    }

    public String toString() {
        return getId() + ", " + getNome() + ", R$" + String.format("%.2f", getSalario()) ;
    }
}
