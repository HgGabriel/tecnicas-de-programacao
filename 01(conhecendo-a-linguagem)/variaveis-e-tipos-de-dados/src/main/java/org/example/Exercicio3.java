package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public void CalculadoraSalariosMinimos() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();


        System.out.print("Digite o valor do salário da pessoa: ");
        double salarioPessoa = scanner.nextDouble();

        double quantidadeSalarios = salarioPessoa / salarioMinimo;


        System.out.println("\nResumo:");
        System.out.println("Salário da pessoa: R$" + salarioPessoa);
        System.out.println("Valor do salário mínimo: R$" + salarioMinimo);
        System.out.println("A pessoa ganha aproximadamente " + quantidadeSalarios + " salários mínimos.");


    }
}
