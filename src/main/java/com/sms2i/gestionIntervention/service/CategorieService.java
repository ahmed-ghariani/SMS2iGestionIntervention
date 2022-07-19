package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.Categorie;
import com.sms2i.gestionIntervention.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService extends GenericService<Categorie,Long, CategorieRepository> {

    @Autowired
    public CategorieService(CategorieRepository repository) {
        super(repository);
    }

    public Categorie getByName(String name){
        return repository.findFirstByCategorieName(name);
    }
}
