package br.com.desafio.domain;

public class Curso {
    private String titulo; //Atributos
    private String descreicao;
    private Integer cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescreicao() {
        return descreicao;
    }

    public void setDescreicao(String descreicao) {
        this.descreicao = descreicao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descreicao='" + descreicao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
