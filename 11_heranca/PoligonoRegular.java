public abstract class PoligonoRegular {
    private int nLados;
    private double lado;

    public PoligonoRegular(int nLados, double lado) {
        setNLados(nLados);
        setLado(lado);
    }

    public int getNLados() {
        return this.nLados;
    }

    public double getLado() {
        return this.lado;
    }

    public void setNLados(int nLados) {
        this.nLados = nLados;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 1;
        }

        this.lado = lado;
    }

    public double calculoPerimetro() {
        return nLados * lado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof PoligonoRegular) {
            PoligonoRegular pol = (PoligonoRegular) obj;
            if (this.lado != pol.lado)
                return false;
            if (this.nLados != pol.nLados)
                return false;
        }

        return true;
    }

    public abstract double calculoArea();
}
