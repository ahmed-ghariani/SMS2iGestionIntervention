package com.sms2i.gestionIntervention.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms2i.gestionIntervention.model.CategorieDepences;
import com.sms2i.gestionIntervention.service.CategorieDepencesService;

@RestController
@RequestMapping("/CategorieDepences")

public class CatregorieDepencesController extends GenericController<CategorieDepences, Long, CategorieDepencesService> {

    @Autowired
    public CatregorieDepencesController(CategorieDepencesService service) {
        super(service);
    }
}
