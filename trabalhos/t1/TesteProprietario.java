public class TesteProprietario {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario();
        p1.setNome("John");
        p1.setCpf("489.928.100-59");
        p1.setRg("19.261.628-6");
        p1.setDataNascimento("01/01/2001");
        p1.setRua("Octalles Marcondes");
        p1.setBairro("Helena Maria");
        p1.setCidade("Osasco");
        p1.setEstado("Sao Paulo");
        p1.setCep("06260-110");
        p1.setComplemento("Casa 1");

        Proprietario p2 = new Proprietario("Vivy", "666.132.800-20", "14.271.878-6");
        p2.setDataNascimento("12/12/2012");
        p2.setRua("Carvalho Ferreira");
        p2.setBairro("Munhoz Junior");
        p2.setCidade("Osasco");
        p2.setEstado("Sao Paulo");
        p2.setCep("06815-540");
        p2.setComplemento("");

        System.out.println(p1);
        System.out.println("\n" + p2);
    }
}
