package curso.devdojo.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {

    // todos os atributos em uma interface são CONSTANTES
    public static final int MAX_DATA_SIZE = 10;

    void load();

    /**
     * Criando um método em uma interface após a interface já ter sido implementada em outras partes do sistema,
     * fazendo assim o código não quebrar.
     */
    default void checkPermission() {
        System.out.println("Checando permissao...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro de retrieveMaxDataSize na interface");
    }
}
