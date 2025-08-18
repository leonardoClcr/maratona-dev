package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();

        estudante01.nome = "Leo";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        estudante01.imprime();
    }
}
