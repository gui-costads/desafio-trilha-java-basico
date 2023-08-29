package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();



        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da Conta!");
        BigDecimal saldo = sc.nextBigDecimal();

        conta.setAgencia(agencia);
        conta.setNumero(numeroConta);
        conta.setNomeCliente(nomeCliente);
        conta.setSaldo(saldo);

        System.out.println("Olá " + conta.getNomeCliente() +
                            " , obrigado por criar uma conta em nosso banco, sua agência é "
                            + conta.getAgencia()
                            + " , conta " + conta.getNumero()
                            + " e seu saldo " + String.format("%.2f",conta.getSaldo())
                            + "R$ já está disponível para saque."
                            );

    }
}