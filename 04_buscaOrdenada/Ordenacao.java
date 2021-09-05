import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Ordenacao {
    static void geraVetor(int v[]) {
        Random random = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(10 * v.length);
        }
    }

    static void exibeVetor(int v[], String msg) {
        System.out.println(msg);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    static void bubbleSort(int v[]) {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] v = new int[n];

        Date iniGerador = new Date();
        geraVetor(v);
        Date fimGerador = new Date();
        System.out.printf("Geracao de valores demorou %d milissegundos\n", fimGerador.getTime() - iniGerador.getTime());
        exibeVetor(v, "Vetor gerado: ");

        Date iniBubbleGerador = new Date();
        bubbleSort(v);
        Date fimBubbleGerador = new Date();
        System.out.printf("Geracao de valores demorou %d milissegundos\n",
                fimBubbleGerador.getTime() - iniBubbleGerador.getTime());
        exibeVetor(v, "Vetor ordenado: ");

        scanner.close();
    }
}