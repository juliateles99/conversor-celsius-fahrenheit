package com.devjulia;

import java.util.Scanner;

/**
 * Conversor de Unidades
 * Descrição: Ferramenta para converter unidades de medida (por exemplo, de Celsius para Fahrenheit, de quilômetros para milhas).
 * Conceitos Abordados: Métodos, classes básicas, manipulação de strings.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que você deseja fazer?");

        System.out.println("1- Celsius ↔ Fahrenheit");
        System.out.println("2- Quilômetros ↔ Milhas");
        System.out.println("3- Sair");

        int operacao = scanner.nextInt();

        if (operacao == 3) {
            System.out.println("Encerrando..");
            return;
        }

        System.out.println("Digite o número que quer converter: ");
        double numeroConverte = scanner.nextDouble();

        switch (operacao) {
            case 1:
                System.out.println("1- Celsius para Fahrenheit");
                System.out.println("2- Fahrenheit para Celsius");
                int opcaoTemperatura = scanner.nextInt();

                if (opcaoTemperatura == 1) {
                    double fahrenheit = (numeroConverte * 1.8 + 32);
                    System.out.println("Fahrenheit: " + fahrenheit);
                } else if (opcaoTemperatura == 2) {
                    double celsius = (numeroConverte - 32) / 1.8;
                    System.out.println("Celsius: " + celsius);
                } else {
                    System.out.println("Opção inválida");
                }
                break;
            case 2:
                System.out.println("1- Quilometros para Milhas");
                System.out.println("2- Milhas para Quilometros");
                int opcaoDistancia = scanner.nextInt();

                if (opcaoDistancia == 1) {
                    double milhas = numeroConverte / 1.60934;
                    System.out.println("Milhas: " + milhas);
                } else if (opcaoDistancia == 2) {
                    double quilometros = numeroConverte * 1.60934;
                    System.out.println("Quilometros: " + quilometros);
                } else {
                    System.out.println("Opção inválida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        scanner.close();
    }
}