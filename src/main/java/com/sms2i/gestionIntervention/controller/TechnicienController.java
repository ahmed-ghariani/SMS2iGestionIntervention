package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.Technicien;
import com.sms2i.gestionIntervention.service.TechnicienService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/technicien")
public class TechnicienController extends GenericController<Technicien,Long, TechnicienService> {
}
