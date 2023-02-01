package curso.cursoJavaCertification;


import curso.cursoJavaCertification.controller.ClasseControle;
import curso.cursoJavaCertification.service.empresa.BalancoEmpresa;
import curso.cursoJavaCertification.config.BancoDeDados;


import java.io.IOException;

public class Main {

	private ClasseControle classeControle;
	public static void main(String[] args) throws InterruptedException, IOException {
		BancoDeDados bd = new BancoDeDados("localhost", "usuario", "1234");

		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		ClasseControle.registraDividas(balanco);
		ClasseControle.realizaPagamentos(balanco);
		ClasseControle.testeThreads();
		//ClasseControle.acessoHttp();

	
}

}
