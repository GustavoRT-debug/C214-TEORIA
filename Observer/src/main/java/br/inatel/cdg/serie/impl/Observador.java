package br.inatel.cdg.serie.impl;

import br.inatel.cdg.serie.interfaces.iObservador;

public class Observador implements iObservador {
    int id;
    private int totalPalavras;
    private int palavrasPares;
    private int palavrasMaiusculas;

    public Observador(int id) {
        this.id = id;
    }

    public void update(String[] words) {
        totalPalavras = words.length;
        palavrasPares = contarPalavrasComCaracteresPares(words);
        palavrasMaiusculas = contarPalavrasMaiusculas(words);

        System.out.println("Cliente: " + this.id);
        System.out.println("Total de palavras: " + totalPalavras);
        System.out.println("Palavras com comprimento par: " + palavrasPares);
        System.out.println("Palavras começadas com maiúsculas: " + palavrasMaiusculas);
    }

    private int contarPalavrasComCaracteresPares(String[] words) {
        int count = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int contarPalavrasMaiusculas(String[] words) {
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }
        return count;
    }

    public int getTotalPalavras() {
        return totalPalavras;
    }

    public int getPalavrasPares() {
        return palavrasPares;
    }

    public int getPalavrasMaiusculas() {
        return palavrasMaiusculas;
    }

    @Override
    public void update(Observavel netflix) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
