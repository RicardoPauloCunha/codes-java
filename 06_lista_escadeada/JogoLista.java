import java.util.Random;

public class JogoLista {
    public static void main(String[] args) {
        Lista l = new Lista();

        Random random = new Random();

        do {
            if (random.nextInt(2) == 1) {
                if (random.nextInt(2) == 1) {
                    l.insereInicio(random.nextInt(10));
                } else {
                    l.insereFim(random.nextInt(10));
                }
            } else {
                if (!l.estaVazia()) {
                    if (random.nextInt(2) == 1) {
                        System.out.println(l.removeInicio() + " saiu do inicio");
                    } else {
                        System.out.println(l.removeFim() + "saiu do fim");
                    }
                }
            }
            System.out.println(l);
        } while (!l.estaVazia());
    }
}
