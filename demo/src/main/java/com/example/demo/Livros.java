package com.example.demo;

public class Livros {
    private int id;
    private String titulo;
    private String autor;

    public Livros(int id, String titulo, String autor){
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
    }

    public int getId(){
        return id;
    }

    public String getTitulo()
    { return titulo;}

    public String getAutor(){return autor;}
}
