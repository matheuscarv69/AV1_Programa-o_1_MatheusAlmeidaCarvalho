package application;

import entities.Conta;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta1;

        String nome = "Matheus Carvalho";
        Integer numero = 252525;
        String agencia = "000510-8";
        Double saldo = 500.50;
        String dataAbertura = "12/05/2020";

        conta1 = new Conta(nome, numero, agencia, saldo, dataAbertura);
        System.out.println();
        System.out.println(conta1);

        System.out.println("Testando sacar R$ 100,00 e o toString");
        conta1.sacar(100.0);
        System.out.println();
        System.out.println(conta1);

        System.out.println("Testando depositar R$ 50.0");
        conta1.depositar(50.0);
        System.out.println();
        System.out.println(conta1);

        System.out.println("Criando conta 2");

        String nome2 = "Douglas Gomes";
        Integer numero2 = 123456;
        String agencia2 = "000524-9";
        Double saldo2 = 100.0;
        String dataAbertura2 = "24/04/2010";

        Conta conta2 = new Conta(nome2, numero2, agencia2, saldo2, dataAbertura2);
        System.out.println();
        System.out.println(conta2);

        System.out.println("Testando transferencia de R$ 20.0 da conta 1 para a conta 2");
        conta1.transferir(conta2, 20.0);
        System.out.println("Dados atualizados:");
        System.out.println("Conta 1");
        System.out.println(conta1);
        System.out.println("Conta 2");
        System.out.println(conta2);

        sc.close();
    }
}
