package academy.devdojo.maratonajava.javacore.sobrecargasmetodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargasmetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("D-Gray Man");
        anime.setTipo("Aventura");
        anime.setEpisodios(24);

        anime.imprime();
    }
}
