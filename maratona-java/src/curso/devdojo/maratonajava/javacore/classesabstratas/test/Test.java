package curso.devdojo.maratonajava.javacore.classesabstratas.test;

import curso.devdojo.maratonajava.javacore.classesabstratas.dominio.Desenvolvedor;
import curso.devdojo.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class Test {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("Mateus", 50);
        System.out.println(dev);
    }
}
