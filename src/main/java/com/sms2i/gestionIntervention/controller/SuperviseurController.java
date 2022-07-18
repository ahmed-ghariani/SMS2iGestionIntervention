package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.Superviseur;
import com.sms2i.gestionIntervention.service.SuperviseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/superviseur")
public class SuperviseurController extends GenericController<Superviseur,Long, SuperviseurService> {
    @Autowired
    public SuperviseurController(SuperviseurService service) {
        super(service);
    }
}
