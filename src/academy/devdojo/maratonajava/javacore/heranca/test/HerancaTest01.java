package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("37-701-232");
        endereco.setRua("Rua Teste 01");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Leo");
        pessoa.setCpf("113.640.798-08");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Test01");
        funcionario.setCpf("111.111-01");

    }
}
