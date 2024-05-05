package curso.devdojo.maratonajava.javacore.sobresctrita.dominio;

public class Anime extends Object{

    private String name;

    public Anime() {
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anime: " + this.name;
    }
}
