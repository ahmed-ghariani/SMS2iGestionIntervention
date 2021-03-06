package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.GroupeTags;
import com.sms2i.gestionIntervention.repository.GroupeTagssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupeTagsService extends GenericService<GroupeTags,Long, GroupeTagssRepository> {
    @Autowired
    public GroupeTagsService(GroupeTagssRepository repository) {
        super(repository);
    }
}
