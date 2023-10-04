package com.inatel.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServidorRemoto {
    public String getHorarioDeAtendimento() {
        try {
            // URL do servidor remoto que fornece o JSON de horário de atendimento
            URL url = new URL("URL_DO_SERVIDOR"); // Substitua pela URL real do servidor
            
            // conexão HTTP com o servidor
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");
            
            // Obtenha a resposta do servidor
            int responseCode = connection.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // A conexão foi bem-sucedida, leia o JSON da resposta
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                
                // Retorne o JSON obtido do servidor
                return response.toString();
            } else {
                // Tratar erros de conexão ou resposta inválida aqui
                return null;
            }
        } catch (IOException e) {
            /
            e.printStackTrace();
            return null;
        }
    }
}
