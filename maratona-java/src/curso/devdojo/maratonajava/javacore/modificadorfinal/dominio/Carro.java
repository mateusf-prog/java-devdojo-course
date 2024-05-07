package curso.devdojo.maratonajava.javacore.modificadorfinal.dominio;

/**
 * Constantes não podem ter o valor alterado e normalmente vem acompanhado do metodo static
 * Por convenção, nome de constantes em Java é NESTE_PADRAO
 */
public class Carro {
    private String name;
    public static final int VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
