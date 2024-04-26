package curso.devdojo.maratonajava.javacore.associacao.test;

import curso.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import curso.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {

        /**
         * Associação muitos para um (1-N), onde a escola tem um array de professores
         * UNIDIRECIONAL porque a escola conhece os professores, mas os professor nao tem conhecimento da escola
         */
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
