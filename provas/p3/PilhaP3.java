public class PilhaP3 implements ListaP3 {
    private NoP3 primeiro;

    public PilhaP3() {
        this.primeiro = null;
    }

    public void inserir(double info) {
        NoP3 noP3 = new NoP3(info);

        if (!this.listaVazia())
            noP3.setProximo(this.primeiro);

        this.primeiro = noP3;
    }

    public double remover() {
        double info = this.primeiro.getInfo();

        this.primeiro = this.primeiro.getProximo();

        return info;
    }

    public boolean listaVazia() {
        return this.primeiro == null;
    }

    @Override
    public String toString() {
        String string = "Pilha: ";

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
