import javax.swing.JOptionPane;

public class Entrada1 {
    public static void main(String args[]) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");
        System.out.println("Voce digitou " + palavra);

        String aux = JOptionPane.showInputDialog("Digite um inteiro");
        int i = Integer.parseInt(aux);
        
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um real"));
    
        char simbolo = JOptionPane.showInputDialog("Digite um caracter").charAt(0);
    }
}
