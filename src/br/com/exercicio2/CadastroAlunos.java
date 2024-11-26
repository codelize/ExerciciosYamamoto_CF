package br.com.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Exibir informações dos alunos");
            System.out.println("3. Imprimir alunos e médias");
            System.out.println("4. Alunos com média acima de 6.0");
            System.out.println("5. Alunos com idade acima de 30 anos");
            System.out.println("6. Excluir alunos com média menor que 3.0");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cadastrarAluno(alunos, scanner);
                case 2 -> exibirInformacoes(alunos);
                case 3 -> imprimirAlunos(alunos);
                case 4 -> filtrarPorMedia(alunos);
                case 5 -> filtrarPorIdade(alunos);
                case 6 -> excluirPorMedia(alunos);
                case 7 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarAluno(ArrayList<Aluno> alunos, Scanner scanner) {
        System.out.print("RM: ");
        String rm = scanner.next();
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        alunos.add(new Aluno(rm, nome, idade, nota1, nota2));
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void exibirInformacoes(ArrayList<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        int total = alunos.size();
        double somaNotas = 0, somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        for (Aluno aluno : alunos) {
            somaNotas += aluno.getMedia();
            somaIdades += aluno.getIdade();
            maiorIdade = Math.max(maiorIdade, aluno.getIdade());
            menorIdade = Math.min(menorIdade, aluno.getIdade());
        }

        System.out.println("Total de alunos: " + total);
        System.out.println("Média geral das notas: " + (somaNotas / total));
        System.out.println("Média geral das idades: " + (somaIdades / total));
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
    }

    private static void imprimirAlunos(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private static void filtrarPorMedia(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() > 6.0) {
                System.out.println(aluno.getNome());
            }
        }
    }

    private static void filtrarPorIdade(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            if (aluno.getIdade() > 30) {
                System.out.println(aluno.getNome());
            }
        }
    }

    private static void excluirPorMedia(ArrayList<Aluno> alunos) {
        alunos.removeIf(aluno -> aluno.getMedia() < 3.0);
        System.out.println("Alunos com média menor que 3.0 foram excluídos.");
    }
}

