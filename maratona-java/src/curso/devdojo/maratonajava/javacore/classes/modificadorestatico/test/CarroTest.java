package curso.devdojo.maratonajava.javacore.classes.modificadorestatico.test;

import curso.devdojo.maratonajava.javacore.classes.modificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c3.imprime();

        Carro.setVelocidadeLimite(380);
        System.out.println(Carro.getVelocidadeLimite());

        c1.imprime();
    }
}
