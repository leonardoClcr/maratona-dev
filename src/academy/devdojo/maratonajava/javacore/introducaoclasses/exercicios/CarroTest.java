package academy.devdojo.maratonajava.javacore.introducaoclasses.exercicios;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Onix";
        carro01.modelo = "Onix 1.0 hatch";
        carro01.ano = 2015;

        Carro carro02 = new Carro();
        carro02.nome = "Punto";
        carro02.modelo = "Fiat Punto 1.6";
        carro02.ano = 2022;

        System.out.print("O primeiro carro é:\n");
        System.out.println("Nome: " +carro01.nome);
        System.out.println("Modelo: " +carro01.modelo);
        System.out.println("Ano: " +carro01.ano);

        System.out.println("---------------");

        System.out.print("O segundo carro é:\n");
        System.out.println("Nome: " +carro02.nome);
        System.out.println("Modelo: " +carro02.modelo);
        System.out.println("Ano: " +carro02.ano);
    }
}
