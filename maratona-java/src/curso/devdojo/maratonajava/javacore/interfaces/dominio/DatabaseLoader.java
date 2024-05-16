package curso.devdojo.maratonajava.javacore.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro de retrieveMaxDataSize na classe");
    }
}
