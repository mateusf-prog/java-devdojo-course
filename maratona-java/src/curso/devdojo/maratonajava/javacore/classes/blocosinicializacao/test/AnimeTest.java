package curso.devdojo.maratonajava.javacore.classes.blocosinicializacao.test;

import curso.devdojo.maratonajava.javacore.classes.blocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");
        System.out.println(anime.getEpisodios());

    }
}
