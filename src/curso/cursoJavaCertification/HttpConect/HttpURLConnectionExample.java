package curso.cursoJavaCertification.HttpConect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

    public void acessoHttp() throws IOException {

        String urlString = "url";
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestProperty("Authorization","Bearer "+"inserir o token");

        conn.setRequestProperty("Content-Type","application/json");
        conn.setRequestMethod("POST");

        BufferedReader LendoFluxoEntrada = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String output;

        StringBuffer response = new StringBuffer();
        while ((output = LendoFluxoEntrada.readLine()) != null) {
            response.append(output);
        }

        LendoFluxoEntrada.close();
        System.out.println("testando acesso");
        System.out.println("Resposta:-" + response.toString());

    }
}
