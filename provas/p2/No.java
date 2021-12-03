public class No {
    private WebSite info;
    private No proximo;

    public No(WebSite info) {
        this.info = info;
        this.proximo = null;
    }

    public WebSite getInfo() {
        return this.info;
    }

    public No getProximo() {
        return this.proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "\n" + this.info + " -> ";
    }
}