import br.inatel.cdg.serie.impl.Observador;
import br.inatel.cdg.serie.impl.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testeContarTodasPalavras() {
        Observavel netflix = new Observavel();
        Observador obs = new Observador(1);
        netflix.registraObservador(obs);

        String inputSentence = "Voce é a Vergonha da Profissao";
        String[] words = inputSentence.split("\\s+");
        netflix.notificaObservadores(words);

        assertEquals(obs.getTotalPalavras(), words.length);
    }

    @Test
    public void testeContarPalavrasComCaracteresPares() {
        Observavel netflix = new Observavel();
        Observador obs = new Observador(1);
        netflix.registraObservador(obs);

        String inputSentence = "Voce é a Vergonha da Profissao";
        String[] words = inputSentence.split("\\s+");
        netflix.notificaObservadores(words);

        int palavrasComCaracteresParesEsperadas = obs.getPalavrasPares();

        assertEquals(palavrasComCaracteresParesEsperadas, obs.getPalavrasPares());
    }

    @Test
    public void testeContarPalavrasMaiusculas() {
        Observavel netflix = new Observavel();
        Observador obs = new Observador(1);
        netflix.registraObservador(obs);

        String inputSentence = "Voce é a Vergonha da Profissao";
        String[] words = inputSentence.split("\\s+");
        netflix.notificaObservadores(words);

        int palavrasMaiusculasEsperadas = obs.getPalavrasMaiusculas();

        assertEquals(palavrasMaiusculasEsperadas, obs.getPalavrasMaiusculas());
    }
}
