package curso.devdojo.maratonajava.javacore.associacao.test;

import curso.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import curso.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-----Jogador------");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("-----Time------");
        time.imprime();
    }
}
