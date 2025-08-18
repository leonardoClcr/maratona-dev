package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Leo");
        funcionario01.setIdade(27);
        funcionario01.setSalarios(new double[]{1500,2000,2200});

        funcionario01.imprimirDados();
        funcionario01.mediaSalario(funcionario01.getSalarios());
    }
}
