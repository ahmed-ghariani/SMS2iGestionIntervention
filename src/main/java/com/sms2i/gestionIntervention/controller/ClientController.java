package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.Client;
import com.sms2i.gestionIntervention.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController extends GenericController<Client,Long, ClientService> {
    @Autowired
    ClientController(ClientService service) {
        super(service);
    }
}
