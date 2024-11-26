package br.com.exercicio2;

public class Aluno {
    private String rm;
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String rm, String nome, int idade, double nota1, double nota2) {
        this.rm = rm;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getRm() {
        return rm;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RM='" + rm + '\'' +
                ", Nome='" + nome + '\'' +
                ", Idade=" + idade +
                ", Média=" + getMedia() +
                '}';
    }
}

