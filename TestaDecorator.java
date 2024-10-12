public class TestaDecorator {
    public static void main(String[] args) {
        // Cria um Açaí simples
        Adicional acaiSimples = new Acai("Açaí simples", 10.0);
        System.out.println("Descrição: " + acaiSimples.getDescricao());
        System.out.println("Custo: R$" + acaiSimples.custo());

        // Adiciona Morango ao Açaí
        Adicional acaiComMorango = new Morango(acaiSimples);
        System.out.println("\nDescrição: " + acaiComMorango.getDescricao());
        System.out.println("Custo: R$" + acaiComMorango.custo());

        // Adiciona Morango, Leite Condensado e Banana ao Açaí
        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(acaiSimples)));
        System.out.println("\nDescrição: " + acaiCompleto.getDescricao());
        System.out.println("Custo: R$" + acaiCompleto.custo());
    }
}
