package curso.cursoJavaCertification.service.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class EasyDesafioService {

    public static int firstUniqChar(String word) {
        //Dado um string word, encontre o primeiro caractere não repetido nele e retorne seu índice. Se não existir, retorne -1.
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char letra : word.toCharArray()) {
            mp.put(letra, mp.getOrDefault(letra, 0) + 1);
        }

        for (int i = 0; i < word.length(); i++) {
            if (mp.get(word.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void saidaTesteMaisMais() {
        int value = 10;
        int a = ++value;
        int b = value;
        int c = value++;

        if (a <= b && a >= c) {
            if (b <= c) {
                a = ++b;
            } else {
                a = ++c;
            }
        }
        System.out.println(a);
    }

    public static int verificarTrueFalse() {
       boolean  value1 = 10 + 5 >= 2 + 13;
       int value2 = 0;
       if(value1 ==  true){
           value2 = 5 * 3 + 10 / 2;
       } else {
           value2 = 5 / 3 + 10 * 2;
       }
       return value2;
    }

    public static void testeTrueAndFalse(){
        boolean b1 =  10 == 10 &&  ! (5 != 5); // true && false = false
        boolean b2 = 10 < 8 || 10 > 2; // false || true = true or true || false = true

        System.out.println(b1 + "\n" + b2);
    }

    public static String saidaArrayString(){
        String flavors[] =  {"vanilla", "chocalate"};
        int choice = 2;
        switch (choice) {
            case 1:
                return "select" + flavors[1] + "flavor";
            case 2:
                return "select" + flavors[2] + "flavor";
            default:
                return flavors[0];
        }
    }

    public static void saidaDivision(){
        int [] arr = {10, 0};
        int i = 0;
        try{
            int answer = arr[i] / arr[i + 1];
        } catch (ArithmeticException ae){
            System.out.println("valid divisor.");
        } catch (Exception e) {
            System.out.println("Arithmetic exception");
        }
    }

    public static void testRandom(){
        Random r1 = new Random(10);
        Random r2 = new Random(10); // line n1

        if(r1.nextInt() == r2.nextInt()){
            System.out.println("true " + r1.nextInt() + " " + r2.nextInt());
        } else {
            System.out.println("false " + r1.nextInt() + " " + r2.nextInt());
        }
    }

    public static void verificarTrueFalseString(){
            String a = "Java";
            String b = new String("Java");
            System.out.println(a.equals(b));
            System.out.println(a == b);
    }

    public static void doWhile(){
        int num = 100;
        int count = 0;
        do {
            num--;
            count++;
        } while (count > 1);
        System.out.println("num= "+ num);
    }

    public static void adicionandoRemovendoList(){
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.remove(2);
            list.set(3, "D");
            System.out.println(list);
    }

    public static void testandoSaidaRuntimeException(){
            int number = 1;
            String s = null;
            try {
                number = s.length();
                number += 2;
            } catch (RuntimeException e){
                number += 4;
            }

            System.out.println(number);
    }

    public static void testesComRemoveClear(){
            List<String> names = new ArrayList<>();
            names.add("Robb");
            names.add("Bran");
            names.remove(0);
            names.remove(0);
            System.out.println(names.isEmpty());
            names.add("Rickon");
            names.add("Bran");
            names.clear();
            System.out.println(names.isEmpty());
    }

    public static void sensitiveCase(){
        String inputFromConsole = " betaTeste ";
        String cleanInput;
        cleanInput = inputFromConsole.toUpperCase();
        cleanInput = cleanInput.trim();
        System.out.println("["+ cleanInput + "]");
    }

    public static void testeCompateTo(){

        String str1 = "foo-bars";
        String str2 = new String ("foo-bar");
        System.out.println(str1.equals(str2) + " ");
        System.out.println(str1 == str2);
        System.out.println(" " + str1.compareTo (str2));

        /* Se result for:
            Menor que 0: str1 é menor que str2.
            Igual a 0: str1 é igual a str2.
            Maior que 0: str1 é maior que str2.
        */

    }


}
