package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um exercicio para executar: ");
        String resp = input.nextLine();
        switch (resp) {
            case "1":
                Exercicio1 ex1 = new Exercicio1();
                ex1.CalculadoraDesconto();
                break;

            case "2":
                Exercicio2 ex2 = new Exercicio2();
                ex2.CalculadoraMedia();
                break;

            case "3":
                Exercicio3 ex3 = new Exercicio3();
                ex3.CalculadoraSalariosMinimos();
                break;

            case "4":
                Exercicio4 ex4 = new Exercicio4();
                ex4.CalculadoraVolumeLata();
                break;

            case "5":
                Exercicio5 ex5 = new Exercicio5();
                ex5.ConversorTemperatura();
                break;

            default:
                System.out.println("Exercicio Inválido");
                main(args);
        }
    }
}