package org.example;

import java.util.Scanner;

public class Exercicio1 {

    public void CalculadoraDesconto() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();


        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();


        double desconto = 0.09;
        double valorComDesconto = valorUnitario * (1 - desconto);


        System.out.println("\nResumo da compra:");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor original: R$" + valorUnitario);
        System.out.println("Desconto de 9%: R$" + (valorUnitario - valorComDesconto));
        System.out.println("Novo valor com desconto: R$" + valorComDesconto);
    }
}
