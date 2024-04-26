package curso.devdojo.maratonajava.javacore.associacao.dominio;

public class Escola {

    private String nome;
    private Professor[] professores;

    public Escola() {
    }

    public void imprime() {
        System.out.println("Escola: " + this.nome);
        if (professores != null) {
            for (Professor p : professores) {
                System.out.println("Professor: " + p.getName());
            }
        }
    }

    public Escola(String name) {
        this.nome = name;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
