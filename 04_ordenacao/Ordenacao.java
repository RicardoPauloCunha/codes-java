import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Ordenacao {
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

    static void showMenu() {
        System.out.println("---< MENU >---");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Insertion Sort");
        System.out.println("3 - Selection Sort");
        System.out.println("4 - Quick Sort");
        System.out.println("0 - Sair");
        System.out.println("");
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

    static void insertionSort(int v[]) {
        for (int i = 1; i < v.length; ++i) {
            int aux = v[i];

            int j;
            for (j = i - 1; j >= 0 && v[j] > aux; --j) {
                v[j + 1] = v[j];
            }

            v[j + 1] = aux;
        }
    }

    static void selectionSort(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[min])
                    min = j;
            }

            int aux = v[i];
            v[i] = v[min];
            v[min] = aux;
        }
    }

    static int partition(int v[], int p, int r) {
        int x = v[r];
        int i = p - 1;
        for (int j = p; j <= r; j++) {
            if (v[j] <= x) {
                i++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }
        i++;
        v[r] = v[i];
        v[i] = x;
        return i;
    }

    static void quickSort(int[] v, int p, int r) {
        if (p < r) {
            int q = partition(v, p, r);
            quickSort(v, p, r - 1);
            quickSort(v, q + 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            showMenu();

            System.out.print("Sua escolha: ");
            option = scanner.nextInt();

            if (option == 0)
                break;

            System.out.print("Digite o tamanho do vetor: ");
            int n = scanner.nextInt();
            int[] v = new int[n];

            vetorGeneration(v);
            showVetor(v, "Vetor gerado: ");
            
            long startTime = new Date().getTime();

            switch (option) {
            case 1:
                bubbleSort(v);
                break;
            case 2:
                insertionSort(v);
                break;
            case 3:
                selectionSort(v);
                break;
                case 4:
                partition(v, 0, n-1);
                break;
                default:
                break;
            }

            long endTime = new Date().getTime();;

            showVetor(v, "Vetor ordenado: ");

            System.out.println("");
            System.out.printf("Geracao de valores demorou %d milissegundos\n", endTime - startTime);
            System.out.println("");
            System.out.println("Aperte ENTER para continuar...");
            scanner.nextLine();
            scanner.nextLine();
        } while (option != 0);

        scanner.close();
    }
}