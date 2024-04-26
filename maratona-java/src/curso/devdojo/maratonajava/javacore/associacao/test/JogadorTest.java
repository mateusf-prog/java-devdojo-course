package curso.devdojo.maratonajava.javacore.associacao.test;

import curso.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import curso.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador j : jogadores) {
            j.imprime();
        }

        System.out.println("\n");
        /***
         * Associação UNIDIRECIONAL, onde o jogador conhece o time mas o time nao conhece jogador
         */
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();

    }
}
