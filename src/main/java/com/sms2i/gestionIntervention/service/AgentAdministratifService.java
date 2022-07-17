package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.AgentAdministratif;
import com.sms2i.gestionIntervention.repository.AgentAdministratifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentAdministratifService extends GenericService<AgentAdministratif,Long, AgentAdministratifRepository> {

    @Autowired
    public AgentAdministratifService(AgentAdministratifRepository repository) {
        super(repository);
    }
}
