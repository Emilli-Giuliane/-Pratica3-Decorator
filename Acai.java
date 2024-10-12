public class Acai implements Adicional {
    private String descricao;
    private double preco;

    public Acai(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    @Override
    public String getDescricao() {
        return this.descricao;
    }
    @Override
    public double custo() {
        return this.preco;
    }
    
    public static void main(String[] args) {
        Acai acaiSimples = new Acai("Açaí simples", 10.0);
        System.out.println("Descrição: " + acaiSimples.getDescricao());
        System.out.println("Custo: R$" + acaiSimples.custo());
    }
}
