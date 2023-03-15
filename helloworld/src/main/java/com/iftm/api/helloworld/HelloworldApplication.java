package com.iftm.api.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@SpringBootApplication

public class HelloworldApplication {
    public static void main (String[] args) {SpringApplication.run(HelloworldApplication.class,args);}
    @GetMapping("/mundo/")
    public String helloWorld() {
        return "Olá, mundo!";
    }

    @GetMapping("produtos")
    public List<Product> getProduct() {
        var listaDeProdutos = new ArrayList<Product>();
        listaDeProdutos.add(new Product("Televisão",2.000));
        listaDeProdutos.add(new Product("Cama",1000.00));
        listaDeProdutos.add(new Product("Armário",500.00));
        listaDeProdutos.add(new Product("Mesa",90.00));

        return listaDeProdutos;
    }


    @GetMapping("cliente")
    public Client getClient() {
        return new Client("Fernanda" , 45,getProduct());

    }


}
