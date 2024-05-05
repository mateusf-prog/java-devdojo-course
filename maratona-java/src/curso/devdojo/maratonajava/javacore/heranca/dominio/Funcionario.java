package curso.devdojo.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    /**
     * O modificador protected nos atributos de 'Pessoa', permite as subclasses, acesso direta a suas variáveis
     */
    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }
}
