public class Pilha {
    private int[] v;
    private int topo;

    public Pilha(int t) {
        this.v = new int[t];
        this.topo = 0;
    }

    public boolean estaVazia() {
        return this.topo == 0;
    }

    public void push(int i) {
        this.v[this.topo++] = i;
    }

    public int pop() {
        return this.v[--this.topo];
    }

    public void pushLeve(int i) {
        if (this.estaVazia() || i <= this.v[this.topo - 1])
        {
            this.push(i);
        }
        else
        {
            Pilha p = new Pilha(this.topo);
            int j = this.topo - 1;

            while(j >= 0 && this.v[j] < i) {
                p.push(this.v[j--]);
                this.topo--;
            }
            
            this.push(i);

            for (j = p.topo - 1; j >= 0; j--) {
                this.push(p.v[j]);
            }
        }
    }

    @Override
    public String toString() {
        String s = "Pilha:\n[ ";

        if (this.estaVazia()) {
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