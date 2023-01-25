package atividade25_01;

import java.util.Scanner;
public class questao2 {
	static Scanner in = new Scanner(System.in);
	static float saldo;
	public static void main (String[]args) {
		
		int opcao=1;
		definirSaldoInicial();
		
for (;opcao!=0;opcao=opcao) {
		System.out.println("Menu\n");
System.out.println("1 - Sacar\n");
System.out.println("2 - Depositar\n");
System.out.println("0 - Encerrar programa");
opcao=in.nextInt();


switch (opcao) {
case 1: 
	sacar();
	break;
case 2:
	depositar();
	break;
case 0:
	break;
}
}

		
	}
public static void definirSaldoInicial () {
	System.out.println("Informe o seu saldo inicial: ");
	saldo = in.nextFloat();
}
public static void depositar() {
	float deposito;
	System.out.println("Quanto deseja depositar? ");
	deposito = in.nextFloat();
	saldo+=deposito;
	System.out.println("Seu saldo atual é R$ "+saldo);
	
}
public static void sacar() {
	float saque;
	System.out.println("Quanto você deseja sacar?");
	saque = in.nextFloat();
	if (saque<=saldo) {
		saldo=saldo-saque;
				System.out.println("Saque realizado, lhe restaram R$ "+saldo);
	} else {
		System.out.println("Saldo insuficiente.");
	}
}
}
