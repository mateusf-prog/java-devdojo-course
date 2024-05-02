package curso.devdojo.maratonajava.javacore.associacao.exercicio.test;

import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Aluno;
import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Local;
import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Professor;
import curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Seminario;

public class ResolucaoExercicio {
    public static void main(String[] args) {
        Local local01 = new Local("Rua das abelhas, 123");
        Local local02 = new Local("Rua das agulhas, 321");

        Aluno aluno01 = new Aluno("Mateus", 26);
        Aluno aluno02 = new Aluno("Vinicius", 35);

        Seminario seminario01 = new Seminario("Palestra dev-fera", local01);
        Seminario seminario02 = new Seminario("Palestra programadores do passado", local02);

        Professor professor01 = new Professor("Willian Suane", "Tech-fera");

        aluno01.setSemiranio(seminario01);
        aluno02.setSemiranio(seminario02);

        Aluno[] alunos = {aluno01};
        seminario01.setAlunos(alunos);

        Seminario[] seminarios = {seminario01, seminario02};
        professor01.setSemiranios(seminarios);

        seminario01.imprime();
        System.out.println("\n");
        aluno01.imprime();
        System.out.println("\n");
        professor01.imprime();
        System.out.println("\n");

    }
}
