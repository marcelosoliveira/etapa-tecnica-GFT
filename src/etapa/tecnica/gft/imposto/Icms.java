package etapa.tecnica.gft.imposto;

public class Icms implements Imposto {

	@Override
	public Double calculaImposto(double valor) {
		return valor * 0.27;
	}

}
