package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.SoftwareCategorie;
import com.sms2i.gestionIntervention.repository.SoftwareCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftwareCategorieService extends GenericService<SoftwareCategorie,Long, SoftwareCategorieRepository> {

    @Autowired
    public  SoftwareCategorieService(SoftwareCategorieRepository repository) {
        super(repository);
    }
}
