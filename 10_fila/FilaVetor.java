public class FilaVetor {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int tamanho;

    public FilaVetor(int capacidade) {
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
        this.dados = new int[capacidade];
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public boolean estaCheia() {
        return this.tamanho == this.dados.length;
    }

    private int proximaPosicao(int posicaoAtual) {
        return (posicaoAtual + 1) % this.dados.length;
    }

    public void insere(int i) {
        this.dados[this.ultimo] = i;
        this.ultimo = this.proximaPosicao(this.ultimo);
        this.tamanho++;
    }

    public int remove() {
        int copia = this.dados[this.primeiro];
        this.primeiro = this.proximaPosicao(this.primeiro);
        this.tamanho--;
        return copia;
    }

    @Override
    public String toString() {
        String s = "";

        if (this.tamanho == 0) {
            s += "fila vazia";
        } else {
            for (int i = this.primeiro; i != this.ultimo; i = this.proximaPosicao(i)) {
                s += this.dados[i] + " - ";
            }
            s += "//";
        }

        return s;
    }
}
