package curso.cursoJavaCertification;


import curso.cursoJavaCertification.controller.ClasseControle;
import curso.cursoJavaCertification.service.empresa.BalancoEmpresa;
import curso.cursoJavaCertification.config.BancoDeDados;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;


import java.io.IOException;

public class Main {

	private ClasseControle classeControle;
	private EasyDesafioService easyDesafioService;
	public static void main(String[] args) throws InterruptedException, IOException {
		BancoDeDados bd = new BancoDeDados("localhost", "usuario", "1234");

		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		ClasseControle.registraDividas(balanco);
		ClasseControle.realizaPagamentos(balanco);
		ClasseControle.testeThreads();
		System.out.println(EasyDesafioService.firstUniqChar("loveleetcode")); // leetcode, loveleetcode, aabb
		//ClasseControle.acessoHttp();

	
}

}
