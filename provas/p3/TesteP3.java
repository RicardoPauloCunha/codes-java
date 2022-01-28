public class TesteP3 {
    public static void main(String[] args) {
        PilhaP3 pilhaP3 = new PilhaP3();

        pilhaP3.inserir(0.12);
        pilhaP3.inserir(3.35);
        pilhaP3.inserir(6.78);

        pilhaP3.remover();

        System.out.println(pilhaP3);

        FilaP3 filaP3 = new FilaP3();

        filaP3.inserir(9.1011);
        filaP3.inserir(12.1314);
        filaP3.inserir(15.1617);

        filaP3.remover();

        System.out.println(filaP3);
    }
}
