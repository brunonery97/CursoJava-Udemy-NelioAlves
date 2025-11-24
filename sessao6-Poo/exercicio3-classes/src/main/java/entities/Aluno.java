package entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double resultadoFinal (){
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltante(){
        if (resultadoFinal() < 60.0) {
            return 60.0 - resultadoFinal();
        } else {
            return 0.0;
        }
    }

}
