public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setModelo("Uno");
        c1.setCor("Preto");
        c1.setAno(2017);
        c1.setMarca("Fiat");
        c1.setChassi("G52DI48G4U489G79");
        c1.setVelocidadeAtual(60);
        c1.setNumeroPortas(4);
        c1.setNumeroMarchas(5);
        c1.setPossuiCambioAutomatico(false);
        c1.setCapacidadeTanqueCombustivel(48);

        for (int i = 0; i < 5; i++) {
            c1.acelera();
        }

        System.out.println(c1);
    }
}
