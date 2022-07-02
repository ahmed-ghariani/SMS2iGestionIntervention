package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Tags;
import com.sms2i.gestionIntervention.service.TagsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tags")
public class TagsController extends GenericController<Tags,Long, TagsService> {
}
