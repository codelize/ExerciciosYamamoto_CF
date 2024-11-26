package br.com.exercicio3;

import java.util.HashSet;

public class Estado {
    private String sigla;
    private HashSet<Integer> ddds;

    public Estado(String sigla) {
        this.sigla = sigla.toUpperCase();
        this.ddds = new HashSet<>();
    }

    public String getSigla() {
        return sigla;
    }

    public HashSet<Integer> getDdds() {
        return ddds;
    }

    public void adicionarDdd(int ddd) {
        ddds.add(ddd);
    }

    @Override
    public String toString() {
        return "Estado: " + sigla + ", DDDs: " + ddds;
    }
}
