package curso.devdojo.maratonajava.javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo");
    }

    /**
     * É possível sobrescrever um método default da interface
     */
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
