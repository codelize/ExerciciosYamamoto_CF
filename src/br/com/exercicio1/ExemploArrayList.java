package br.com.exercicio1;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

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
