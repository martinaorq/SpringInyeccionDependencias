package com.martina.archivo2;

import com.martina.archivo2.service.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Archivo2Application implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(Archivo2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Archivo2Application.class, args);
	}

    @Autowired
    private Persona persona;

	@Override
	public void run(String... args) throws Exception {
        persona.registrar("Martina Orquera");
	}
}
