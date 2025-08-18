package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Leonardo");
        pessoa01.setIdade(27);

        pessoa01.imprime();
    }
}
