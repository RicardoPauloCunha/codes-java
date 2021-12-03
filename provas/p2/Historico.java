public class Historico {
    private No primeiro;

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void insereInicio(String nome, String link) {
        No novo = new No(new WebSite(nome, link));

        if (!this.estaVazia())
            novo.setProximo(this.primeiro);

        this.setPrimeiro(novo);
    }

    public void buscarWebSite(String nome) {
        No aux = this.primeiro;

        while (aux.getProximo() != null) {
            if (aux.getProximo().getInfo().getNome().equals(nome)) {
                No no = aux.getProximo();
                aux.setProximo(no.getProximo());
                no.setProximo(this.primeiro);
                this.setPrimeiro(no);
                break;
            }
            
            aux = aux.getProximo();
        }
    }

    @Override
    public String toString() {
        String s = "Lista:";

        if (this.estaVazia()) {
            s += "esta vazia.";
        } else {
            No aux = this.primeiro;

            while (aux != null) {
                s += aux;
                aux = aux.getProximo();
            }

            s += "//";
        }

        return s;
    }
}