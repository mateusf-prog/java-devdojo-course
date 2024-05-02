package curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] semiranios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] semiranios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.semiranios = semiranios;
    }

    public void imprime() {
        System.out.println("Nome e especialidade professor: " + this.nome + ", " + this.especialidade);
        if (semiranios == null) return;
        for (Seminario s : semiranios) {
            System.out.println(s.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSemiranios() {
        return semiranios;
    }

    public void setSemiranios(Seminario[] semiranios) {
        this.semiranios = semiranios;
    }
}
