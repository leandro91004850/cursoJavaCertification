package curso.cursoJavaCertification;


import curso.cursoJavaCertification.controller.ClasseControle;
import curso.cursoJavaCertification.service.empresa.BalancoEmpresa;
import curso.cursoJavaCertification.config.BancoDeDados;
import curso.cursoJavaCertification.service.estrutura_dados.EstruturaDadoService;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;


import java.io.IOException;

public class Main {

	private ClasseControle classeControle;
	private EasyDesafioService easyDesafioService;
	private EstruturaDadoService estruturaDadoService;
	public static void main(String[] args) throws InterruptedException, IOException {
		BancoDeDados bd = new BancoDeDados("localhost", "usuario", "1234");

		//BalancoEmpresa balanco = new BalancoEmpresa(bd);
		//ClasseControle.registraDividas(balanco);
		//ClasseControle.realizaPagamentos(balanco);
		//ClasseControle.testeThreads();
		//ClasseControle.acessoHttp();
		//System.out.println(EasyDesafioService.firstUniqChar("loveleetcode")); // leetcode, loveleetcode, aabb
		EstruturaDadoService.lerArquivo();


	
}

}
