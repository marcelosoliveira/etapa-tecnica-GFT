package etapa.tecnica.gft.imposto;

public class Cofins implements Imposto {

	@Override
	public Double calculaImposto(double valor) {
		if (valor > 13000) {
		return valor * 0.04;
	    }
		
	return valor;
    }
	
}
