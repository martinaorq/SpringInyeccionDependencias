package com.martina.archivo2.service;

import com.martina.archivo2.repository.PersonaR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaSer implements Persona{
    @Autowired
    private PersonaR persona;
    @Override
    public void registrar(String s) {
        persona.registrar(s);
    }
}
