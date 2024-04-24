package lpa;

import java.util.Scanner;

public class Lpa5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int p=0, i=0, x=0, n;
		
		while (x<=9) {
			System.out.println("Informe um número");
			n=ler.nextInt();
			
			if(n%2!=0) {
				i=i+1;
			}
			else {
				p=p+1;
			}
			x++;
		}
		
		System.out.println("Quantidade de número pares: "+p);
		System.out.println("Quantidade de número ímpares: "+i);
		
		ler.close();
	}	

}