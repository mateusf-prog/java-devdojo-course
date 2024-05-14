package curso.devdojo.maratonajava.javacore.classesabstratas.dominio;

public abstract class Funcionario {

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

}
