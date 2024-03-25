package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public void ConversorTemperatura() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();


        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;


        System.out.println("\nA temperatura em Fahrenheit é: " + temperaturaFahrenheit);

    }
}
