package curso.devdojo.maratonajava.javacore.enumeracao.test;

import curso.devdojo.maratonajava.javacore.enumeracao.dominio.Cliente;
import curso.devdojo.maratonajava.javacore.enumeracao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        System.out.println(cliente);
        System.out.println(cliente1);
    }
}
