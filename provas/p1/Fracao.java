public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao() {

    }

    public Fracao(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public int setNumerador(int numerador) {
        return this.numerador = numerador;
    }

    public int setDenominador(int denominador) {
        return this.denominador = denominador;
    }

    public String toString() {
        return "Fracao: [numerador = " + this.getNumerador() + ", denominador = " + this.getDenominador() + "]";
    }

    public double DevolverValorDecimal() {
        return (double) this.getNumerador() / (double) this.getDenominador();
    }
}
