package Copia;

public class Acai implements Adicional {
    private String descricao;
    private double preco;
    private Tamanho tamanho;

    public Acai(String descricao, double preco, Tamanho tamanho) {
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
    }
    @Override
    public String getDescricao() {
        return this.descricao + " (" + this.tamanho.name().toLowerCase() + ")";
    }
    @Override
    public double custo() {
        return this.preco;
    }
    @Override
    public Tamanho getTamanho() {
        return this.tamanho;
    }
}