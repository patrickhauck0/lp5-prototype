package org.example.prototype;

public class Movie implements Cloneable {
    private String titulo;
    private TipoFilme tipoFilme;
    private double bilheteria;
    private int avaliacao;

    public Movie(String titulo, TipoFilme tipoFilme, double bilheteria, int avaliacao) {
        this.titulo = titulo;
        this.tipoFilme = tipoFilme;
        this.bilheteria = bilheteria;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TipoFilme getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(TipoFilme tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public double getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(double bilheteria) {
        this.bilheteria = bilheteria;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        Movie movieClone = (Movie) super.clone();
        movieClone.tipoFilme = (TipoFilme) movieClone.tipoFilme.clone();
        return movieClone;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titulo=" + titulo +
                ", tipoFilme=" + tipoFilme +
                ", bilheteria=" + bilheteria +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
