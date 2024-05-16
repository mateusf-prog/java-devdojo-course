package curso.devdojo.maratonajava.javacore.interfaces.test;

import curso.devdojo.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import curso.devdojo.maratonajava.javacore.interfaces.dominio.FileLoader;


public class DataLoaderTest {
    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
    }
}
