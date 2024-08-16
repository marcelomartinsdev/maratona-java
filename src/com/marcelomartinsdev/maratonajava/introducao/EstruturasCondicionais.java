package com.marcelomartinsdev.maratonajava.introducao;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");
        int numero = 7;

        // Estrutura condicional if, else if, else
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");
        // Outro exemplo com múltiplas condições
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");
        int age = -10;

        // Estrutura condicional if, else if, else
        if (age > 0) {
            System.out.println("A age " + age + " é positiva.");
        } else if (age < 0) {
            System.out.println("A age " + age + " é negativa.");
        } else {
            System.out.println("A age é zero.");
        }

        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");

        //Operadores Ternarios

        double salario = 10000;
        String mensagemDoar = "Doar 500 para Marcelo";
        String mensagemNaoDoar = "Nao doar para Marcelo";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);


        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");
        // Exercicio

        //€ 0         € 34,712       9.70%
        //€ 34,713    € 68,507       37.35%
        //€ 68,508                   49.50%

        double salarioAnual = 70000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;

        if (salarioAnual <= 35.712) {
            salarioAnual *= primeiraFaixa;

        } else if (salarioAnual <= 68.507 && salarioAnual > 35.712) {
            salarioAnual *= segundaFaixa;

        } else {
            salarioAnual *= terceiraFaixa;
        }
        System.out.println("Salario final: " + salarioAnual);

        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7\n");
        int numero1 = scanner.nextInt();
        switch (numero1) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao Invalida!");
                break;
        }
    }
}
