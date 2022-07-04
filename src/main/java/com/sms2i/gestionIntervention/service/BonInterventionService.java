package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.BonIntervention;
import com.sms2i.gestionIntervention.model.Tags;
import com.sms2i.gestionIntervention.repository.BonInterventionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BonInterventionService extends GenericService<BonIntervention,Long, BonInterventionRepository> {
    public Set<BonIntervention> findByTags (Set<Tags> tags){

        return repository.findAllByTagsIn(tags);
    }
}
