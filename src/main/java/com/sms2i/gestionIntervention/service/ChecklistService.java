package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Checklist;
import com.sms2i.gestionIntervention.model.Materiel;
import com.sms2i.gestionIntervention.repository.ChecklistRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ChecklistService extends GenericService<Checklist,Long, ChecklistRepository> {

    public Checklist getByName(String modelName){
        return repository.findByNomModele(modelName);
    }

    @Override
    public Checklist add(Checklist checklist) {
        Set<Materiel> materiels= checklist.getMateriels();
        checklist.setMateriels(null);
        repository.save(checklist);
        checklist.setMateriels(materiels);
        return repository.save(checklist);
    }
}
