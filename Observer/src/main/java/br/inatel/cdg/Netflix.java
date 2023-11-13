package br.inatel.cdg;

import br.inatel.cdg.serie.impl.Observavel;
import br.inatel.cdg.serie.impl.Observador;

public class Netflix {
    public static void main(String[] args) {
        Observavel netflix = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        netflix.registraObservador(obs1);
        netflix.registraObservador(obs2);
        netflix.registraObservador(obs3);

        String inputSentence = "Voce é a Vergonha da Profissao";

        System.out.println("Frase de entrada: " + inputSentence);

        String[] words = inputSentence.split("\\s+");
        netflix.notificaObservadores(words);
    }
}
