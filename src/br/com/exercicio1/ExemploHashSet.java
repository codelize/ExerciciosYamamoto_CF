package br.com.exercicio1;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> alunos = new HashSet<>();

        // Adicionando elementos
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carlos");

        // Exibindo os elementos
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
