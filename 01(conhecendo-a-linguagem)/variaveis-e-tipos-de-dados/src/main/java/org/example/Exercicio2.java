package org.example;

import java.util.Scanner;

public class Exercicio2 {

    public void CalculadoraMedia() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = scanner.nextFloat();


        System.out.print("Digite o segundo valor: ");
        float valor2 = scanner.nextFloat();


        float media = (valor1 + valor2) / 2;

        System.out.println("\nA média entre " + valor1 + " e " + valor2 + " é: " + media);
    }

}
