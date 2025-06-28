package com.clinica_veterinaria.service;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    public String animal(String name) {
        return "Hello World " + name;
    }
}
