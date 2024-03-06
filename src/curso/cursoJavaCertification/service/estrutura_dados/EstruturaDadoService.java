package curso.cursoJavaCertification.service.estrutura_dados;

import curso.cursoJavaCertification.objetos.model.Candidatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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

            urnas.forEach((key, value) -> System.out.println(key + ": " + value));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    public static List<Candidatos> vereadores(){
        List<Candidatos> vereador = List.of(
          new Candidatos("Joao", 200, 1),
          new Candidatos("Maria", 300, 2),
          new Candidatos("Jose", 400, 3),
          new Candidatos("Ana", 500, 4),
          new Candidatos("Pedro", 600, 5),
          new Candidatos("Leandro", 500, 2),
          new Candidatos("Ana", 300, 3)
        );

        return vereador;

    }

    public static void resultado_votacao(List<Candidatos> vereadores) {
        HashMap<String, Candidatos> resultado = new HashMap<>();

        for (Candidatos candidato : vereadores) {
            String nomeCandidato = candidato.getNome();
            if (resultado.containsKey(nomeCandidato)) {
                Candidatos candidatoExistente = resultado.get(nomeCandidato);
                candidatoExistente.setVotos(candidatoExistente.getVotos() + candidato.getVotos());
            } else {
                resultado.put(nomeCandidato, candidato);
            }
        }

        int maxValue = 0;
        String candidatoVencedor = "";

        for (Map.Entry<String, Candidatos> list : resultado.entrySet()) {
            if (list.getValue().getVotos() > maxValue) {
                maxValue = list.getValue().getVotos();
                candidatoVencedor = list.getKey();
            }
        }

        System.out.println("Candidato vencedor: " + candidatoVencedor + " com " + maxValue + " votos.");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                System.out.println("[" + i + ", " + numMap.get(complement) + "]");
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }

}
