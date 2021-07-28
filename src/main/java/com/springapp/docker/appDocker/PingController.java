package com.springapp.docker.appDocker;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void ping(){
        System.out.println("Tudo funcionando!");
    }
}
