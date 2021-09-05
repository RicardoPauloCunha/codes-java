public class Pessoa {
    // Ordem:
    // Atributos 
    // Construtores
    // Encapsulados
    // Mêtodos

    private int idade;
    private String nome;
    static int quantasPessoas = 0;

    public Pessoa() {

    }

    public Pessoa(int idade, String nome) {
        this.setIdade(idade);
        this.setNome(nome);
        quantasPessoas++;
    }

    // Getters permitem consultar cada atributo
    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    // Setters permitem alterar cada atributo
    public void setIdade(int idade) {
        if (this.idade < 18) {
            this.idade = 0;
        }

        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Pessoa: [nome = " + this.getNome() + ", idade = " + this.getIdade() + "]";
    }

    void fazAniversario() {
        this.idade++;
    }

    static public int getQuantasPessoas() {
        return quantasPessoas;
    }
}
