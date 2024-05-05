package curso.devdojo.maratonajava.javacore.heranca.test;

import curso.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import curso.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import curso.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class Test {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-000");

        Pessoa pessoa = new Pessoa("Toyohisa");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("12345678998");

        pessoa.imprime();
        System.out.println("---------------");

        Funcionario funcionario = new Funcionario("Oda");
        funcionario.setCpf("2233322");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
