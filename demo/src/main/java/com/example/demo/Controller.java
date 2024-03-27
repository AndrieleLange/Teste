package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class Controller {
    ArrayList<Livros> livros = new ArrayList<>();
    public Controller(){
        livros.add(new Livros(1, "O Mulato", "Aluísio Azevedo"));
        livros.add(new Livros(2, "O cortiço", "Aluísio Azevedo"));
        livros.add(new Livros(3, "Casa de pensão", "Aluísio Azevedo"));


    }
    @GetMapping("/")
    @CrossOrigin(origins = "*") // quem vai acessar
    public String getSaudacao() {
        return "Bem-vindo a biblioteca central!";
    }
    @GetMapping("/livros")
    @CrossOrigin(origins = "*")
    public ArrayList<Livros> getLivros() {
        return livros;
        
    }
    
    
}
