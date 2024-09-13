package curso.cursoJavaCertification.service.leetcode;

import curso.cursoJavaCertification.Repository.Animal;
import curso.cursoJavaCertification.objetos.model.Cachorro;

public class OCFACertification1Z0811Service {

    public static void somador(){
        String name = "John";
        int age = 25;
        System.out.printf("%s is %d years old\n", name, age);
    }

    public static void intefaceImplementsClass(){
         Animal animal = new Cachorro();
         animal.fazSom();
    }

    public static void variaveisPrimarias(){
        byte idade = 30;
        short altura = 170;
        int saldo = 5000;
        long distancia = 9876543210L;
        float temperatura = 23.5f;
        double pi = 3.141592653589793;
        char letra = 'J';
        boolean isProgramador = true;

        // Exibindo valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Saldo: " + saldo);
        System.out.println("Distância: " + distancia);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Valor de Pi: " + pi);
        System.out.println("Letra: " + letra);
        System.out.println("É programador? " + isProgramador);

    }

}
