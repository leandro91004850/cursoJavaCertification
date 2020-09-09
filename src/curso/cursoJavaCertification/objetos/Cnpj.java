package curso.cursoJavaCertification.objetos;

public class Cnpj {
	private String valor;
	
	public boolean ehValidado() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private int segundoDigitoCorreto() {
		return 2;
	}
	
	private int segundoDigitoVerificador() {
		return 2;
	}
	
	private int primeiroDigitoVerificador() {
		return 1;
	}
	
	private int primeiroDigitoCorreto() {
		return 1;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String novoValor) {
		this.valor = novoValor;
	}
	
	public String toString() {
		return this.valor;
	}
}
