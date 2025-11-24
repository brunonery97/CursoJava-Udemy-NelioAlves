package entities;

public class ProdutoUsado extends Produto{

    private String dataFabricacao;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String etiquetaPreco(){
        return getNome() + " (usado) R$ " +getPreco() + " (Data da fabricação: " + dataFabricacao + ")";
    }
}
