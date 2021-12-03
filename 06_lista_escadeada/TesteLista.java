public class TesteLista {
    public static void main(String[] args) {
        int p = 2;
        Lista l = new Lista();

        System.out.println("Lista criada:\n" + l);

        l.insereInicio(2);
        l.insereInicio(4);
        l.insereInicio(6);
        System.out.println("\nLista depois das insercoes de inicio:\n" + l);

        l.inserePosicao(0, p);
        System.out.println("\nLista depois da insercao da posicao " + p + ":\n" + l);

        l.insereFim(1);
        l.insereFim(3);
        l.insereFim(5);

        System.out.println("\nLista depois das insercoes de fim:\n" + l);
        System.out.println("Tamanho lista = " + l.tamanhoLista());

        if (!l.estaVazia()) {
            System.out.println("\n" + l.removeInicio() + " foi removido do inicio");
            System.out.println("Lista depois da remocao de inicio:\n" + l);
        }

        if (!l.estaVazia()) {
            System.out.println("\n" + l.removePosicao(p) + " foi removido da posicao " + p);
            System.out.println("Lista depois da remocao da posicao " + p + ":\n" + l);
        }

        if (!l.estaVazia()) {
            System.out.println("\n" + l.removeFim() + " foi removido do fim");
            System.out.println("Lista depois da remocao de fim:\n" + l);
        }
    }
}
