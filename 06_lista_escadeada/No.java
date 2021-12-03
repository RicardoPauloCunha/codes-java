public class No {
    // atributos
    private int info;
    private No proximo;

    // construtores
    public No(int info) {
        this.info = info;
        this.proximo = null;
    }

    // métodos de acesso
    public int getInfo() {
        return this.info;
    }

    public No getProximo() {
        return this.proximo;
    }

    // métodos modificadores
    public void setInfo(int info) {
        this.info = info;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // refefinir o toString
    @Override
    public String toString() {
        return this.info + " -> ";
    }
}
