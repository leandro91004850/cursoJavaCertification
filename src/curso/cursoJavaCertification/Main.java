package curso.cursoJavaCertification;

import curso.cursoJavaCertification.HttpConect.HttpURLConnectionExample;
import curso.cursoJavaCertification.Threads.ThreadsJava;
import curso.cursoJavaCertification.balancoEmpresa.BalancoEmpresa;
import curso.cursoJavaCertification.balancoEmpresa.BancoDeDados;
import curso.cursoJavaCertification.balancoEmpresa.Cnpj;
import curso.cursoJavaCertification.balancoEmpresa.Cpf;
import curso.cursoJavaCertification.balancoEmpresa.Divida;
import curso.cursoJavaCertification.balancoEmpresa.Pagamento;
import curso.cursoJavaCertification.balancoEmpresa.Pagamentos;
import curso.cursoJavaCertification.operadores.Operadores;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {
		BancoDeDados bd = new BancoDeDados("localhost", "usuario", "1234");
		//Arquivo bd = new Arquivo();
		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		registraDividas(balanco);
		realizaPagamentos(balanco);
		testeThreads();
		acessoHttp();

	
}
	private static void realizaPagamentos(BalancoEmpresa balanco) {
		Divida divida1 = new Divida();
		Divida divida2 = new Divida();
		
		divida1.setCredor("LeandroCorp");
		divida1.setDocumentoCredor(new Cnpj("0.000.001/0001-01"));
		divida1.setTotal(100);
	
		divida1.setCredor("roberto carlos");
		divida1.setDocumentoCredor(new Cpf("000.001.000-01"));
		divida1.setTotal(150);	
		
		balanco.registroDivida(divida1);
		balanco.registroDivida(divida2);
		
	}
	private static void registraDividas(BalancoEmpresa balanco) {
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		Operadores operadores = new Operadores();

		//operadores.operacoesIncremento();
		operadores.OperadoresDecrementoIncremento();
		pagamento1.setValor(105);
		pagamento2.setValor(252);
		
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);

		System.out.println("Valor total pago: " +pagamentos.getValorPago());
	}
	private static void testeThreads() throws InterruptedException {
		ThreadsJava threadsJava = new ThreadsJava();

		threadsJava.Threads();
	}

	private static void acessoHttp() throws IOException{
		HttpURLConnectionExample httpURLConnectionExample = new HttpURLConnectionExample();
		httpURLConnectionExample.acessoHttp();
	}
}
