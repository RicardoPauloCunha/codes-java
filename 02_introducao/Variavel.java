import javax.swing.JOptionPane;

public class Variavel {
    public static void main(String[] args) {
        int a = 5, b = 3;
        double x = 3.45;
        boolean logica = true;
        char letra = 'z';
        String frase = "Aprendendo java";

        System.out.printf("a = %d\nx = %.2f\n", a, x);
        System.out.println("Soma = " + (a + b));

        System.out.println("Divisao inteira = " + (a / b));
        System.out.println("Divisao real = " + ((double) a / b));

        JOptionPane.showMessageDialog(null, "Divisao real = " + String.format("%.3f", a / x), "Formatando numeros",
                JOptionPane.INFORMATION_MESSAGE);

        System.out.println(logica);
        System.out.println("Contrario = " + !logica);

        System.out.println(frase + " " + letra);
    }
}