package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.Superviseur;
import com.sms2i.gestionIntervention.repository.SuperviseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperviseurService extends GenericService<Superviseur,Long, SuperviseurRepository> {
    @Autowired
    public SuperviseurService(SuperviseurRepository repository) {
        super(repository);
    }
}
