package com.marcelomartinsdev.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operadores aritméticos
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        // Imprimindo os resultados
        System.out.println("Operadores Aritmedicos \n");
        System.out.println("Soma: " + a + " + " + b + " = " + soma);
        System.out.println("Subtração: " + a + " - " + b + " = " + subtracao);
        System.out.println("Multiplicação: " + a + " * " + b + " = " + multiplicacao);
        System.out.println("Divisão: " + a + " / " + b + " = " + divisao);
        System.out.println("Módulo (resto da divisão): " + a + " % " + b + " = " + modulo);


        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");

        // Operadores relacionais
        int x = 10;
        int y = 20;

        boolean igual = x == y;
        boolean diferente = x != y;
        boolean maior = x > y;
        boolean menor = x < y;
        boolean maiorOuIgual = x >= y;
        boolean menorOuIgual = x <= y;

        // Imprimindo os resultados
        System.out.println("Operadores Relacionais \n");
        System.out.println("Igualdade: " + x + " == " + y + " -> " + igual);
        System.out.println("Diferença: " + x + " != " + y + " -> " + diferente);
        System.out.println("Maior que: " + x + " > " + y + " -> " + maior);
        System.out.println("Menor que: " + x + " < " + y + " -> " + menor);
        System.out.println("Maior ou igual: " + x + " >= " + y + " -> " + maiorOuIgual);
        System.out.println("Menor ou igual: " + x + " <= " + y + " -> " + menorOuIgual);

        System.out.println("\n |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n");

        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        boolean resultadoE = condicao1 && condicao2;  // E lógico (AND)
        boolean resultadoOu = condicao1 || condicao2; // OU lógico (OR)
        boolean resultadoNao = !condicao1;            // NÃO lógico (NOT)

        // Imprimindo os resultados
        System.out.println("Operadores Logicos \n");
        System.out.println("E lógico (AND): " + condicao1 + " && " + condicao2 + " -> " + resultadoE);
        System.out.println("OU lógico (OR): " + condicao1 + " || " + condicao2 + " -> " + resultadoOu);
        System.out.println("NÃO lógico (NOT): !" + condicao1 + " -> " + resultadoNao);

        // Exemplo combinado de operadores lógicos
        boolean resultadoCombinado = (condicao1 && condicao2) || (condicao1 && !condicao2);
        System.out.println("Combinado: (" + condicao1 + " && " + condicao2 + ") || (" + condicao1 + " && !" + condicao2 + ") -> " + resultadoCombinado);
    }
}
