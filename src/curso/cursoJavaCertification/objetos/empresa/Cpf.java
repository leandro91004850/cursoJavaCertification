package curso.cursoJavaCertification.objetos.empresa;

import curso.cursoJavaCertification.Repository.Documento;

public class Cpf implements Documento {
	private final String valor;
	
	public Cpf(String valor) {
		this.valor = valor;
		
	}
	
	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cpf)) {
			return false;
		}
		Cpf outro = (Cpf) obj;
		return this.valor.equals(outro.valor);
	}
	
	@Override
	public int hashCode() {
		return this.valor.hashCode();
	}
	
	public boolean ehValido() {
		return primeiroDigitoVerificadorCorreto() && segundoDigitoVerificadorCorreto();
	}

	private boolean segundoDigitoVerificadorCorreto() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean primeiroDigitoVerificadorCorreto() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
