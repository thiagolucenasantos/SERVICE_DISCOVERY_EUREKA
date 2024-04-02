package br.com.thiago.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Cliente2")
public class ClienteDois {
    @GetMapping
    public String Oladois(){
        return "Eu sou o cliente 2";
    }


}
