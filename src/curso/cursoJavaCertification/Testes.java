package curso.cursoJavaCertification;
import com.google.api.GoogleAPIException;
import curso.cursoJavaCertification.service.leetcode.EasyDesafioService;
import curso.cursoJavaCertification.service.leetcode.OCFACertification1Z0811Service;

class Testes {

	private EasyDesafioService easyDesafioService;
	private OCFACertification1Z0811Service oCFACertification1Z0811Service;

	public static void main(String[] args){

		boolean sweet = false;
		int calories = sweet ? 200 : 100; // sweet contem true, logo calories = 200
		boolean sweetflag = (calories == 100 ? true : false);

		boolean hardcode = false;

		String value = sweetflag ? "Sweetend" : "Unsweetend";
		Object obj = sweetflag ? "Sweetend" : new Object();

}

}
