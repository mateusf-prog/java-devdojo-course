package curso.devdojo.maratonajava.javacore.classesabstratas.dominio;

/**
 * Classe abstrata Funcionario herda a classe abstrata Pessoa, então os métodos abstratos em Pessoa
 * se não forem implementados em Funcionario, eles DEVEM ser implementados nas subclasses de Funcionario
 */
public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    /**
     * Um método que calcula o bônus, e que deve ser implementado na classe que
     * herda de Funcionario. Cada tipo de funionario(gerente, desenvolvedor, supervisor) pode implementar de sua
     * maneira desde que implemente.
     */
    public abstract void calcularBonus();


    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }
}
