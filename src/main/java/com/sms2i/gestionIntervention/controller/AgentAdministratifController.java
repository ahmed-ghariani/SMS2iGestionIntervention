package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.AgentAdministratif;
import com.sms2i.gestionIntervention.service.AgentAdministratifService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agentAdministratif")
public class AgentAdministratifController extends GenericController<AgentAdministratif,Long, AgentAdministratifService> {
}
