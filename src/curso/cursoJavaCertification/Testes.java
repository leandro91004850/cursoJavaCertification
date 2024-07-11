package curso.cursoJavaCertification;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;
import curso.cursoJavaCertification.service.leetcode.OCFACertification1Z0811Service;

class Testes {

	private EasyDesafioService easyDesafioService;
	private OCFACertification1Z0811Service oCFACertification1Z0811Service;

	public static void main(String[] args){
		OCFACertification1Z0811Service.somador();

		int a = 2;
		int b = 5;
		int c = a * (a++ - --b) * a + b;
		System.out.println(a+" " + b + " " + c);
}

}
