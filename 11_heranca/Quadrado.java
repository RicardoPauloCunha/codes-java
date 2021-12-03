public class Quadrado extends PoligonoRegular {
    public Quadrado(double lado) {
        super(4, lado);
    }

    public double calculoArea() {
        return super.getLado() * super.getLado();
    }
}
