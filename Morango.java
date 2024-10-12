public class Morango extends BaseDecorator {
    public Morango(Adicional wrappee) {
        super(wrappee);
    }
    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Morango";
    }
    @Override
    public double custo() {
        return wrappee.custo() + 2.50;  // Adiciona R$ 2.50 pelo Morango
    }
}