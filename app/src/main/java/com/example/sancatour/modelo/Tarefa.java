package com.example.sancatour.modelo;

public class Tarefa {

 private String nome;
 private Double distancia;
 private String imagesrc;



    public Tarefa(){

    }

    public Tarefa(String nome, Double distancia, String imagesrc) {
        this.nome = nome;
        this.distancia = distancia;
        this.imagesrc = imagesrc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", distancia=" + distancia +
                ", imagesrc='" + imagesrc + '\'' +
                '}';
    }
}
