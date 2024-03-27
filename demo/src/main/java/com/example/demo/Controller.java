package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private List<Livros> livros;
    public Controller(){
        livros = new LinkedList<>;
        livros.add(new Livro(1, "O Mulato", "Aluísio Azevedo"));
        livros.add(new Livro(2, "O cortiço", "Aluísio Azevedo"));
        livros.add(new Livro(3, "Casa de pensão", "Aluísio Azevedo"));


    }
    @GetMapping("/")
    @CrossOrigin(origins = "*") // quem vai acessar
    public String getSaudacao() {
        return "Bem-vindo a biblioteca central!";
    }
    @GetMapping("/livros")
    @CrossOrigin(origins = "*")
    public String getLivros() {
        return "Lista de livros";
    }
    
    
}
