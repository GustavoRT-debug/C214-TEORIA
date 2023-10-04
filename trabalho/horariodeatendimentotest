package com.inatel.web;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class HorarioAtendimentoPopulatorTest {

    private HorarioAtendimentoPopulator populator;
    private ServidorRemoto servidorRemoto;

    @Before
    public void setUp() {
        servidorRemoto = mock(ServidorRemoto.class);
        populator = new HorarioAtendimentoPopulator(servidorRemoto);
    }

    @Test
    public void testPopulateWebPageSuccess() {
        // Simule a resposta do servidor remoto (JSON válido)
        String json = "{\"nomeDoProfessor\": \"Nome do Professor\", \"horarioDeAtendimento\": \"08:00 - 10:00\", \"periodo\": \"integral\", \"sala\": \"1\", \"predio\": [\"1\", \"2\", \"3\", \"4\", \"6\"]}";
        when(servidorRemoto.getHorarioDeAtendimento()).thenReturn(json);

        boolean result = populator.populateWebPage();

        assertTrue(result);
        // Adicione mais asserções para verificar o conteúdo da página web populada.
    }

    @Test
    public void testPopulateWebPageFailureInvalidJSON() {
        // Simule uma resposta inválida do servidor remoto (JSON inválido)
        String invalidJson = "Isso não é um JSON válido";
        when(servidorRemoto.getHorarioDeAtendimento()).thenReturn(invalidJson);

        boolean result = populator.populateWebPage();

        assertFalse(result);
    }

    @Test
    public void testPopulateWebPageFailureServerError() {
        // Simule um erro no servidor remoto
        when(servidorRemoto.getHorarioDeAtendimento()).thenThrow(new RuntimeException("Erro no servidor"));

        boolean result = populator.populateWebPage();

        assertFalse(result);
    }

    // Adicione mais testes de sucesso e de falha conforme necessário
}
