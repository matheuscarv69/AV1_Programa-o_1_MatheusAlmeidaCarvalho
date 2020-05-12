package application;

import entities.Conta;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta1, conta2;
        boolean sit ;

        conta1 = new Conta("Matheus Carvalho", 252525, "000510-8", 0.0, "12/05/2020");
        System.out.println(conta1);

        conta2 = new Conta("Douglas Gomes", 123456, "000524-9", 0.0, "24/04/2010");
        System.out.println(conta2);

        System.out.println("Deposito de 500.00 na conta1");
        sit = conta1.depositar(500.00);
        System.out.println("Deposito conta1 : " + sit);
        System.out.println("Saldo conta1 : " + conta1.getSaldo());

        System.out.println("------------------");

        System.out.println("Deposito de 500.00 na conta2");
        sit = conta2.depositar(1000.00);
        System.out.println("Deposito conta2 : " + sit);
        System.out.println("Saldo conta2 : " + conta2.getSaldo());

        System.out.println("------------------");

        System.out.println("Saque conta1 de 250");
        sit = conta1.sacar(250.0);
        System.out.println("Saque efetuado: " + sit);
        System.out.println("Saldo conta1 : " + conta1.getSaldo());

        System.out.println("------------------");

        System.out.println("Transferencia conta2 de R$ 100 para conta1");
        sit = conta2.transferir(conta1 , 100.0);
        System.out.println("Transferencia efetuada: " + sit);

        System.out.println("------------------");

        System.out.println("Saldo conta1 após receber transferencia : " + conta1.getSaldo());
        System.out.println("Saldo conta2 após trasnferencia : " + conta2.getSaldo());

        System.out.println();
        System.out.println("Questão 3 e 4 Respondida");

        sc.close();
    }
}
