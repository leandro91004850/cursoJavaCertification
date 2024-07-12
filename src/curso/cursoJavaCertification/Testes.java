package curso.cursoJavaCertification;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;
import curso.cursoJavaCertification.service.leetcode.OCFACertification1Z0811Service;

class Testes {

	private EasyDesafioService easyDesafioService;
	private OCFACertification1Z0811Service oCFACertification1Z0811Service;

	static boolean a;
	static boolean b;
	static boolean c;

	public static void main(String[] args){
		OCFACertification1Z0811Service.somador();

		boolean bool = (a = true) || (b = true) && (c = true);
		System.out.println(a + ", " + b + ", " + c);


}

}
