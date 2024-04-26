package curso.devdojo.maratonajava.javacore.sobrecargaconstrutores.test;

import curso.devdojo.maratonajava.javacore.sobrecargaconstrutores.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Mateus", 26, 'M', 65);
        System.out.println(pessoa1);
    }
}
