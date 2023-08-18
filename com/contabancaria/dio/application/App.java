package com.contabancaria.dio.application;

import com.contabancaria.dio.entidade.ContaTerminal;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = sc.nextInt();
        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.nextLine();
        sc.nextLine();
        System.out.println("Por favor digite a agência!");
        String agencia = sc.nextLine();
        System.out.println("Digite agora o saldo inicial!");
        double saldo = sc.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(numeroConta, nomeCliente, agencia, saldo);

        System.out.println(contaTerminal);

        sc.close();
    }
}
