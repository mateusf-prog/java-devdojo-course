package curso.devdojo.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {

    void load();

    /**
     * Criando um método em uma interface após a interface já ter sido implementada em outras partes do sistema,
     * fazendo assim o código não quebrar.
     */
    default void checkPermission() {
        System.out.println("Checando permissao...");
    }
}
