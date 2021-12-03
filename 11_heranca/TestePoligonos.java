public class TestePoligonos {
    public static void main(String[] args) {
        PoligonoRegular[] poligonos = new PoligonoRegular[4];

        poligonos[0] = new Quadrado(5);
        poligonos[1] = new Triangulo(4);
        poligonos[2] = poligonos[1];
        poligonos[3] = new Quadrado(5);

        for (PoligonoRegular p : poligonos) {
            System.out.println(p.getClass().getName());
            System.out.println("area = " + String.format("%.3f", p.calculoArea()));
            System.out.println("perimetro = " + String.format("%.3f", p.calculoPerimetro()));
        }

        for (int i = 0; i < poligonos.length; i++) {
            System.out.println("hashcode do objeto poligonos[" + i + "]: " + Integer.toHexString(poligonos[i].hashCode()));
            if (poligonos[0].equals(poligonos[i])) {
                System.out.println("figura 0 igual figura " + i);
            } else {
                System.out.println("figura 0 diferente figura " + i);
            }
        }
    }
}
