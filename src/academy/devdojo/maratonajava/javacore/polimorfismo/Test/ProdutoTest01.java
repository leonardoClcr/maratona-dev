package academy.devdojo.maratonajava.javacore.polimorfismo.Test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac-01", 11000);
        Tomate tomate = new Tomate("Normal", 2.50);
        Televisao televisao = new Televisao("Roku TV", 1500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
