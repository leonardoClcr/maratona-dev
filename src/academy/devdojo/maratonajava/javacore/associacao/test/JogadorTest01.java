package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("Cristiano");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};
        for (Jogador nome: jogadores) {
            nome.imprime();
        }
    }
}
