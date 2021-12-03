import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    static void gerarVetorAleatorio(int vetor[], int intervalo) {
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(intervalo);
        }
    }

    static void exibirVetor(int v[], String msg) {
        System.out.println("");
        System.out.println(msg);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    static boolean verificarRepeticao(int vetor[])
    {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (i != j && vetor[i] == vetor[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.print("Digite o limite superior do intervalo dos valores: ");
        int intervalo = scanner.nextInt();

        gerarVetorAleatorio(vetor, intervalo);

        exibirVetor(vetor, "Vetor");

        boolean repeticao = verificarRepeticao(vetor);

        System.out.println();
        if (repeticao) {
            System.out.println("Existe repeticao de numeros");
        } else {
            System.out.println("Nao existe repeticao de numeros");
        }

        scanner.close();
    }
}
