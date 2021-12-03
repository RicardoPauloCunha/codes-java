import java.util.Random;
import java.util.Scanner;

public class ExercicioBusca2 {
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
        int count = 0;
        int start = 0;
        int end = v.length - 1;
        int mid = 0;

        while (start <= end && count == 0) {
            mid = (start + end) / 2;

            if (v[mid] == x)
                count = 1;

            if (x > v[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        if (count > 0) {
            for (int i = mid - 1; i >= 0 && v[i] == x; count++, i--);
            for (int i = mid + 1; i < v.length && v[i] == x; count++, i++);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] v = new int[n];

        vetorGeneration(v);

        bubbleSort(v);

        showVetor(v, "Vetor ordenado: ");

        System.out.println("Total de ocorrencias de 34: " + binarySearchCount(34, v));

        scanner.close();
    }
}