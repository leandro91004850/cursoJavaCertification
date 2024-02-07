package curso.cursoJavaCertification.service.estrutura_dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class EstruturaDadoService {

    public static void lerArquivo() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> urnas = new HashMap<>();// nao aceita repeticao de chave

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                //System.out.println(line);
                String[] fields = line.split(","); // separa a linha por virgula
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if(urnas.containsKey(name)) {
                    urnas.put(name, votes + urnas.get(name)); // soma com o valor armazenado na chave
                } else {
                    urnas.put(name, votes);
                }

                line = br.readLine();
            }

            System.out.println("Total votes:");
            for (String key : urnas.keySet()) {
                System.out.println(key + ": " + urnas.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }


}
