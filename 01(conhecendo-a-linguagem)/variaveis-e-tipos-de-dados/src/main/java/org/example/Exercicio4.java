package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public void CalculadoraVolumeLata() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o raio da lata: ");
        double raio = scanner.nextDouble();


        System.out.print("Digite a altura da lata: ");
        double altura = scanner.nextDouble();


        double volume = 3.14159 * Math.pow(raio, 2) * altura;


        System.out.println("\nO volume da lata de óleo é: " + volume);
    }
}
