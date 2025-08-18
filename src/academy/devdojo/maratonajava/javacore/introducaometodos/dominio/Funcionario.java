package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

// Crie uma classe funcionario com os seguintes atributos
// nome
// idade
// salario - > três salarios devem ser guardados

// Crie dois metodos
// Para imprimir os dados
// Para tirar a média dos salarios e imprimir o resultado


public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalario;

    public void imprimirDados() {
        System.out.println("-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(double salario: salarios){
            System.out.println("Salario: " + salario);
        }

    }

    public void mediaSalario(double[] salarios) {
        for (double salario : salarios) {
            mediaSalario += salario;
        }
        mediaSalario /= salarios.length;
        System.out.println("Média salarial: " + mediaSalario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

}
