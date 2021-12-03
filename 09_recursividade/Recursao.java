public class Recursao {
    static int fatorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorialRecursivo(n - 1);
        }
    }

    static long fibonacciRecursivo(int n) {
        if (n <= 1)
            return 1;

        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // Programação dinâmica
    static void fibonacci(int[] v, int n) {
        v[0] = 1;
        v[1] = 1;
        for (int i = 2; i < n; i++) {
            v[i] = v[i - 1] + v[i - 2];
        }
    }

    public static void main(String[] args) {
        // int[] v = new int[6];
        // System.out.println("fatorial de 5 = " + fatorialRecursivo(5));

        for (int i = 0; i < 31; i++) {
            System.out.println("fibonacci de " + i + " = " + fibonacciRecursivo(i));
        }

        // fibonacci(v, 6);
        // System.out.println("fibonacci de 5 = " + v[5]);
    }
}
