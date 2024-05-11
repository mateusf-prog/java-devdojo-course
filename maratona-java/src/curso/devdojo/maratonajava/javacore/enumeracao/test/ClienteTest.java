package curso.devdojo.maratonajava.javacore.enumeracao.test;

import curso.devdojo.maratonajava.javacore.enumeracao.dominio.Cliente;
import curso.devdojo.maratonajava.javacore.enumeracao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente);
        System.out.println(cliente1);
    }
}
