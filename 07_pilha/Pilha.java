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

    public boolean empilhamento(int i) {
        if (i <= this.topo) {
            this.push(i);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Pilha) {
            int t = this.tamanhoPilha();
            Pilha p = (Pilha) obj;

            if (t != p.tamanhoPilha())
                return false;

            Pilha pAux1 = new Pilha(t);
            Pilha pAux2 = new Pilha(t);
            boolean isEquals = true;

            while (!p.pilhaVazia()) {
                int aux1, aux2;
                aux1 = this.pop();
                aux2 = p.pop();

                pAux1.push(aux1);
                pAux2.push(aux2);

                if (aux1 != aux2) {
                    isEquals = false;
                    break;
                }
            }

            while (!pAux1.pilhaVazia()) {
                this.push(pAux1.pop());
                p.push(pAux2.pop());
            }

            return isEquals;
        }

        return false;
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
