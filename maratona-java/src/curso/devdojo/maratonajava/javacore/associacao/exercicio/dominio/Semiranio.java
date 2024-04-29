package curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio;

public class Semiranio {

    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Semiranio(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Semiranio(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Titulo Seminario: " + this.titulo);
        System.out.println("Local Seminario: " + this.local.getEndereco());
        if (alunos == null) return;
        for (Aluno al : alunos) {
            System.out.println(al.getNome());
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
