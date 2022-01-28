import java.util.Random;
import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da pilha: ");
        int tamanho = scanner.nextInt();

        Random random = new Random();

        Pilha p = new Pilha(tamanho);
        Pilha p2 = new Pilha(tamanho);

        // pilhas diferentes
        while (!p.pilhaCheia()) {
            p.push(random.nextInt(10));
            p2.push(random.nextInt(10));
            System.out.println(p);
        }

        // pilhas iguais
        // while (!p.pilhaCheia()) {
        // int i = random.nextInt(10);
        // p.push(i);
        // p2.push(i);
        // }

        // empilhamento ordem
        // while (!p.pilhaCheia()) {
        // int i = random.nextInt(10);
        // System.out.println("Empilhar elemento " + i + "? " + p.empilhamento(i));
        // }

        // Tamanho pilha
        System.out.println("\nTamanho da pilha = " + p.tamanhoPilha());

        // comparar pilhas
        System.out.println("\n" + p);
        System.out.println(p2);
        System.out.println("\nAs duas pilhas sao iguais? " + p.equals(p2) + "\n");

        // remover elementos
        while (!p.pilhaVazia()) {
            p.pop();
            System.out.println(p);
        }

        scanner.close();
    }
}
