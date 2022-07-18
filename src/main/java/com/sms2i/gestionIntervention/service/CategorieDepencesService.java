package com.sms2i.gestionIntervention.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms2i.gestionIntervention.model.CategorieDepences;
import com.sms2i.gestionIntervention.repository.CategorieDepencesRepository;

@Service

public class CategorieDepencesService extends GenericService<CategorieDepences,Long, CategorieDepencesRepository> {

    @Autowired
    CategorieDepencesService(CategorieDepencesRepository repository) {
        super(repository);
    }
}
