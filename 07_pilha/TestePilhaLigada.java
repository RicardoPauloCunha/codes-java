import java.util.Random;

public class TestePilhaLigada {
    public static void main(String[] args) {
        Random random = new Random();

        PilhaLigada p = new PilhaLigada();

        int i = 1;

        while (i <= 6) {
            p.push(random.nextInt(10));
            System.out.println(p);
            i++;
        }

        while (!p.estaVazia()) {
            p.pop();
            System.out.println(p);
        }
    }
}
