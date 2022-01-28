public class FilaLigada {
    private int tamanho;
    private No primeiro;
    private No ultimo;

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void insere(int i) {
        No novo = new No(i);

        if (this.estaVazia()) {
            this.primeiro = novo;
        } else {
            this.ultimo.setProximo(novo);
        }

        this.ultimo = novo;
        this.tamanho++;
    }

    public int remove() {
        int copia = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.ultimo = null;
        }

        return copia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof FilaLigada) {
            FilaLigada f = (FilaLigada) obj;

            if (this.getTamanho() != f.getTamanho())
                return false;

            No aux1 = this.primeiro;
            No aux2 = f.primeiro;

            while (aux1 != null) {
                if (aux1.getInfo() != aux2.getInfo())
                    return false;

                aux1 = aux1.getProximo();
                aux2 = aux2.getProximo();
            }

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String s = "";

        if (this.tamanho == 0) {
            s += "fila vazia";
        } else {
            No aux = this.primeiro;

            while (aux != null) {
                s += aux.getInfo() + " -> ";
                aux = aux.getProximo();
            }

            s += "//";
        }

        return s;
    }
}
