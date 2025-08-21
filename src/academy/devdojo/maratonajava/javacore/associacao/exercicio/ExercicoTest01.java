package academy.devdojo.maratonajava.javacore.associacao.exercicio;

public class ExercicoTest01 {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Leonardo", 27);
        Local local01 = new Local("Poços de Caldas - MG");
        Professor professor01 = new Professor("Jiraya", "Jutsu");
        Seminario seminario01 = new Seminario("Historia do Xadrez", local01);

        Aluno[] alunos = {aluno01};
        Seminario[] seminarios = {seminario01};

        aluno01.setSeminario(seminario01);
        aluno01.imprime();
        System.out.println("-------------");
        professor01.setSeminarios(seminarios);
        professor01.imprimir();

    }
}
