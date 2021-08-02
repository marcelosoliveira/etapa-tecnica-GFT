package etapa.tecnica.gft.olimpico;

import java.util.LinkedList;
import java.util.Scanner;

public class AtletaMain {

	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		LinkedList<Atleta> atletas = new LinkedList<>();
		
		for (int index = 1; index <= 10; index++) {
			System.out.print("Digite o nome do Atleta " + index + ": ");
			String nome = scan.next();
			System.out.print("Digite o pais do Atleta " + index + ": ");
			String pais = scan.next();
			System.out.print("Digite o distancia(em metros) do Atleta " + index + ": ");
			Double distancia = Double.parseDouble(scan.next());
			Atleta atleta = new Atleta(nome, pais, distancia);
			atletas.add(atleta);
		}
		atletas.sort((d1, d2) -> d2.getDistancia().compareTo(d1.getDistancia()));
		System.out.println("Ouro: " + atletas.get(0).getNome() + 
				" - " + atletas.get(0).getPais() + " Resultado: " + atletas.get(0).getDistancia() + "m");
		System.out.println("Prata: " + atletas.get(1).getNome() + 
				" - " + atletas.get(1).getPais() + " Resultado: " + atletas.get(1).getDistancia() + "m");
		System.out.println("Bronze: " + atletas.get(2).getNome() + 
				" - " + atletas.get(2).getPais() + " Resultado: " + atletas.get(2).getDistancia() + "m");
		
		scan.close();
	}

}
