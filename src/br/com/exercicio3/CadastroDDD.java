package br.com.exercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class CadastroDDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Estado> estados = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir estado e DDDs");
            System.out.println("2. Consultar DDDs de um estado");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> incluirEstadoEDDD(estados, scanner);
                case 2 -> consultarDDDs(estados, scanner);
                case 3 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void incluirEstadoEDDD(HashMap<String, Estado> estados, Scanner scanner) {
        System.out.print("Informe a sigla do estado (ex: SP, RJ): ");
        String sigla = scanner.next().toUpperCase();

        // Verificar se o estado já existe, se não, inicializar
        estados.putIfAbsent(sigla, new Estado(sigla));

        while (true) {
            System.out.print("Digite um DDD para adicionar ou -1 para finalizar: ");
            int ddd = scanner.nextInt();
            if (ddd == -1) {
                break;
            }
            estados.get(sigla).adicionarDdd(ddd);
            System.out.println("DDD " + ddd + " adicionado ao estado " + sigla + ".");
        }
    }

    private static void consultarDDDs(HashMap<String, Estado> estados, Scanner scanner) {
        System.out.print("Informe a sigla do estado (ex: SP, RJ): ");
        String sigla = scanner.next().toUpperCase();

        if (estados.containsKey(sigla)) {
            System.out.println(estados.get(sigla));
        } else {
            System.out.println("Estado não encontrado.");
        }
    }
}
