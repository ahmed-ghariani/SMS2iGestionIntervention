package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.GroupeTags;
import com.sms2i.gestionIntervention.service.GroupeTagsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groupeTags")
public class GroupeTagsControler extends GenericController<GroupeTags,Long, GroupeTagsService> {
}