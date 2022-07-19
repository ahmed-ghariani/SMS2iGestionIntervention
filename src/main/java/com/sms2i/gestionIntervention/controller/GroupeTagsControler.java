package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.GroupeTags;
import com.sms2i.gestionIntervention.service.GroupeTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groupeTags")
public class GroupeTagsControler extends GenericController<GroupeTags,Long, GroupeTagsService> {
    @Autowired
    public GroupeTagsControler(GroupeTagsService service) {
        super(service);
    }
}
