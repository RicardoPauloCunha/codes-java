import java.util.Random;

public class TesteFilaLigada {
    public static FilaLigada intercalarFilas(FilaLigada f1, FilaLigada f2) {
        FilaLigada fAux = new FilaLigada();

        while (!f1.estaVazia() || !f2.estaVazia()) {
            if (!f1.estaVazia())
                fAux.insere(f1.remove());

            if (!f2.estaVazia())
                fAux.insere(f2.remove());
        }

        return fAux;
    }

    public static void main(String[] args) {
        FilaLigada f = new FilaLigada();
        FilaLigada f2 = new FilaLigada();
        Random random = new Random();

        // adição remoção
        // do {
        // if (random.nextInt(2) == 1) {
        // int n = random.nextInt(10);
        // System.out.println(n + " entrou");
        // f.insere(n);
        // System.out.println(f);
        // } else {
        // if (!f.estaVazia()) {
        // System.out.println(f.remove() + " foi atendido");
        // System.out.println(f);
        // }
        // }
        // } while (!f.estaVazia());

        // teste iguais
        for (int i = 0; i < 2; i++) {
            f.insere(random.nextInt(2));
            f2.insere(random.nextInt(2));
        }

        System.out.println(f);
        System.out.println(f2);
        System.out.println("\nAs duas pilhas sao iguais? " + f.equals(f2) + "\n");

        System.out.println(intercalarFilas(f, f2));
    }
}
