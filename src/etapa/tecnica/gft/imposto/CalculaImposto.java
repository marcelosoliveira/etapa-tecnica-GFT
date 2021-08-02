package etapa.tecnica.gft.imposto;

import java.util.Scanner;

public class CalculaImposto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cofins cofins = new Cofins();
		Icms icms = new Icms();
		Ipi ipi = new Ipi();
		
		System.out.print("Digite o valor: ");
		double valor = scan.nextDouble();
		
		System.out.println("Calculo do COFINS: " + cofins.calculaImposto(valor));
		System.out.println("Calculo do ICMS: " + icms.calculaImposto(valor));
		System.out.println("Calculo do IPI: " + ipi.calculaImposto(valor));
		
		System.out.println("Soma de todos os impostos: "
				+ (cofins.calculaImposto(valor) + icms.calculaImposto(valor)
				+ ipi.calculaImposto(valor)));
		
		scan.close();
	}

}
