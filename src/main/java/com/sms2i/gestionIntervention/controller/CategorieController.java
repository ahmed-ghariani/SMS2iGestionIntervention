package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.Categorie;
import com.sms2i.gestionIntervention.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorie")
public class CategorieController extends GenericController<Categorie,Long, CategorieService> {

    @Autowired
    public CategorieController(CategorieService service) {
        super(service);
    }
}
