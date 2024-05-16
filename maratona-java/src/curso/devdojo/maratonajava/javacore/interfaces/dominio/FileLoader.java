package curso.devdojo.maratonajava.javacore.interfaces.dominio;

public class FileLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }
}
