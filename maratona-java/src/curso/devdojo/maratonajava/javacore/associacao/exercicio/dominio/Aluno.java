package curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio;

public class Aluno {

    private String nome;
    private int idade;
    private Seminario semiranio;

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario semiranio) {
        this.nome = nome;
        this.idade = idade;
        this.semiranio = semiranio;
    }

    public void imprime() {
        System.out.println("Nome e idade do Aluno: " + this.nome + ", " + this.idade);
        System.out.println("Seminario: " + this.semiranio.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSemiranio() {
        return semiranio;
    }

    public void setSemiranio(Seminario semiranio) {
        this.semiranio = semiranio;
    }
}
