package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.service.SousCategorieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sousCategorie")
public class SousCategorieController extends GenericController<SousCategorie,Long, SousCategorieService>{
}
