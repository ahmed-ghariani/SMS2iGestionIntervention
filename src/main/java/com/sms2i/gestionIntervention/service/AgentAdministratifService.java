package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.AgentAdministratif;
import com.sms2i.gestionIntervention.model.Superviseur;
import com.sms2i.gestionIntervention.repository.AgentAdministratifRepository;
import com.sms2i.gestionIntervention.repository.SuperviseurRepository;
import org.springframework.stereotype.Service;

@Service
public class AgentAdministratifService extends GenericService<AgentAdministratif,Long, AgentAdministratifRepository> {
}
