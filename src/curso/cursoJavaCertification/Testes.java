package curso.cursoJavaCertification;
import curso.cursoJavaCertification.service.Teste.TestRibeiroPretoService;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;
import curso.cursoJavaCertification.service.leetcode.OCFACertification1Z0811Service;

class Testes {

	private EasyDesafioService easyDesafioService;
	private OCFACertification1Z0811Service oCFACertification1Z0811Service;
	private TestRibeiroPretoService testRibeiroPretoService;

	public static void main(String[] args){
		//int i = 4;
		//while(i --> 0) System.out.println("i = " + i);
		TestRibeiroPretoService.reserve_order();
	}

}
