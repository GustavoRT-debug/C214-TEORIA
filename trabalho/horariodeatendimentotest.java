import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HorarioAtendimentoTest {

    @Test
    public void testHorarioAtendimentoSucesso() {

        HorarioAtendimento horario = new HorarioAtendimento();
        String json = "{\"professor\": \"João Paulo\", \"sala\": 3, \"horario\": \"08:00 - 09:30\"}";
        boolean resultado = horario.popularPaginaWeb(json);

        assertTrue(resultado);
    }

    @Test
    public void testHorarioAtendimentoFalha() {
       
        HorarioAtendimento horario = new HorarioAtendimento();
        String jsonInvalido = "{\"professor\": \"Maria\", \"sala\": 15, \"horario\": \"10:00 - 11:30\"}";
        boolean resultado = horario.popularPaginaWeb(jsonInvalido);

        assertFalse(resultado);
    }
}