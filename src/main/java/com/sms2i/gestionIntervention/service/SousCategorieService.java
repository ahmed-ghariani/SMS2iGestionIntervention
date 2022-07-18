package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.repository.SousCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SousCategorieService extends GenericService<SousCategorie,Long, SousCategorieRepository> {
    @Autowired
    public SousCategorieService(SousCategorieRepository repository) {
        super(repository);
    }
}
