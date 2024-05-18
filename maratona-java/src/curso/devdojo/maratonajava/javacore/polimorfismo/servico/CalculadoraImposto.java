package curso.devdojo.maratonajava.javacore.polimorfismo.servico;

import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularTaxa();
        System.out.println("Imposto do computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularTaxa();
        System.out.println("Imposto do tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
