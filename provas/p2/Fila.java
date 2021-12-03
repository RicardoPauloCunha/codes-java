public class Fila {
    private int[] v;
    private int tamanho;
    private int primeiro;
    private int ultimo;

    public Fila(int t) {
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
        this.v = new int[t];
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    private int proximaPosicao(int p) {
        return (p + 1) % this.v.length;
    }

    public void insere(int i) {
        this.v[this.ultimo] = i;
        this.ultimo = this.proximaPosicao(this.ultimo);
        this.tamanho++;
    }

    public int remove() {
        int copia = this.v[this.primeiro];
        this.primeiro = this.proximaPosicao(this.primeiro);
        this.tamanho--;
        return copia;
    }

    public void inverter() {
        Pilha p = new Pilha(this.v.length);

        while(this.tamanho != 0)
        {
            p.push(this.remove());
        }

        for (int i = 0; i < this.v.length; i++) {
            this.insere(p.pop());
        }
    }

    @Override
    public String toString() {
        String s = "Fila:\n";

        if (this.tamanho == 0) {
            s += "fila vazia";
        } else {
            // Sou o Ricardo, levantei uma dúvida sobre a fila cheia durante a aula
            // Mas essa foi a solução que encontrei, usando uma variavel contadora auxiliar
            for (int i = this.primeiro, j = 0; i != this.ultimo || j < this.tamanho; i = this.proximaPosicao(i), j++) {
                s += this.v[i] + " - ";
            }

            s += "//";
        }

        return s;
    }
}