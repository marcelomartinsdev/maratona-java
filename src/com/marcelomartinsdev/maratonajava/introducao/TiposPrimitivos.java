package com.marcelomartinsdev.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        // Tipos primitivos
        byte exemploByte = 127;        // Valor máximo para byte
        short exemploShort = 32767;    // Valor máximo para short
        int exemploInt = 2147483647;   // Valor máximo para int
        long exemploLong = 9223372036854775807L; // Valor máximo para long (nota o 'L' no final)
        float exemploFloat = 3.14f;    // Nota o 'f' no final para indicar que é float
        double exemploDouble = 3.14159;
        boolean exemploBoolean = true;
        char exemploChar = 'A';

        // Imprimindo os valores
        System.out.println("Exemplo de byte: " + exemploByte);
        System.out.println("Exemplo de short: " + exemploShort);
        System.out.println("Exemplo de int: " + exemploInt);
        System.out.println("Exemplo de long: " + exemploLong);
        System.out.println("Exemplo de float: " + exemploFloat);
        System.out.println("Exemplo de double: " + exemploDouble);
        System.out.println("Exemplo de boolean: " + exemploBoolean);
        System.out.println("Exemplo de char: " + exemploChar);
    }
}
