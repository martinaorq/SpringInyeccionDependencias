package com.martina.archivo2.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements PersonaR {
    private static Logger LOG= LoggerFactory.getLogger(PersonaRepoImpl.class);

    @Override
    public void registrar(String p) {
        LOG.info("Se registro a: "+p);
    }
}
