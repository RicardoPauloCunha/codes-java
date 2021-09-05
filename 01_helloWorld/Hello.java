import javax.swing.JOptionPane;

public class Hello {
    public static void main(String[] args) {
        // Em linha de comando
        System.out.println("Hello World");
        
        // Janela
        JOptionPane.showMessageDialog(null, "Hello World");
        JOptionPane.showMessageDialog(null, "Cuidado", "Título da caixinha", JOptionPane.ERROR_MESSAGE);
    }
}