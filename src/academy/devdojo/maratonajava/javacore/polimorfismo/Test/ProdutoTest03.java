package academy.devdojo.maratonajava.javacore.polimorfismo.Test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("01/09/2025");
    }
}
