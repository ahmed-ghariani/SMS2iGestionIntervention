package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.Materiel;
import com.sms2i.gestionIntervention.repository.Materielrepository;
import org.springframework.stereotype.Service;

@Service
public class MaterielService extends GenericService<Materiel,Long, Materielrepository> {
}
