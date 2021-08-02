package etapa.tecnica.gft.multiplicando;

import java.util.Scanner;

public class MultiplicandoIntervalo {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o Multiplicador: ");
		int multi = scan.nextInt();
		
		if (multi > 1000) throw new Exception("Multiplicador não pode ser maior que 1000!");
		
		System.out.print("Digite o intervalo inicial: ");
		int inicio = scan.nextInt();
		
		System.out.print("Digite o intervalo final: ");
		int fim = scan.nextInt();
		
		if (inicio > fim) throw new Exception("Intervalo de inicio não pode ser maior que o intervalo de fim!");		
		
		if (fim - inicio > 9) throw new Exception("Intervalo entre inicio e fim não pode ser maior que 10!");
		
		System.out.println("\n");
		System.out.println("Multiplicando: " + multi);
		System.out.println("Início do intervalo: " + inicio);
		System.out.println("Fim do intervalo: " + fim);
		
		try {
			
			for (int index = inicio; index <= fim; index++) {
				System.out.println(multi + " X " + index + " = " + (multi * index));
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
    scan.close();
	}

}
