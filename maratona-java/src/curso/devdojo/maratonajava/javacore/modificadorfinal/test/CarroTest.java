package curso.devdojo.maratonajava.javacore.modificadorfinal.test;

import curso.devdojo.maratonajava.javacore.modificadorfinal.dominio.Carro;

/**
 * Este é um exemplo de como o padrão Singleton é implementado em Java.
 * O padrão Singleton restringe a instanciação de uma classe a um único objeto.
 * Isso é alcançado declarando a referência à instância como final.
 *
 * Neste caso, a referência a COMPRADOR na classe Carro é declarada como final.
 * Isso significa que, uma vez que uma referência é atribuída a COMPRADOR, ela não pode ser alterada para apontar para outro objeto.
 * Por exemplo, a seguinte linha de código não seria possível:
 * carro.COMPRADOR = new Comprador(); // NÃO É POSSÍVEL
 *
 * Isso é conhecido como o padrão Singleton.
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
