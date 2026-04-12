package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String director;

    public Filme(String nome) {
        this.setNome(nome);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
