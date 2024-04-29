package curso.devdojo.maratonajava.javacore.associacao.exercicio.dominio;

public class Local {

    private String endereco;

    public Local() {
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Endereço: " + this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
