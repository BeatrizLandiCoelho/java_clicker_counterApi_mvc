package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Clicker;

@RestController
public class ClickerController {


    //final trasforma a variavel em constante, ela nao pode ser sobre esrcrita deixandoa imutavel
    private static final String template = "Hello, %s!"; 
    private final AtomicLong counter = new AtomicLong();
    private final AtomicLong counterClicker = new AtomicLong();

    
    @GetMapping("/click")
    public Clicker clicker (@RequestParam(value = "name",defaultValue = "user")String name){

        return new Clicker(counter.incrementAndGet(), counterClicker.incrementAndGet() ,String.format(template,name));
    }
}
