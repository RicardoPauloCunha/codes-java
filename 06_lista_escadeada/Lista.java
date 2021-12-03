public class Lista {
    private No primeiro;

    // construtor padrão
    public No getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void insereInicio(int i) {
        No novo = new No(i);

        if (!this.estaVazia()) {
            novo.setProximo(this.getPrimeiro());
        }

        this.setPrimeiro(novo);
    }

    public void inserePosicao(int i, int p) {

        if (p <= 0) {
            insereInicio(i);
        } else if (p > tamanhoLista() - 1) {
            insereFim(i);
        } else {
            No novo = new No(i);
            No aux = this.primeiro;

            for (int j = 0; j < p - 1; j++) {
                aux = aux.getProximo();
            }

            novo.setProximo(aux.getProximo());
            aux.setProximo(novo);
        }
    }

    public void insereFim(int i) {
        No novo = new No(i);

        if (this.estaVazia()) {
            this.setPrimeiro(novo);
        } else {
            No aux = this.primeiro;

            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }

            aux.setProximo(novo);
        }
    }

    public int removeInicio() {
        int i = this.primeiro.getInfo();

        this.setPrimeiro(this.primeiro.getProximo());

        return i;
    }

    public int removePosicao(int p) {
        int i;

        if (p <= 0) {
            i = removeInicio();
        } else if (p > tamanhoLista() - 1) {
            i = removeFim();
        } else {
            No aux = this.primeiro;

            for (int j = 0; j < p - 1; j++) {
                aux = aux.getProximo();
            }

            i = aux.getProximo().getInfo();
            aux.setProximo(aux.getProximo().getProximo());
        }

        return i;
    }

    public int removeFim() {
        int i;

        if (this.primeiro.getProximo() == null) {
            i = this.primeiro.getInfo();

            this.setPrimeiro(null);
        } else {
            No aux = this.getPrimeiro();

            while (aux.getProximo().getProximo() != null) {
                aux = aux.getProximo();
            }

            i = aux.getProximo().getInfo();

            aux.setProximo(null);
        }

        return i;
    }

    public int tamanhoLista() {
        int cont = 0;
        No aux = this.primeiro;

        while (aux != null) {
            aux = aux.getProximo();
            cont++;
        }

        return cont;
    }

    @Override
    public String toString() {
        String s = "Lista: ";

        if (this.estaVazia()) {
            s += "esta vazia.";
        } else {
            No aux = this.getPrimeiro();

            while (aux != null) {
                s += aux;
                aux = aux.getProximo();
            }

            s += "//";
        }

        return s;
    }
}
