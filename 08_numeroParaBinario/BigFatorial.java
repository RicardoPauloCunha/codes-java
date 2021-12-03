import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;

public class BigFatorial {
    static double fatorial(int n) {
        double f = 1;

        for (int i = 2; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    static BigInteger bigFatorial(int n) {
        BigInteger f = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }

    static BigInteger jogosMegasena() {
        return bigFatorial(60).divide(bigFatorial(54)).divide(bigFatorial(6));
    }

    static boolean repete(int n, int[] v, int i) {
        for (int j = 0; j < i; j++) {
            if (v[j] == n) {
                return true;
            }
        }

        return false;
    }

    static void geraJogo(int[] v) {
        Random random = new Random();

        v[0] = random.nextInt(60) + 1;

        int i = 1, n;

        while (i < 6) {
            do {
                n = random.nextInt(60) + 1;
            } while (repete(n, v, i));

            v[i++] = n;
        }
    }

    public static void main(String[] args) {
        // for (int i = 0; i < 31; i++) {
        // System.out
        // .println("fatoria de " + i + " = " + bigFatorial(i) + " ou " +
        // String.format("%.0f", fatorial(i)));
        // }

        System.out.println("Total de jogos da megasena = " + jogosMegasena());

        BigDecimal numerador = new BigDecimal(BigInteger.ONE);
        BigDecimal denominador = new BigDecimal(jogosMegasena());

        System.out.println(
                "\nSua change de ganhar: " + String.format("%.12f", numerador.divide(denominador, 20, RoundingMode.UP)));

        int[] v = new int[6];
        geraJogo(v);
        
        System.out.println("\nSe mesmo assim quiser jogar, vai a dica: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(v[i] + " ");
        }
        
        System.out.println("\n\nBoa sorte");
    }
}