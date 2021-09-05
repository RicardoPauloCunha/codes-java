import javax.swing.JOptionPane;

public class Vetor1 {
    static void leVetor(int[] v, String name) {
        JOptionPane.showMessageDialog(null, "Digite " + v.length + " elementos para o elemento " + name);

        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Posicao " + i));
        }
    }

    static int somaVetor(int[] v) {
        int s = 0;

        for (int i = 0; i < v.length; i++) {
            s += v[i];
        }

        return s;
    }

    static void mostraVetor(int[] v, String name) {
        String msg = "Vetor " + name + ":\n";
        
        for (int i = 0; i < v.length; i++) {
            msg += v[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args) {
        int v1[];
        int[] v2;
        int a, v3[]; // variavel, vetor
        int[] b, v4[]; // vetor, vetor
        v3 = new int[3]; // alocação do vetor
        int v5[] = new int[5];

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        int v6[] = new int[n];

        leVetor(v3, "v3");
        mostraVetor(v3, "v3");
        JOptionPane.showMessageDialog(null, "Soma do vetor v2 = " + somaVetor(v3));
        
        leVetor(v5, "v5");
        mostraVetor(v5, "v5");
        JOptionPane.showMessageDialog(null, "Soma do vetor v2 = " + somaVetor(v5));
    }
}
