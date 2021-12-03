public class WebSite {
    private String nome;
    private String link;

    public WebSite (String nome, String link) {
        this.nome = nome;
        this.link = link;
    }
    
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "WebSite: [nome = " + this.nome + ", link = " + this.link + "]";
    }
}