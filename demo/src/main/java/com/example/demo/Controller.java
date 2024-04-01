package com.example.demo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private List<Livros> livros;

    public Controller() {
        livros = new LinkedList<>();
        livros.add(new Livros(100, "Aprendendo Spring-Boot", "Huguinho Pato"));
        livros.add(new Livros(120, "Aprendendo Java", "Zezinho Pato"));
        livros.add(new Livros(140, "Aprendendo Outra coisa", "Luizinho Pato"));
        livros.add(new Livros(140, "Aprendendo Uma coisa nova", "Huguinho Pato"));
        livros.add(new Livros(140, "Aprendendo Outra coisa nova", "Huguinho Pato"));
    }

    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String mensagemDeBemVindo() {
        return "Bem vindo a biblioteca central!";
    }

    @GetMapping("livros")
    @CrossOrigin(origins = "*")
    public List<Livros> getListaLivros() {
        return livros;
    }

    @GetMapping("autores")
    @CrossOrigin(origins = "*")
    public List<String> getListaAutores() {
        return livros.stream()
                .map(l -> l.getAutor())
                .distinct()
                .toList();
    }

    @GetMapping("titulos")
    @CrossOrigin(origins = "*")
    public List<String> getListaTitulos() {
        return livros.stream()
                .map(l -> l.getTitulo())
                .toList();
    }
}