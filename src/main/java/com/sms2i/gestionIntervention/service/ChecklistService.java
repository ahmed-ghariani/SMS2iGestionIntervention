package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Checklist;
import com.sms2i.gestionIntervention.repository.ChecklistRepository;
import org.springframework.stereotype.Service;

@Service
public class ChecklistService extends GenericService<Checklist,Long, ChecklistRepository> {
}
