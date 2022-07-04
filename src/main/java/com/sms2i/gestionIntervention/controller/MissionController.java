package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.service.MissionService;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missions")
public class MissionController extends GenericController<Mission,Long,MissionService> {
}

