package br.inatel.cdg.serie.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.serie.interfaces.iObservavel;

public class Observavel implements iObservavel {
    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        clientes.remove(obs);
    }

    @Override
    public void notificaObservadores(String[] words) {
        for (Observador observador : clientes) {
            observador.update(words);
        }
    }
}
