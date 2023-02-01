package curso.cursoJavaCertification.service.empresa;

import curso.cursoJavaCertification.objetos.empresa.Divida;
import curso.cursoJavaCertification.objetos.empresa.Pagamento;

public class GerenciadorDeDividas {
	
	public void efetuaPagamento(Divida divida, String nomePagador, String cnpjPagador, double valor) {
		Pagamento pagamento = new Pagamento();// criando uma estancia
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
	    divida.registra(pagamento);
	}
}	
