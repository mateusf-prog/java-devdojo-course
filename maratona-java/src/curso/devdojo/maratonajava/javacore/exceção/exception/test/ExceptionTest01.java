package curso.devdojo.maratonajava.javacore.exceção.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }


    /**
     * Tratativa de IOException
     */
    private static void criarNovoArquivo() {

        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
