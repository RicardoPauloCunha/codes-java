import java.util.Scanner;

public class Entrada2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        double x = scanner.nextDouble();

        boolean b = scanner.nextBoolean();

        char c = scanner.next().charAt(0);

        System.out.println("Inteiro: " + i + "\ndouble: " + x + "\nboolean: " + b + "\ncaracter: " + c);
    
        scanner.nextLine();
        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();

        System.out.println("Palavra1: " + palavra1 + "\nPalavra2: " + palavra2);

        c = scanner.next().charAt(0);

        System.out.println("Outro caracter: " + c);

        System.out.println("Raiz quadrada" + Math.sqrt(x));
        System.out.println("Cubo" + Math.pow(i, 3));

        scanner.close();
    }
}
