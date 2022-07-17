package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.CheckListModel;
import com.sms2i.gestionIntervention.model.Checklist;
import com.sms2i.gestionIntervention.repository.CheckListModelRepository;
import com.sms2i.gestionIntervention.repository.ChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class ChecklistService extends GenericService<Checklist,Long, ChecklistRepository> {

    CheckListModelRepository modelRepository;
    @Autowired
    public ChecklistService(ChecklistRepository repository, CheckListModelRepository modelRepository) {
        super(repository);
        this.modelRepository=modelRepository;
    }


    @Override
    public Checklist add(Checklist checklist) {
        Checklist finalChecklist = checklist;
        finalChecklist.setSoftwares(new HashSet<>());
        finalChecklist.setMateriels(new HashSet<>());
        CheckListModel model = modelRepository.getReferenceById(checklist.getModel().getId());
        model.getMateriels().forEach(materiel -> finalChecklist.getMateriels().add(materiel));
        model.getSoftwares().forEach(software -> finalChecklist.getSoftwares().add(software));
        return repository.save(finalChecklist);
    }
}
