package curso.devdojo.maratonajava.javacore.heranca.test;

import curso.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import curso.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class Test {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("12345678998");
    }
}
