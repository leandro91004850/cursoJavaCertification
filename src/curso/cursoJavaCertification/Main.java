package curso.cursoJavaCertification;

import curso.cursoJavaCertification.objetos.Pagamento;
import curso.cursoJavaCertification.objetos.Pagamentos;

public class Main {
	public static void main(String[] args){
	
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		pagamento1.setValor(105);
		pagamento2.setValor(25);
		
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		
		System.out.println("Valor total pago: " +pagamentos.getValorPago());
		
		double armazenador = 0;
		int contador = 0;
		
		Iterable<Pagamento> lista = new Pagamentos();
		for(Pagamento pagamento: pagamentos) {
			contador ++;
			System.out.println("valor n"+contador+" R$"+pagamento.getValor());
			armazenador += pagamento.getValor();
		}
		System.out.println("total: "+armazenador);
	}
}
