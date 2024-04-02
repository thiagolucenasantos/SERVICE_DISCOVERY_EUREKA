package br.com.thiago.apiteste1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApiTeste1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiTeste1Application.class, args);
	}

}

@RestController
@RequestMapping("Cliente1")
 class ClienteUm {

    @GetMapping
    public String Cliente1(){
        return "Olá";
    }

}

