package lpa;

import java.util.Scanner;

public class Lpa1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;

		System.out.println("Digite um número: ");
		n = ler.nextInt();

		while (n%2 !=0){
			System.out.println("O número digitado não é par. Digite novamente: ");
			n = ler.nextInt();

		}
		System.out.println("O número "+n+" é par");
		ler.close();
	}

}