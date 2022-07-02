package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Software;
import com.sms2i.gestionIntervention.service.SoftwareService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Software")
public class SoftwareController extends GenericController<Software,Long, SoftwareService> {

}
