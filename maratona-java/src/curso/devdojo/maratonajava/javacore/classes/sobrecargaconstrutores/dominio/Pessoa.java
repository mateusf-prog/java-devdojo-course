package curso.devdojo.maratonajava.javacore.classes.sobrecargaconstrutores.dominio;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;
    private int peso;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char sexo) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, char sexo, int peso) {
        this(nome, idade, sexo);
        this.peso = peso;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", peso=" + peso +
                '}';
    }
}
