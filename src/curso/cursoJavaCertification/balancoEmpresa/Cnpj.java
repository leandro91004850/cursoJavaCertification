package curso.cursoJavaCertification.balancoEmpresa;

public class Cnpj implements Documento {
	private String valor;
	
	public Cnpj(String valor) {
		this.valor = valor;
	}
	
	public boolean ehValidado() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cnpj)) {
			return false;
		}
		Cnpj outro = (Cnpj) obj;
		return this.valor.equals(outro.valor);
	}
	
	public int hashCode() {
		return this.valor.hashCode();
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

	@Override
	public boolean ehValido() {
		// TODO Auto-generated method stub
		return false;
	}
}
