package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.SoftwareCategorie;
import com.sms2i.gestionIntervention.service.SoftwareCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/softwareCategorie")
public class SoftwareCategorieController extends GenericController<SoftwareCategorie,Long, SoftwareCategorieService> {

    @Autowired
    public SoftwareCategorieController(SoftwareCategorieService service) {
        super(service);
    }
}
