package curso.cursoJavaCertification.balancoEmpresa;

import java.text.NumberFormat;

public class RelatorioDeDivida {
	private final Divida divida;
	
	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;	
	}
	
	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("Cnpj Credor: " + divida.getDocumentoCredor());
		System.out.println("Credor: " + divida.getCredor());
		
		System.out.println("Valor da divida: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: "+ formatador.format(divida.getValorPago()));
	}
	
}
