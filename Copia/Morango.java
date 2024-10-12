package Copia;

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
        double custoAdicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                custoAdicional = 1.00;
                break;
            case MEDIO:
                custoAdicional = 1.50;
                break;
            case GRANDE:
                custoAdicional = 2.00;
                break;
        }
        return wrappee.custo() + custoAdicional;
    }
}