package curso.cursoJavaCertification.controller;

import curso.cursoJavaCertification.service.HttpConect.HttpURLConnectionExample;
import curso.cursoJavaCertification.config.Threads.ThreadsJava;
import curso.cursoJavaCertification.objetos.empresa.*;
import curso.cursoJavaCertification.service.empresa.Operadores;
import curso.cursoJavaCertification.service.empresa.BalancoEmpresa;

import java.io.IOException;

public class ClasseControle {

    public static void realizaPagamentos(BalancoEmpresa balanco) {
        Divida divida1 = new Divida();
        Divida divida2 = new Divida();

        divida1.setCredor("LeandroCorp");
        divida1.setDocumentoCredor(new Cnpj("0.000.001/0001-01"));
        divida1.setTotal(100);

        divida1.setCredor("roberto carlos");
        divida1.setDocumentoCredor(new Cpf("000.001.000-01"));
        divida1.setTotal(150);

        balanco.registroDivida(divida1);
        balanco.registroDivida(divida2);

    }

    public static void registraDividas(BalancoEmpresa balanco) {
        Pagamentos pagamentos = new Pagamentos();
        Pagamento pagamento1 = new Pagamento();
        Pagamento pagamento2 = new Pagamento();
        Operadores operadores = new Operadores();

        //operadores.operacoesIncremento();
        operadores.OperadoresDecrementoIncremento();
        pagamento1.setValor(105);
        pagamento2.setValor(252);

        pagamentos.registra(pagamento1);
        pagamentos.registra(pagamento2);

        System.out.println("Valor total pago: " +pagamentos.getValorPago());
    }

    public static void testeThreads() throws InterruptedException {
        ThreadsJava threadsJava = new ThreadsJava();

        threadsJava.Threads();
    }

    public static void acessoHttp() throws IOException {
        HttpURLConnectionExample httpURLConnectionExample = new HttpURLConnectionExample();
        httpURLConnectionExample.acessoHttp();
    }

}
