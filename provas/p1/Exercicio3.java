import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    static void gerarVetorAleatorio(int vetor[]) {
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10 * vetor.length);
        }
    }

    static void exibirVetor(int vetor[], String mensagem) {
        System.out.println("");
        System.out.println(mensagem);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    static void ordenarDecrescente(int v[]) {
        // Bubble Sort
        for (int i = 0; i < v.length; i++) {
            for (int j = v.length - 1; j > 0; j--) {
                if (v[j] > v[j - 1]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        gerarVetorAleatorio(vetor);

        ordenarDecrescente(vetor);
        
        exibirVetor(vetor, "Vetor em ordem decrescente: ");

        scanner.close();
    }
}
