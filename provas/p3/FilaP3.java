public class FilaP3 implements ListaP3 {
    private NoP3 primeiro;
    private NoP3 ultimo;
    private int tamanho;

    public FilaP3() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void inserir(double info) {
        NoP3 noP3 = new NoP3(info);

        if (this.listaVazia())
            this.primeiro = noP3;
        else
            this.ultimo.setProximo(noP3);

        this.ultimo = noP3;
        this.tamanho++;
    }

    public double remover() {
        double info = this.primeiro.getInfo();

        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;

        if (this.tamanho == 0)
            this.ultimo = null;

        return info;
    }

    public boolean listaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public String toString() {
        String string = "Fila: ";

        if (this.listaVazia()) {
            string += "esta vazia.";
        } else {
            NoP3 aux = this.primeiro;

            while (aux != null) {
                string += aux;
                aux = aux.getProximo();
            }

            string += "//";
        }

        return string;
    }
}
