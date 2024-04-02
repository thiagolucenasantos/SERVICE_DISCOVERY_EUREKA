package br.com.thiago.apiteste2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApiTeste2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiTeste2Application.class, args);
	}

}

@RestController
@RequestMapping(path = "/cliente2")
class ClienteDois {
    @GetMapping
    public String Oladois(){
        return "Eu sou o cliente 2";
    }

}