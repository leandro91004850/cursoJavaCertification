package curso.cursoJavaCertification.service.estrutura_dados;

import curso.cursoJavaCertification.objetos.model.Candidatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EstruturaDadoService {

    public static void lerArquivo() {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        HashMap<String, Candidatos> urnas = new HashMap<>();// nao aceita repeticao de chave

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                //System.out.println(line);
                String[] fields = line.split(","); // separa a linha por virgula
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                Candidatos candidato = new Candidatos();
                candidato.setNome(name);
                candidato.setIdentificador(rnd.nextInt(1211));

                if(urnas.containsKey(name)) {
                    candidato.setVotos(urnas.get(name).getVotos() + votes);
                    urnas.put(name, candidato);
                } else {
                    urnas.put(name, candidato);
                }

                line = br.readLine();
            }

           /* System.out.println("Total votes:");
            for (String key : urnas.keySet()) {
                System.out.println(key + ": " + urnas.get(key));
            }*/

            urnas.forEach((key, value) -> {
                System.out.println(key + ": " + value);
            });

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }


}
