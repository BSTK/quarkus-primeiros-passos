package dev.bstk;

import java.io.Serializable;

public class Tecnologia implements Serializable {

    private final String nome;

    public Tecnologia(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
