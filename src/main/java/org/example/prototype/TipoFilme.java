package org.example.prototype;

public class TipoFilme implements Cloneable {
    private String diretor;
    private String genero;
    private int duracao;

    public TipoFilme(String diretor, String genero, int duracao) {
        super();
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "TipoFilme{" +
                "diretor='" + diretor + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

}
