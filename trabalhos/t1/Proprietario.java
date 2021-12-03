import java.text.SimpleDateFormat;
import java.util.Date;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    // Construtores
    public Proprietario() {

    }
    public Proprietario(String nome, String cpf, String rg) {
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
    }

    // Métodos acesso
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getRg() {
        return this.rg;
    }
    public String getDataNascimento() {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento);
        } catch (Exception ex) {
            return "00/00/0000";
        }
    }
    public String getRua() {
        return this.rua;
    }
    public String getBairro() {
        return this.bairro;
    }
    public String getCidade() {
        return this.cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    public String getCep() {
        return this.cep;
    }
    public String getComplemento() {
        return this.complemento;
    }

    // Métodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setDataNascimento(String dataNascimento) {
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (Exception ex) {
        }
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Métodos
    @Override
    public String toString() {
        return "Proprietario: {" +
        "\n\tnome = " + this.getNome() +
        "\n\tcpf = " + this.getCpf() +
        "\n\trg = " + this.getRg() +
        "\n\tdataNascimento = " + this.getDataNascimento() +
        "\n\trua = " + this.getRua() +
        "\n\tbairro = " + this.getBairro() +
        "\n\tcidade = " + this.getCidade() +
        "\n\testado = " + this.getEstado() +
        "\n\tcep = " + this.getCep() +
        "\n\tcomplemento = " + this.getComplemento()+
        "\n}";
    }
}
