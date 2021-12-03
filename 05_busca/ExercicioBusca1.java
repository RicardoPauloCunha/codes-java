import java.util.Random;
import java.util.Scanner;

public class ExercicioBusca1 {
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

    static int simpleSearchCount(int x, int v[]) {
        int count = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == x)
                count++;
        }

        return count;
    }

    static void simpleSearchPosition(int x, int v[], int vp[]) {
        for (int i = 0, j = 0; i < v.length; i++) {
            if (v[i] == x) {
                vp[j++] = i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] v = new int[n];
        int[] vp = new int[n];

        vetorGeneration(v);

        showVetor(v, "Vetor gerado: ");

        System.out.println("Ocorrencias de 34 encontradas: " + simpleSearchCount(34, v));

        simpleSearchPosition(34, v, vp);

        showVetor(vp, "Posicoes com 34: ");

        scanner.close();
    }
}