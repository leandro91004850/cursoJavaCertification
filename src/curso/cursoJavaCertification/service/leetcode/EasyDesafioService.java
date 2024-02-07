package curso.cursoJavaCertification.service.leetcode;

import java.util.HashMap;

public class EasyDesafioService {
        public static int firstUniqChar(String word) {
            //Dado um string word, encontre o primeiro caractere não repetido nele e retorne seu índice. Se não existir, retorne -1.
            HashMap<Character, Integer> mp = new HashMap<>();

            for (char a : word.toCharArray()) {
                mp.put(a, mp.getOrDefault(a, 0) + 1);
            }

            for (int i = 0; i < word.length(); i++) {
                if (mp.get(word.charAt(i)) == 1) {
                    return i;
                }
            }

            return -1;
        }

}
