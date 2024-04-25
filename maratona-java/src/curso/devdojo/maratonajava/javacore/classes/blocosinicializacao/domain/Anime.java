package curso.devdojo.maratonajava.javacore.classes.blocosinicializacao.domain;

import java.util.ArrayList;
import java.util.List;

public class Anime {

    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for (int i=0; i<episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        episodios = new int[100];
        for (int i=0; i<episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integer> getEpisodios() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int e : this.episodios) {
            list.add(e);
        }
        return list;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
