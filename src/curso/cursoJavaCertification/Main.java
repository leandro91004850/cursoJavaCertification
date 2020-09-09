package curso.cursoJavaCertification;

import java.util.ArrayList;

import curso.cursoJavaCertification.objetos.Conta;
import curso.cursoJavaCertification.objetos.Pagamento;
import curso.cursoJavaCertification.objetos.Pagamentos;

public class Main {
	public static void main(String[] args){
		Conta conta = new Conta();
		conta.setTitulo("leandro");
		conta.setSaldo(1000.0);
		conta.imprime();
		
		Conta conta2 = new Conta();
		conta2.setTitulo("maria");
		conta2.setSaldo(5000.0);
		conta2.imprime();
		
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		pagamento1.setValor(105);
		pagamento2.setValor(25);

		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		
		System.out.println("valor total pago: " + pagamentos.getValorPago());
		

		
		
	}
}
