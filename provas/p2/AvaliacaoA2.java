import java.util.Random;

public class AvaliacaoA2 {
    public static void main(String[] args) {
        int tamanho = 5;
        Random random = new Random();

        // Exercicio 1
        Historico h = new Historico();
        h.insereInicio("site1", "https://site1.com");
        h.insereInicio("site2", "https://site2.com");
        h.insereInicio("site3", "https://site3.com");
        h.insereInicio("site4", "https://site4.com");
        h.insereInicio("site5", "https://site5.com");
        System.out.println("Exercicio 1\n" + h);
        h.buscarWebSite("site2");
        System.out.println("Depois da busca por 'site2'\n" + h);
        h.buscarWebSite("site4");
        System.out.println("Depois da busca por 'site4'\n" + h);

        // Exercicio 2
        Pilha p = new Pilha(tamanho);
        for (int i = 0; i < tamanho; i++) {
            p.pushLeve(random.nextInt(tamanho * 10));
        }
        System.out.println("\nExercicio 2");
        System.out.println(p);

        // Exercicio 3
        Fila f = new Fila(tamanho);
        for (int i = 0; i < tamanho; i++) {
            f.insere(random.nextInt(tamanho * 10));
        }
        System.out.println("\nExercicio 3");
        System.out.println(f);
        f.inverter();
        System.out.println(f);
    }
}