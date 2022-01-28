public class NoP3 {
    private double info;
    private NoP3 proximo;

    public NoP3(double info) {
        setInfo(info);
        setProximo(null);
    }

    public void setInfo(double info) {
        this.info = info;
    }

    public void setProximo(NoP3 proximo) {
        this.proximo = proximo;
    }

    public double getInfo() {
        return this.info;
    }

    public NoP3 getProximo() {
        return this.proximo;
    }

    @Override
    public String toString() {
        return this.info + " -> ";
    }
}
