package curso.cursoJavaCertification.balancoEmpresa;

public class BalancoEmpresa {
	private BancoDeDados bd;
	
	public BalancoEmpresa(BancoDeDados bd) {
		this.bd = bd;
	}

	public void registroDivida(Divida divida) {
			bd.salva(divida);
	
	}
	
	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = bd.carrega(documentoCredor);
		if(divida != null) {
			divida.registra(pagamento);
			
		}
		bd.salva(divida);
	}

	
}
