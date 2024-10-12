package Copia;

public class TesteDecorator {
    public static void main(String[] args) {
        Adicional acaiPequeno = new Acai("Açaí", 8.0, Tamanho.PEQUENO);
        System.out.println("Descrição: " + acaiPequeno.getDescricao());
        System.out.println("Custo: R$" + acaiPequeno.custo());
        Adicional acaiPequenoComMorango = new Morango(acaiPequeno);
        System.out.println("\nDescrição: " + acaiPequenoComMorango.getDescricao());
        System.out.println("Custo: R$" + acaiPequenoComMorango.custo());
        Adicional acaiGrande = new Acai("Açaí", 12.0, Tamanho.GRANDE);
        Adicional acaiGrandeCompleto = new Banana(new LeiteCondensado(new Morango(acaiGrande)));
        System.out.println("\nDescrição: " + acaiGrandeCompleto.getDescricao());
        System.out.println("Custo: R$" + acaiGrandeCompleto.custo());
    }
}