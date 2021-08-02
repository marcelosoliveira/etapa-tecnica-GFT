package etapa.tecnica.gft.aleatorio;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner scan = new Scanner(System.in);
		
		int number = gerador.nextInt(8);
		int index = 0;
		
		while(number != index) {
			System.out.print("Digite um numero: ");
			index = scan.nextInt();
		}
		System.out.println("\nACERTOU!!!");
		scan.close();
	}

}
