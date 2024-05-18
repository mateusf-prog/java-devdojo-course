package curso.devdojo.maratonajava.javacore.polimorfismo.test;

import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import curso.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class Test {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Produto tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
