package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.Client;
import com.sms2i.gestionIntervention.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends GenericService<Client,Long, ClientRepository>{
    @Autowired
    public ClientService(ClientRepository repository) {
        super(repository);
    }
}
