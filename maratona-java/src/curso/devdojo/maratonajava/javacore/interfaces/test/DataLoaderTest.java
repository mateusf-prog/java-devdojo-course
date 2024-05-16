package curso.devdojo.maratonajava.javacore.interfaces.test;

import curso.devdojo.maratonajava.javacore.interfaces.dominio.DataLoader;
import curso.devdojo.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import curso.devdojo.maratonajava.javacore.interfaces.dominio.FileLoader;


public class DataLoaderTest {
    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        // permissao sendo checada a nível de interface
        databaseLoader.checkPermission();

        // método checkPermission está sobrescrito
        fileLoader.checkPermission();


        // acessando diretamente os métodos da interface e da classe, que são indepentendes um do outro
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
