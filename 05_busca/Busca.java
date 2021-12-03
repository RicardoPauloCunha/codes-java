import java.util.Random;
import java.util.Scanner;

public class Busca {
    static void vetorGeneration(int v[]) {
        Random random = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(10 * v.length);
        }
    }

    static void showVetor(int v[], String msg) {
        System.out.println("");
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

    static boolean simpleSearch(int x, int v[]) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x)
                return true;
        }

        return false;
    }

    static int simpleSearchCount(int x, int v[]) {
        int i = 0;

        for (i = 0; i < v.length; i++) {
            if (v[i] == x)
                return i;
        }

        return i;
    }

    static boolean binarySearch(int x, int v[]) {
        int start = 0;
        int end = v.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (v[mid] == x)
                return true;

            if (x > v[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }

    static int binarySearchCount(int x, int v[]) {
        int i = 0;
        int start = 0;
        int end = v.length - 1;

        while (start <= end) {
            i++;

            int mid = (start + end) / 2;

            if (v[mid] == x)
                return i;

            if (x > v[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] v = new int[n];

        vetorGeneration(v);

        // showVetor(v, "Vetor gerado: ");

        if (simpleSearch(34, v))
            System.out.println("\n34 esta no vetor");
        else
            System.out.println("\n34 nao esta no vetor");

        System.out.println("\nComparacoes na busca simples: " + simpleSearchCount(34, v));

        bubbleSort(v);

        System.out.println("Comparacoes na busca binaria: " + binarySearchCount(34, v));

        // showVetor(v, "Vetor ordenado: ");

        scanner.close();
    }
}