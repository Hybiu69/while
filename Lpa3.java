package lpa;

import java.util.Scanner;

public class Lpa3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Escreva um número: ");
		int n = ler.nextInt();
		int i=0;
		
		while(i<=n) {
			
			if (i%2!=0) {
				System.out.println("O número "+i+" é ímpar");
			}
			i++;
		}
				
		ler.close();
	}

}