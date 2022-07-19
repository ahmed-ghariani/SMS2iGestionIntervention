package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.Materiel;
import com.sms2i.gestionIntervention.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materiel")
public class MaterielController extends GenericController<Materiel,Long, MaterielService> {
    @Autowired
    public MaterielController(MaterielService service) {
        super(service);
    }
}
