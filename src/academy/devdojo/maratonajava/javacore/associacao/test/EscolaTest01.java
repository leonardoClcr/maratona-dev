package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Kakashi");
        Professor professor02 = new Professor("Jiraya");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
