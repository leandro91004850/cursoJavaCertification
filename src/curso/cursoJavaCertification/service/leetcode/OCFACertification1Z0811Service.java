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

}
