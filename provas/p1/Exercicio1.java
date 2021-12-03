import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fracao 1 - Digite o numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Fracao 1 - Digite o denominador: ");
        int denominador = scanner.nextInt();

        Fracao fracao1 = new Fracao(numerador, denominador);

        System.out.println();
        System.out.print("Fracao 2 - Digite o numerador: ");
        numerador = scanner.nextInt();
        System.out.print("Fracao 2 - Digite o denominador: ");
        denominador = scanner.nextInt();

        Fracao fracao2 = new Fracao();
        fracao2.setNumerador(numerador);
        fracao2.setDenominador(denominador);

        System.out.println();
        System.out.println("Fracao 1 = " + fracao1);
        System.out.println("Fracao 2 = " + fracao2);

        double decimalF1 = fracao1.DevolverValorDecimal();
        double decimalF2 = fracao2.DevolverValorDecimal();

        System.out.println();
        if (decimalF1 == decimalF2) {
            System.out.println("As duas fracoes representam o mesmo valor");
        } else if (decimalF1 > decimalF2) {
            System.out.println("A fracao 1 representa o maior valor");
        } else {
            System.out.println("A fracao 2 representa o maior valor");
        }

        scanner.close();
    }
}
