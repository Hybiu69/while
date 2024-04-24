package lpa;

import java.util.Scanner;

public class Lpa4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double i=0, s=0, m,n;
		
		while (i<5) {
			i++;
			System.out.println("Informe a nota");
			n=ler.nextDouble();
			s=s+n;
		}
		m=s/5;
		System.out.println("A média é: "+m);
		System.out.println("A soma é: "+s);
		ler.close();
	}

}