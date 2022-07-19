package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.Technicien;
import com.sms2i.gestionIntervention.repository.TechnicienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicienService extends GenericService<Technicien,Long, TechnicienRepository> {
    @Autowired
    public TechnicienService(TechnicienRepository repository) {
        super(repository);
    }
}
