import java.util.Random;
import java.util.Scanner;

public class Recursao {
    static void exibirNaturais(int n) {
        if (n > 0)
            exibirNaturais(n - 1);
        System.out.print(n + " ");
    }

    static int somaNaturais(int n) {
        if (n > 0)
            return n + somaNaturais(n - 1);
        else
            return 0;
    }

    static void gerarVetor(int v[]) {
        Random random = new Random();

        // Gera o vetor
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(10 * v.length);
        }

        // Ordena o vetor
        for (int i = 1; i < v.length; ++i) {
            int aux = v[i];
            int j;

            for (j = i - 1; j >= 0 && v[j] > aux; --j) {
                v[j + 1] = v[j];
            }

            v[j + 1] = aux;
        }
    }

    static void exibirVetor(int n, int v[]) {
        if (n > 0)
            exibirVetor(n - 1, v);
        System.out.print(v[n] + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Exibir numeros naturais de 0 ate: ");
        n = scanner.nextInt();
        exibirNaturais(n);

        System.out.println("\n\nSoma dos numeros naturais de 0 ate: ");
        n = scanner.nextInt();
        System.out.println(somaNaturais(n));

        System.out.println("\nTamanho do vetor para exibicao: ");
        n = scanner.nextInt();
        int[] v = new int[n];
        gerarVetor(v);
        exibirVetor(n - 1, v);

        scanner.close();
    }
}