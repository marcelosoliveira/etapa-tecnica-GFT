package etapa.tecnica.gft.imposto;

public class Ipi implements Imposto {

	@Override
	public Double calculaImposto(double valor) {
	    if ( valor < 25000) {
	    	return valor * 0.05;	    	
	    }
	    return valor * 0.11;
	}

}
