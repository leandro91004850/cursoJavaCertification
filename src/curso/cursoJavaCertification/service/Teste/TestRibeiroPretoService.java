package curso.cursoJavaCertification.service.Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRibeiroPretoService {

    public static int valorSoma(int indice, int soma, int k){

        for(int i = 0; i < indice; i++){
             k = k + 1;
             soma = soma + k;
        }
        System.out.println("Ao final do processamento, qual será o valor da variável SOMA? \nResposta: " +soma);
        return soma;
    }

    public static List<Integer> list_fibonacci(int primeiro, int segundo){
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(primeiro);
        fibonacci.add(segundo);
        for(int i = 0; i < 8; i++){
            fibonacci.add(fibonacci.get(i) + fibonacci.get(i+1));
        }
        System.out.println("Sequência fibonacci: " + fibonacci);
        return fibonacci;
    }

    public static String verificar_numero_list_fibonacci(List<Integer> list_fibonacci, int numero_digitado){

        if(list_fibonacci.contains(numero_digitado)){
            return "O Número " + numero_digitado + " Contem sequência fibonacci";
        }else {
            return "O Número " + numero_digitado + " Não contem sequência fibonacci";
        }

    }

    public static void fibonacci() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero para criação list fibonacci: ");
        int primeiro = input.nextInt();
        System.out.println("Digite o segundo número para criação list fibonacci: ");
        int segundo = input.nextInt();
        System.out.println("Digite um número para verificamos na lista fibonacci criada: ");
        int CheckNumberListFibonacci = input.nextInt();
        System.out.println(verificar_numero_list_fibonacci(list_fibonacci(primeiro, segundo), CheckNumberListFibonacci));
    }

    public static String invertString(String palavra){
        List<Character> test = new ArrayList<>();
        String montarPalavraInvertida = "";

        for(int i = 0; i < palavra.length(); i++){
            test.add(palavra.charAt(i));
        }


        for(int i = test.size() - 1; i >= 0; i--){
            String palavraAleartoria = montarPalavraInvertida + test.get(i);
            montarPalavraInvertida = palavraAleartoria;
        }

        return montarPalavraInvertida;
    }



}
