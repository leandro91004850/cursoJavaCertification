package curso.cursoJavaCertification.service.leetcode;

import java.util.HashMap;

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


}
