public class Pilha {
    private int[] v;
    private int topo;

    public Pilha(int t) {
        this.v = new int[t];
        this.topo = 0;
    }

    public boolean pilhaVazia() {
        return this.topo == 0;
    }

    public boolean pilhaCheia() {
        return this.topo == v.length;
    }

    public int tamanhoPilha() {
        return this.topo;
    }

    public void push(int i) {
        this.v[this.topo++] = i;
    }

    public int pop() {
        return this.v[--this.topo];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Pilha) {
            Pilha p = (Pilha) obj;

            if (p.tamanhoPilha() != this.tamanhoPilha()) {
                return false;
            } else {
                while (!p.pilhaVazia()) {
                    if (p.pop() != this.pop()) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String s = "Pilha: [ ";

        if (this.pilhaVazia()) {
            s += "vazia ";
        } else {
            for (int i = this.topo - 1; i >= 0; i--) {
                s += this.v[i] + " ";
            }
        }

        s += "]";

        return s;
    }
}
