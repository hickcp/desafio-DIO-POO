package br.com.desafio.domain;

public abstract class Conteudo { //classe abstrata -> Não consegue criar um conteudo (Conteudo conteudo = new Conteudo)
    //Classe Conteudo serve para implementar os atributos na classe filha para evitar a repetição de código
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
