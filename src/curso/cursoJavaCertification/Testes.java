package curso.cursoJavaCertification;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;
import curso.cursoJavaCertification.service.leetcode.OCFACertification1Z0811Service;

class Testes {

	private EasyDesafioService easyDesafioService;
	private OCFACertification1Z0811Service oCFACertification1Z0811Service;

	public static void main(String[] args){
		OCFACertification1Z0811Service.somador();

		byte b1 = 1;
		byte b2 = ++b1;
		b2 = b1--;
		b1 *= b2;
		System.out.println(b1);


}

}
