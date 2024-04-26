package curso.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidade) {
        velocidadeLimite = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
}
