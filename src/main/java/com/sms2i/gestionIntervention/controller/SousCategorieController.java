package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.service.SousCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sousCategorie")
public class SousCategorieController extends GenericController<SousCategorie,Long, SousCategorieService>{

    @Autowired
    public SousCategorieController(SousCategorieService service) {
        super(service);
    }

    @GetMapping("/search/categorie/{name}")
    List<SousCategorie> getAllByCategorieName(@PathVariable String name){
        return service.getAllByCategorie(name);
    }
}
