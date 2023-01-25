package atividade25_01;

import java.util.Scanner;

public class rua {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double posicaoInicial, posicaoFinal, distanciaPasso;

		System.out.println("Digite sua posição inicial: ");
		posicaoInicial=in.nextDouble();
		System.out.println("Digite em que distancia voce desejar chegar: ");
		posicaoFinal=in.nextDouble();
		System.out.println("Digite a distancia do seu passo: ");
		distanciaPasso=in.nextDouble();
		
		System.out.println("Serão necessários "+atravessaRua(posicaoInicial,posicaoFinal,distanciaPasso)+" passos.");
		
		
		
	}
	public static int atravessaRua (double X, double Y, double Z) {
	
		int passos;
		double distanciaAPercorrer=Y-X;
		for (passos=0;distanciaAPercorrer>0;passos++) {
			distanciaAPercorrer=distanciaAPercorrer-Z;
		}
	return passos;
		
	}
}
