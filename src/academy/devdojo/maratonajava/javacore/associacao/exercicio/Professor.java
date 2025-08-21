package academy.devdojo.maratonajava.javacore.associacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir() {
        System.out.println("--- DADOS DO PROFESSOR ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println("Seminario: " + seminario.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
