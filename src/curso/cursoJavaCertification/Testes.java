package curso.cursoJavaCertification;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;
import curso.cursoJavaCertification.service.leetcode.OCFACertification1Z0811Service;

class Testes {

	private EasyDesafioService easyDesafioService;
	private OCFACertification1Z0811Service oCFACertification1Z0811Service;

	public static void main(String[] args){
		OCFACertification1Z0811Service.somador();

		int result1 = 2-(3+4);
		int result2 = 2-3+4;
		System.out.println(result1 + " \n" + result2);


}

}
