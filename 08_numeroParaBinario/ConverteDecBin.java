import java.util.Scanner;

public class ConverteDecBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero na base 10 para converte-lo para base 2: ");
        int numero10 = scanner.nextInt();

        Pilha numero2 = new Pilha(1000000);

        while (numero10 > 0) {
            numero2.push(numero10 % 2);
            numero10 = numero10 / 2;
        }

        System.out.println("Numero convertido para base 2: " + numero2);

        scanner.close();
    }
}
