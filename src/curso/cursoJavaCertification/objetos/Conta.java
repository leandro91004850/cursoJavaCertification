package curso.cursoJavaCertification.objetos;

public class Conta {
	private int numero;
	private String titulo;
	private double saldo;

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprime() {
		System.out.println(titulo);
		System.out.println(saldo);
	}
	
	public void somador() {

	}

	
}
