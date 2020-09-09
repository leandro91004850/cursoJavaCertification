package curso.cursoJavaCertification;

import java.text.NumberFormat;
import java.util.Locale;

import curso.cursoJavaCertification.objetos.Divida;
import curso.cursoJavaCertification.objetos.Pagamento;
import curso.cursoJavaCertification.objetos.RelatorioDeDivida;

public class Main {
	public static void main(String[] args){
		
		Divida divida = new Divida();
		divida.setCredor("LeandroCorp");
		divida.setTotal(100);
		divida.getCnpjCredor().setValor("00.000.001/0001-01");
		
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador("00.000.001/0001-02");
		pagamento.setPagador("incorporion");
		pagamento.setValor(20);
		divida.registra(pagamento);
		
		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorio.geraRelatorio(formatador);
		

		
		
	}
}
