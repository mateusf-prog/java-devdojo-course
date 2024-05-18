package curso.devdojo.maratonajava.javacore.polimorfismo.test;

import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import curso.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class Test02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Mac M3", 12000);
        System.out.println("-----------------------");


        /**
         * Tomate tem tudo o que Produto tem, já que herda de Produto
         * porém não tem, por exemplo getDataValidade(), pois esse atributo/método pertence
         * somente a Tomate sendo assim impossível chamar a partir de produto  get/set datavalidade
         */
        Produto produto1 = new Tomate("Americano", 20);
        System.out.println(produto1.getNome());
        System.out.println(produto1.calcularTaxa());
    }
}
