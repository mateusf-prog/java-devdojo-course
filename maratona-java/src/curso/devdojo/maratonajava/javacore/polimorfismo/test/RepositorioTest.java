package curso.devdojo.maratonajava.javacore.polimorfismo.test;

import curso.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import curso.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioArquivo;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {

    public static void main(String[] args) {

        /** -- Programação Orientada a interfaces --
         * troca somente o tipo do objeto. Não precisa ficar trocando o tipo da variável de referência
         */

        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        List<String> lista = new LinkedList<>();
        lista.add("Goku");


    }
}
