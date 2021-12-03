public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private String chassi;
    private int velocidadeAtual;
    private int numeroPortas;
    private int numeroMarchas;
    private boolean possuiCambioAutomatico;
    private int capacidadeTanqueCombustivel;

    // Construtores
    public Carro() {

    }

    // Métodos de acesso
    public String getModelo() {
        return this.modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public int getAno() {
        return this.ano;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getChassi() {
        return this.chassi;
    }
    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }
    public int getNumeroPortas() {
        return this.numeroPortas;
    }
    public int getNumeroMarchas() {
        return this.numeroMarchas;
    }
    public boolean getPossuiCambioAutomatico() {
        return this.possuiCambioAutomatico;
    }
    public int getCapacidadeTanqueCombustivel() {
        return this.capacidadeTanqueCombustivel;
    }

    // Métodos modificadores
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }
    public void setPossuiCambioAutomatico(boolean possuiCambioAutomatico) {
        this.possuiCambioAutomatico = possuiCambioAutomatico;
    }
    public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    // Métodos
    @Override
    public String toString() {
        return "Carro: {" +
            "\n\tmodelo = " + this.getModelo() +
            "\n\tcor = " + this.getCor() +
            "\n\tano = " + this.getAno() +
            "\n\tmarca = " + this.getMarca() +
            "\n\tchassi = " + this.getChassi() +
            "\n\tvelocidadeAtual = " + this.getVelocidadeAtual() +
            "\n\tnumeroPortas = " + this.getNumeroPortas() +
            "\n\tnumeroMarchas = " + this.getNumeroMarchas() +
            "\n\tpossuiCambioAutomatico = " + this.getPossuiCambioAutomatico() +
            "\n\tcapacidadeTanqueCombustivel = " + this.getCapacidadeTanqueCombustivel() +
            "\n}";
    }
    public void acelera() {
        this.setVelocidadeAtual(this.getVelocidadeAtual() + 1);
    }
    public void  freia() {
        this.setVelocidadeAtual(0);
    }
}
