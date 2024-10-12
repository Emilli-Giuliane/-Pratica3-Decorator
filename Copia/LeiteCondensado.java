package Copia;

public class LeiteCondensado extends BaseDecorator {
    public LeiteCondensado(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }
    @Override
    public double custo() {
        double custoAdicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                custoAdicional = 2.00;
                break;
            case MEDIO:
                custoAdicional = 2.50;
                break;
            case GRANDE:
                custoAdicional = 3.00;
                break;
        }
        return wrappee.custo() + custoAdicional;
    }
}