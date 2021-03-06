package com.sms2i.gestionIntervention.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms2i.gestionIntervention.model.Deplacement;
import com.sms2i.gestionIntervention.repository.DeplacementRepository;

@Service
public class DeplacementService extends GenericService<Deplacement, Long, DeplacementRepository>{

    @Autowired
    public DeplacementService(DeplacementRepository repository) {
        super(repository);
    }
}
