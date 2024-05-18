package curso.devdojo.maratonajava.javacore.polimorfismo.servico;

import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;

public class CalculadoraImposto {


    /**
     * Agora tem somente um método que calcula o imposto do Produto que vem no parâmetro, qualquer classe que herdar
     * de Produto, pode ser passada como parâmetro e o cálculo será feito.
     * @param produto
     */
    public static void calcularImposto(Produto produto) {
        System.out.println("--Relatório imposto--");
        double imposto = produto.calcularTaxa();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("imposto: " + imposto);
    }
}
