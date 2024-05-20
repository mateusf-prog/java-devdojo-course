package curso.devdojo.maratonajava.javacore.polimorfismo.servico;

import curso.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memoria ....");
    }
}
