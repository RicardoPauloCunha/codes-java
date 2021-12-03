public class Pilha {
    private int[] v;
    private int topo;

    public Pilha(int tamanho) {
        this.v = new int[tamanho];
        this.topo = 0;
    }

    public boolean pilhaVazia() {
        return this.topo == 0;
    }

    public boolean pilhaCheia() {
        return this.topo == v.length;
    }

    public void push(int elemento) {
        this.v[this.topo++] = elemento;
    }

    public int pop() {
        return this.v[--this.topo];
    }

    @Override
    public String toString() {
        String s = "";

        if (this.pilhaVazia()) {
            s += "Nao ha o que converter.";
        } else {
            for (int i = this.topo - 1; i >= 0; i--) {
                s += this.v[i] + "";
            }
        }

        return s;
    }
}
