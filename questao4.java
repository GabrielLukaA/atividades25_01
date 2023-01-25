package atividade25_01;
 import java.util.Scanner;
public class questao4 {
static Scanner in = new Scanner(System.in);
 public static void main(String[]args) {
	 double nota;
	 System.out.println("Informe a nota de um aluno: ");
	 nota = in.nextDouble();
	 System.out.println("Esse aluno possui classificação "+classificarNota(nota));
 }
 public static char classificarNota(double nota){
	char notaLetra='t';
	 if (nota>=9) {
		notaLetra='A';
	}
	 else if (nota>=8) {
		 notaLetra='B';
	 }
	 else if (nota>=7) {
		 notaLetra='C';
	 }
	 else if (nota>=6) {
		 notaLetra='D';
	 } else {
		 notaLetra='E';
	 }

	 
	 return notaLetra;
	}
}
