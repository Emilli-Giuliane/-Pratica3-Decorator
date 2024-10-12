package Copia;

public class Banana extends BaseDecorator {
    public Banana(Adicional wrappee) {
        super(wrappee);
    }
    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }
    @Override
    public double custo() {
        double custoAdicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                custoAdicional = 0.75;
                break;
            case MEDIO:
                custoAdicional = 1.25;
                break;
            case GRANDE:
                custoAdicional = 1.75;
                break;
        }
        return wrappee.custo() + custoAdicional;
    }
}