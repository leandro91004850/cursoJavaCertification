package curso.cursoJavaCertification.objetos;

//\\Desktop-uj5tant\arquivados\Alura\3.LINGUAGEM JAVA\8. Cursos adicionais Java\2. curso de orientação a Objeto - melhores técnicas com Java\VIDEOS
public class Divida {

	private double total;
	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();
	
	public Documento getDocumentoCredor() {
		return documentoCredor;
	}
	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
		
	}

	public double getValorPago() {
		return pagamentos.getValorPago();
	}	

}
