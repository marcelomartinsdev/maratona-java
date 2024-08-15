package com.marcelomartinsdev.maratonajava.introducao;

public class Atribuicao {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Operador de atribuição simples
        int z = x;
        System.out.println("Atribuição simples: z = " + z);

        // Operador de atribuição com adição
        z += y; // Equivalente a z = z + y;
        System.out.println("Atribuição com adição (z += y): z = " + z);

        // Operador de atribuição com subtração
        z -= y; // Equivalente a z = z - y;
        System.out.println("Atribuição com subtração (z -= y): z = " + z);

        // Operador de atribuição com multiplicação
        z *= y; // Equivalente a z = z * y;
        System.out.println("Atribuição com multiplicação (z *= y): z = " + z);

        // Operador de atribuição com divisão
        z /= y; // Equivalente a z = z / y;
        System.out.println("Atribuição com divisão (z /= y): z = " + z);

        // Operador de atribuição com módulo
        z %= y; // Equivalente a z = z % y;
        System.out.println("Atribuição com módulo (z %= y): z = " + z);
    }
}
