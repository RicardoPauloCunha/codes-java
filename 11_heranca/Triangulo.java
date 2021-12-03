public class Triangulo extends PoligonoRegular {
    private double base;
    private double altura;

    public Triangulo(double lado) {
        super(3, lado);
        setBase(lado);
        setAltura(lado * Math.sqrt(3) / 2);
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            this.base = 1;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double calculoArea() {
        return base * altura / 2;
    }
}
