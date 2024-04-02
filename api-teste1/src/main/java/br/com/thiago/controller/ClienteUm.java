package br.com.thiago.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Cliente1")
public class ClienteUm {

    @GetMapping
    public String hello(){
        return "Olá";
    }

}
