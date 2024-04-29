package curso.devdojo.maratonajava.javacore.associacao.exercicio.test;

import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Aluno;
import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Local;
import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Professor;
import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Semiranio;

public class ResolucaoExercicio {
    public static void main(String[] args) {
        Local local01 = new Local("Rua das abelhas, 123");
        Local local02 = new Local("Rua das agulhas, 321");

        Aluno aluno01 = new Aluno("Mateus", 26);
        Aluno aluno02 = new Aluno("Vinicius", 35);

        Semiranio semiranio01 = new Semiranio("Palestra dev-fera", local01);
        Semiranio semiranio02 = new Semiranio("Palestra programadores do passado", local02);

        Professor professor01 = new Professor("Willian Suane", "Tech-fera");

        aluno01.setSemiranio(semiranio01);
        aluno02.setSemiranio(semiranio02);

        Aluno[] alunos = {aluno01};
        semiranio01.setAlunos(alunos);

        Semiranio[] semiranios = {semiranio01, semiranio02};
        professor01.setSemiranios(semiranios);

        semiranio01.imprime();
        System.out.println("\n");
        aluno01.imprime();
        System.out.println("\n");
        professor01.imprime();
        System.out.println("\n");

    }
}
