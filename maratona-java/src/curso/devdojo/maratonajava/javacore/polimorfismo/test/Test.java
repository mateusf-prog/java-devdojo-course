package curso.devdojo.maratonajava.javacore.polimorfismo.test;

import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import curso.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class Test {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImpostTomate(tomate);
    }
}
