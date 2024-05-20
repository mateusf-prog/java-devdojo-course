package curso.devdojo.maratonajava.javacore.polimorfismo.test;

import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import curso.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class Test03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Mac M3", 12000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
