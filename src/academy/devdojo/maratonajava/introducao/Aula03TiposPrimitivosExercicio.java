package academy.devdojo.maratonajava.introducao;
/*
* Prática
*
* Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte
* mensagem
*
* Eu <nome>, morando no endereço <endereço>,
* confirmo que recebi o salario de <salario>, na data <data>
* */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Leonardo";
        String endereco = "Rua Nelo Viti, 26, Santa Augusta";
        double salario = 2500.00;
        String data = "11/08/2025";

        System.out.println("Eu " +nome+ ", morando no endereço " +endereco+ ", confirmo que recebi o salario de " +salario+ ", na data " +data);
    }
}
