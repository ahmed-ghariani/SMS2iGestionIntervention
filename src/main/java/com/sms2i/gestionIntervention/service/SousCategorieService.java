package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.repository.SousCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SousCategorieService extends GenericService<SousCategorie,Long, SousCategorieRepository> {
    @Autowired
    public SousCategorieService(SousCategorieRepository repository) {
        super(repository);
    }

    @Autowired
    CategorieService categorie;

    public List<SousCategorie> getAllByCategorie(String name) {
        return repository.findAllByCategorie(categorie.getByName(name));
    }
}
