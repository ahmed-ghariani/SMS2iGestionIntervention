package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.BonIntervention;
import com.sms2i.gestionIntervention.model.GroupeTags;
import com.sms2i.gestionIntervention.model.Tags;
import com.sms2i.gestionIntervention.repository.BonInterventionRepository;
import com.sms2i.gestionIntervention.repository.GroupeTagssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BonInterventionService extends GenericService<BonIntervention,Long, BonInterventionRepository> {
    @Autowired
    GroupeTagssRepository groupeTagssRepository;

    @Autowired
    public BonInterventionService(BonInterventionRepository repository) {
        super(repository);
    }

    public Set<BonIntervention> findByTags (Set<Tags> tags){
        return repository.findAllByTagsIn(tags);
    }

    public Set<BonIntervention> findByGroupe (Long groupeId){
        GroupeTags groupe= groupeTagssRepository.getReferenceById(groupeId);
        return repository.findAllByTagsIn(groupe.getTags());
    }
}
