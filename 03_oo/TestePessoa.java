import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        // Decalra 2 objetos da classe pessoa
        Pessoa p1, p2;

        // Instância o objeto p1, usando o construtor padrão
        p1 = new Pessoa();
        JOptionPane.showMessageDialog(null, "Numero de pessoas criadas = " + Pessoa.getQuantasPessoas());
        System.out.println("Objeto p1 criado:\n" + p1);

        p1.setIdade(20);
        p1.setNome("Jose");

        System.out.println("Objeto p1 modificado:\n" + p1);

        p1.fazAniversario();
        JOptionPane.showMessageDialog(null, "p1 fez aniversario:\n" + p1);
    
        p2 = new Pessoa(21, "Maria");
        JOptionPane.showMessageDialog(null, "Numero de pessoas criadas = " + Pessoa.quantasPessoas);
        JOptionPane.showMessageDialog(null, "p2::\n" + p2);
    }
}
