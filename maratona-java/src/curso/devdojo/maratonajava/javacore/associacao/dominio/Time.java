package curso.devdojo.maratonajava.javacore.associacao.dominio;

public class Time {

    private String nome;
    private Jogador[] jogadores;

    public Time() {
    }

    public Time(String name) {
        this.nome = name;
    }

    public Time(String name, Jogador[] jogadores) {
        this.nome = name;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (jogadores == null) return;
        for (Jogador j : jogadores) {
            System.out.println(j.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
