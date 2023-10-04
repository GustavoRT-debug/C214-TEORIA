package com.inatel.web;

public class HorarioAtendimentoPopulator {
    private ServidorRemoto servidorRemoto;

    public HorarioAtendimentoPopulator(ServidorRemoto servidorRemoto) {
        this.servidorRemoto = servidorRemoto;
    }

    public boolean populateWebPage() {
        try {
            String json = servidorRemoto.getHorarioDeAtendimento();
            // Implemente o código para popular a página web com base no JSON.
            // Retorna true se o processo foi bem-sucedido e false em caso de falha.
            return true; // Substitua pela lógica real de população da página.
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
